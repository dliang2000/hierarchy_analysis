package ca.uwaterloo.liang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import soot.Local;
import soot.SootMethod;
import soot.toolkits.scalar.ArraySparseSet;
import soot.toolkits.scalar.FlowSet;

public class ProcSummary {
    
    private static FlowSet<Local> emptyFlowSet = new ArraySparseSet();
    
    private FlowSet<Local> myMocks;
    private ArrayList<SootMethod> myInvokedMethods;
    private Map<Local, Boolean> possiblyMocks;
    private Map<Local, Boolean> isCollectionMocks;
    private Map<Local, Boolean> isArrayMocks;
    private SootMethod mySootMethod;
    
    public ProcSummary(SootMethod aSootMethod) {
        mySootMethod = aSootMethod;
        myMocks = emptyFlowSet.clone();
    }
    
    public FlowSet<Local> getMocks() {
        return myMocks;
    }
    
    public void setMocks(FlowSet<Local> myMocks) {
        this.myMocks = myMocks;
    }
    
    public SootMethod getSootMethod() {
        return mySootMethod;
    }
    
    public void setSootMethod(SootMethod mySootMethod) {
        this.mySootMethod = mySootMethod;
    }

    public ArrayList<SootMethod> getInvokedMethods() {
        return myInvokedMethods;
    }

    public void setInvokedMethods(ArrayList<SootMethod> myInvokedMethods) {
        this.myInvokedMethods = myInvokedMethods;
    }
    
    public Map<Local, Boolean> getPossiblyMocks() {
        return possiblyMocks;
    }

    public void setPossiblyMocks(Map<Local, Boolean> possiblyMocks) {
        this.possiblyMocks = possiblyMocks;
    }
    
}
