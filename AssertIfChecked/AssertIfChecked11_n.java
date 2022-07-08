import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public class AssertIfChecked11_n {

    boolean variable_1 = false;

    @Nullable Object variable_2;

    @EnsuresNonNullIf(result = true, expression = "#1")
    boolean method_1(final @Nullable Object variable_3) {
        //dummy_lines
        return variable_3 != null;
    }
}