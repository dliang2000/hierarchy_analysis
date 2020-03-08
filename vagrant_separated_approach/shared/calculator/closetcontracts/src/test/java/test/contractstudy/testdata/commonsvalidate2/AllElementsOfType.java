package test.contractstudy.testdata.commonsvalidate2;

import static org.apache.commons.lang.Validate.*;
import java.util.List;

public class AllElementsOfType {
	public static void foo(List list) {
		allElementsOfType(list,String.class,"all elements in list must be strings");
	}
}
