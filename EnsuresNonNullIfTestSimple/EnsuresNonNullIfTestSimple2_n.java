import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/*
 * These tests ensure that EnsuresNonNullIf methods
 * are verified.
 */
public class EnsuresNonNullIfTestSimple2_n {

    protected int @Nullable [] variable_1;

    @EnsuresNonNullIf(result = false, expression = "values")
    public boolean method_1() {
        //dummy_lines
        return variable_1 == null;
    }
}