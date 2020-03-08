package test.contractstudy.testdata.diffrules;

import contractstudy.ContractElement;
import contractstudy.ConstraintType;
import contractstudy.ConstraintedArtefact;
import contractstudy.ProgramVersion;
import org.apache.commons.lang3.tuple.Pair;
import java.util.ArrayList;
import java.util.List;

/**
 * Some pairs of constraint lists to analyse with diff rules.
 * @author jens dietrich
 */
public class DiffTestData {

    // use for constraints in list1
    private static ContractElement constr1(ConstraintType type, String condition, String addInfo) {
        ContractElement mc = new ContractElement();
        mc.setProgramVersion(ProgramVersion.getOrCreate("test","1.0.0"));
        mc.setCuName("Foo.java");
        mc.setLineNo(42);
        mc.setMethodDeclaration("foo(int i)");
        mc.setCondition(condition);
        mc.setAdditionalInfo(addInfo);
        mc.setKind(type);
        mc.setConstraintedArtefact(ConstraintedArtefact.METHOD);
        return mc;
    }
    // use for constraints in list2
    private static ContractElement constr2(ConstraintType type, String condition, String addInfo) {
        ContractElement mc = new ContractElement();
        mc.setProgramVersion(ProgramVersion.getOrCreate("test","2.0.0"));
        mc.setCuName("Foo.java");
        mc.setLineNo(42);
        mc.setMethodDeclaration("foo(int i)");
        mc.setCondition(condition);
        mc.setAdditionalInfo(addInfo);
        mc.setKind(type);
        mc.setConstraintedArtefact(ConstraintedArtefact.METHOD);
        return mc;
    }

    public static Pair<List<ContractElement>,List<ContractElement>> unchanged1 = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr2(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> unchanged2 = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i<42","i must be less than 42"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr2(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i<42","i must be less than 42"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> orderChanged = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i<42","i must be less than 42"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i<42","i must be less than 42"));
                add(constr2(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> onlyAdditionalInfoChanged = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i<42","i must be less than 42"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr2(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i<42","i must be less than magic"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> typeChanged = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr2(ConstraintType.CommonsLangIsTrue,"i>0","i must be positive"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> orderAndAdditionalInfoChanged = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i<42","i must be less than 42"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i<42","i must be less than magic"));
                add(constr2(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> preconditionAdded1 = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr2(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i<42","i must be less than 42"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> preconditionAdded2 = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i<42","i must be less than 42"));
                add(constr2(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> preconditionAddedAndAdditionalInfoChanged = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr2(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must not be negate or zero"));
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i<42","i must be less than 42"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> preconditionRemoved1 = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i<42","i must be less than 42"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr2(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> preconditionRemoved2 = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i<42","i must be less than 42"));
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr2(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> preconditionRemovedAndAdditionalInfoChanged = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i<42","i must be less than 42"));
                add(constr1(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must be positive"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr2(ConstraintType.GuavaPreconditionCheckArgument,"i>0","i must not be negate or zero"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> postconditionRemoved1 = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR303Min,"0","result must be positive"));
                add(constr1(ConstraintType.JSR303Max,"42","result must be less than 42"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR303Min,"0","result must be positive"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> postconditionRemoved2 = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR303Min,"0","result must be positive"));
                add(constr1(ConstraintType.JSR303Max,"42","result must be less than 42"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR303Max,"42","result must be less than 42"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> postconditionAdded1 = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR303Min,"0","result must be positive"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR303Min,"0","result must be positive"));
                add(constr1(ConstraintType.JSR303Max,"42","result must be less than 42"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> postconditionAdded2 = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR303Max,"42","result must be less than 42"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR303Max,"42","result must be less than 42"));
                add(constr1(ConstraintType.JSR303Min,"0","result must be positive"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> postconditionAddedAndAdditionalInfoChanged = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR303Min,"0","result must be positive"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR303Min,"0","result must be non-negative and not zero"));
                add(constr1(ConstraintType.JSR303Max,"42","result must be less than 42"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> postconditionRemovedAndAdditionalInfoChanged = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR303Min,"0","result must be positive"));
                add(constr1(ConstraintType.JSR303Max,"42","result must be less than 42"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR303Min,"0","result must be non-negative and not zero"));
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> postconditionNullableRemoved1 = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR305Nullable,"","might be null"));
            }},
            new ArrayList<ContractElement>(){{
            }}
    );

    public static Pair<List<ContractElement>,List<ContractElement>> postconditionNullableRemoved2 = Pair.of(
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR303Null,"","might be null"));
                add(constr1(ConstraintType.JSR303Max,"42","result must be less than 42"));
            }},
            new ArrayList<ContractElement>(){{
                add(constr1(ConstraintType.JSR303Max,"42","result must be less than 42"));
            }}
    );

}
