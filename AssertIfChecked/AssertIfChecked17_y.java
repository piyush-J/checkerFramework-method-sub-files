import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public class AssertIfChecked17_y {

    boolean variable_1 = false;

    @Nullable Object variable_2;

    @EnsuresNonNullIf(result = false, expression = "#1")
    boolean method_1(final @Nullable Object variable_3) {
        //dummy_lines
        // :: error: (contracts.conditional.postcondition.not.satisfied)
        return false;
    }
}