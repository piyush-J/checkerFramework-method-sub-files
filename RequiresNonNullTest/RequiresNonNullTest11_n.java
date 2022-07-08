import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.Pure;

public class RequiresNonNullTest11_n {

    @Nullable Object variable_1;
    @Nullable Object variable_2;

    protected @Nullable Object variable_3;
    //dummy_lines
    protected static @Nullable Object variable_4;

    @RequiresNonNull("field")
    public void method_1() {}

    class inner_class_1 extends RequiresNonNullTest11_n {
        public void method_2(inner_class_1 variable_5) {
            //dummy_lines
            variable_5.variable_3 = new Object();
            variable_5.method_1();
        }
    }
}