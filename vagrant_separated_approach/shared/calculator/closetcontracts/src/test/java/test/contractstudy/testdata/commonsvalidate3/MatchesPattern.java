package test.contractstudy.testdata.commonsvalidate3;

import static org.apache.commons.lang3.Validate.*;

public class MatchesPattern {
	public static void foo(int i) {
		matchesPattern("foo","foo*","some message");
	}
}
