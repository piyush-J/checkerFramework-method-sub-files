import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public class AssertIfChecked7_n {

    boolean variable_1 = false;

    @Nullable Object variable_2;

    @EnsuresNonNullIf(result = false, expression = "value")
    public boolean method_1() {
        //dummy_lines
        return variable_2 == null;
    }
}