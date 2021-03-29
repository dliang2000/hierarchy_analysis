package ca.uwaterloo.liang;
/* Soot - a J*va Optimization Framework
 * Copyright (C) 2003 Navindra Umanee <navindra@cs.mcgill.ca>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

import java.util.*;

import soot.*;
import soot.jimple.InvokeExpr;
import soot.jimple.Stmt;
import soot.options.*;
import soot.toolkits.graph.*;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.FlowSet;
import soot.toolkits.scalar.ForwardFlowAnalysis;

/**
 * Find all locals that are mocks
 * 
 *
 * @author David Liang
 **/

/**
 * Flow analysis to determine all locals guaranteed to be defined at a
 * given program point.
 **/
public class MockAnalysis extends ForwardFlowAnalysis<Unit, FlowSet<Local>> {

    private static ArrayList<SootMethod> emptyInvokedMethods = new ArrayList<SootMethod>();
    
    private static FlowSet<Local> emptyFlowSet = new ArraySparseSet() ;
    
    private static HashMap<Unit, HashMap<Local, Boolean>> emptyPossiblyMocks = new HashMap<Unit, HashMap<Local, Boolean>>();
    
    private static HashMap<Unit, HashMap<Local, Boolean>> emptyCollectionMocks = new HashMap<Unit, HashMap<Local, Boolean>>();
    
    private static HashMap<Unit, HashMap<Local, Boolean>> emptyArrayMocks = new HashMap<Unit, HashMap<Local, Boolean>>();
    
    //Contains all the affects information of the analyzed method
    private FlowSet<Local> myMocksInfo;
    
    //Contains all the invoked methods by the method under analysis
    private ArrayList<SootMethod> myInvokedMethods;
    
    // For each unit x local, will store a boolean for if it is a possible mock,
    // if is a possible mock within Collection, or if it is a possible mock within Array.
    // Right now, they are stored in three different maps. 
    // This may be updated into one combined map with three boolean.
    private HashMap<Unit, HashMap<Local, Boolean>> possiblyMocks;
    
    private HashMap<Unit, HashMap<Local, Boolean>> mayBeCollectionMocks;
    
    private HashMap<Unit, HashMap<Local, Boolean>> mayBeArrayMocks;
    
    @SuppressWarnings("unchecked")
    public MockAnalysis(UnitGraph graph) {
        super(graph);
        
        myInvokedMethods = (ArrayList<SootMethod>) emptyInvokedMethods.clone();
        
        possiblyMocks = (HashMap<Unit, HashMap<Local, Boolean>>) emptyPossiblyMocks.clone();
        
        mayBeCollectionMocks = (HashMap<Unit, HashMap<Local, Boolean>>) emptyCollectionMocks.clone();
        
        mayBeArrayMocks = (HashMap<Unit, HashMap<Local, Boolean>>) emptyArrayMocks.clone();
        
        myMocksInfo = emptyFlowSet.clone();
        
        doAnalysis();
    }
    
    @Override
    protected FlowSet<Local> newInitialFlow() { 
        return emptyFlowSet.clone();
    }
    
    @Override
    protected FlowSet<Local> entryInitialFlow() { 
        return emptyFlowSet.clone();
    }
    
    @Override
    protected void flowThrough(FlowSet<Local> in, Unit unit, FlowSet<Local> out) {
        Stmt aStmt = (Stmt) unit;
        
        //TODO: check that no library classes methods are put in the
        //invoked methods list
        if (notMock(aStmt)) {
            // This part tries to consider for the following scenarios:
            // X x = mock(...);
            // x = y; || x = new Object();
            // In both cases, the local defbox x was a mock object in line 1, but no longer
            // a mock object after line 2 (Missing: Still need to check for the useBox y)
            HashMap<Local, Boolean> running_result = new HashMap<Local, Boolean>();
            List<ValueBox> defBoxes = unit.getDefBoxes();
            for (ValueBox vb: defBoxes) {
                Local l = (Local) vb.getValue();
                running_result.put(l, false);
                if (myMocksInfo.contains(l))
                    myMocksInfo.remove(l);
            }
            possiblyMocks.put(unit, running_result);
            return;
        }
        if (aStmt.containsInvokeExpr()) {
            InvokeExpr invkExpr = aStmt.getInvokeExpr();
            SootMethod sootMethod = invkExpr.getMethod();
            myInvokedMethods.add(sootMethod);
            
            if (isMockAPI(sootMethod)) {
                HashMap<Local, Boolean> running_result = new HashMap<Local, Boolean>();
                List<ValueBox> defBoxes = unit.getDefBoxes();
                for (ValueBox vb: defBoxes) {
                    Local l = (Local) vb.getValue();
                    out.add(l);
                    running_result.put(l, true);
                }
                possiblyMocks.put(unit, running_result); 
            }
        }
        
        // Remove the local from out FlowSet with the following 
        myMocksInfo.union(out);
    }
    
    public ArrayList<SootMethod> getInvokedMethods() {
        return myInvokedMethods;
    }
    
    @Override
    protected void merge(FlowSet<Local> in1, FlowSet<Local> in2, FlowSet<Local> out) {
        in1.union(in2, out);
    }
    
    @Override
    protected void copy(FlowSet<Local> srcSet, FlowSet<Local> destSet) {
        srcSet.copy(destSet);
    }
    
    private static boolean notMock(Stmt stmt) {
        return (!stmt.containsInvokeExpr() || !isMockAPI(stmt.getInvokeExpr().getMethod()));
    }
    
    private static boolean isMockAPI(SootMethod method) {
        return (method.getSubSignature().equals(MockLibrary.EASYMOCK.subSignature()) 
                                || method.getSubSignature().equals(MockLibrary.MOCKITO.subSignature())
                                || method.getSubSignature().equals(MockLibrary.POWERMOCK.subSignature()));
    }
}
