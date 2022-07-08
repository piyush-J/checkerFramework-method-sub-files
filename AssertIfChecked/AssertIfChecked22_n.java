import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public class AssertIfChecked22_n {

    boolean variable_1 = false;

    @Nullable Object variable_2;

    @org.checkerframework.dataflow.qual.Pure

    @EnsuresNonNullIf(result = true, expression = "#1")
    public boolean method_2(@Nullable Object variable_3) {
        //dummy_lines
        return (variable_3 instanceof String) && equals((String) variable_3);
    }
}