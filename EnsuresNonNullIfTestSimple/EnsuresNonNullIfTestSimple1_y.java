import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/*
 * These tests ensure that EnsuresNonNullIf methods
 * are verified.
 */
public class EnsuresNonNullIfTestSimple1_y {

    protected int @Nullable [] variable_1;

    @EnsuresNonNullIf(result = true, expression = "values")
    public boolean method_1() {
        //dummy_lines
        // :: error: (contracts.conditional.postcondition.not.satisfied)
        return variable_1 == null;
    }
}