import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public class AssertIfChecked4_y {

    boolean variable_1 = false;

    @Nullable Object variable_2;

    @EnsuresNonNullIf(result = false, expression = "value")
    // :: error: (contracts.conditional.postcondition.invalid.returntype)
    public Object method_1() {
        //dummy_lines
        return new Object();
    }
}