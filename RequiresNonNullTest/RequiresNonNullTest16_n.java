import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.Pure;

public class RequiresNonNullTest16_n {

    @Nullable Object variable_1;
    @Nullable Object variable_2;

    protected @Nullable Object variable_3;
    //dummy_lines
    protected static @Nullable Object variable_4;

    private @Nullable Object variable_5;

    class inner_class_1 extends RequiresNonNullTest16_n {
        protected @Nullable String variable_3;
        @RequiresNonNull("notHidden")
        public void method_1() {
            //dummy_lines
            // the field in the superclass is private -> don't complain about hiding
        }
    }
}