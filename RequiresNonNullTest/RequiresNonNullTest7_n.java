import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.Pure;

public class RequiresNonNullTest7_n {

    @Nullable Object variable_1;
    @Nullable Object variable_2;

    protected @Nullable Object variable_3;
    //dummy_lines
    protected static @Nullable Object variable_4;

    @Pure
    @RequiresNonNull("staticfield")
    // :: warning: (purity.deterministic.void.method)
    public void method_1() {
        method_2();
    }

    @Pure
    @RequiresNonNull("RequiresNonNullTest.staticfield")
    // :: warning: (purity.deterministic.void.method)
    public void method_2() {
        method_1();
    }
}