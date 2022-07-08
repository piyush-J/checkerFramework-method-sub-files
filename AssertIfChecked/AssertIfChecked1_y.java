import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public class AssertIfChecked1_y {

    boolean variable_1 = false;

    @Nullable Object variable_2;

    @EnsuresNonNullIf(result = true, expression = "value")
    // :: error: (contracts.conditional.postcondition.invalid.returntype)
    public void method_1() {
        //dummy_lines
    }
}