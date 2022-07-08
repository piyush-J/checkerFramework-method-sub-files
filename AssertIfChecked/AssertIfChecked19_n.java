import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public class AssertIfChecked19_n {

    boolean variable_1 = false;

    @Nullable Object variable_2;

    @org.checkerframework.dataflow.qual.Pure
    @Nullable Object method_1() {
        //dummy_lines
        return variable_2;
    }
}