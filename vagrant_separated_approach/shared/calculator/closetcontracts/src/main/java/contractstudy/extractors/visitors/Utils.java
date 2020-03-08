package contractstudy.extractors.visitors;

import com.github.javaparser.ast.expr.Expression;
import com.google.common.base.Preconditions;

import java.util.List;

/**
 * Misc useful utils.
 * @author jens dietrich
 */
public class Utils {
	/**
	 * Encode a message composed of several arguments into one string. This is commonly used in APIs.
	 * TODO: usually this is a pattern where the first arg is a template string, and all following params are args.
	 * We could encode it like this ! 
	 * @param args
	 * @param startPos
	 * @return
	 */
	static String encodeMessageArgs(List<Expression> args, int startPos) {
		Preconditions.checkArgument(startPos<=args.size());
		if (startPos==-1) return null; // no message
		String s = "";
		for (int i=startPos;i<args.size();i++) {
			if (i>startPos) s = s+ ",";
			s = s+args.get(i);
		}
		return s;
	}

    /**
     * Trim the return type from the descriptor used to identify methods.
     * @param desc
     * @return
     */
    public static final String trimRetType(String desc) {
        return desc.split(" ")[1];
    }
}
