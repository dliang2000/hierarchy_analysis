package contractstudy.extractors.visitors;

/**
 * Data structure to communicate how a class that has static members has been imported.
 * Example: consider a client using check method defined in com.google.common.base.Preconditions.
 * Then the options are: 
 * <ol>
 * <li>NONE - there is no import statement for com.google.common.base.Preconditions
 * <li>CLASS - the class or package has been imported: import com.google.common.base.Preconditions or import <li>NONE - there is no import statement for com.google.common.base.*
 * <li>ALL_STATIC - all static members have been imported: import static com.google.common.base.Preconditions.*
 * <li>SOME_STATIC - some static members have been imported: import static com.google.common.base.Preconditions.checkArgument
 * </ol>
 * @author jens dietrich
 */
public enum StaticImportState {
	NONE, CLASS , ALL_STATIC, SOME_STATIC 
}
