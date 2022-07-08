import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public class AssertIfChecked21_n {

    boolean variable_1 = false;

    @Nullable Object variable_2;

    @org.checkerframework.dataflow.qual.Pure
    @Nullable Object method_1() {
        return variable_2;
    }

    @EnsuresNonNullIf(result = true, expression = "#1")
    public static final boolean method_2(@Nullable String variable_3) {
        //dummy_lines
        return variable_3 != null && (variable_3.startsWith("//") || variable_3.startsWith("#"));
    }
}