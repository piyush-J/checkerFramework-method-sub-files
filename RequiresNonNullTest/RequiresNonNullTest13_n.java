import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.Pure;

public class RequiresNonNullTest13_n {

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

    class inner_class_1 extends RequiresNonNullTest13_n {
        public void method_3(inner_class_1 variable_5) {
            //dummy_lines
            RequiresNonNullTest13_n.variable_4 = new Object();
            variable_5.method_2();

            variable_4 = new Object();
            variable_5.method_2();

            inner_class_1.variable_4 = new Object();
            variable_5.method_2();
        }
    }
}