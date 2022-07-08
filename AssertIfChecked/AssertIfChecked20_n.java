import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public class AssertIfChecked20_n {

    boolean variable_1 = false;

    @Nullable Object variable_2;

    @org.checkerframework.dataflow.qual.Pure
    @Nullable Object method_1() {
        return variable_2;
    }

    @EnsuresNonNullIf(result = true, expression = "getValuePure()")
    public boolean method_2() {
        //dummy_lines
        return method_1() != null;
    }
}