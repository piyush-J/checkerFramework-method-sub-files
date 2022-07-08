import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.Pure;

public class RequiresNonNullTest15_y {

    @Nullable Object variable_1;
    @Nullable Object variable_2;

    protected @Nullable Object variable_3;
    //dummy_lines
    protected static @Nullable Object variable_4;

    @RequiresNonNull("field")
    public void method_1() {}

    private @Nullable Object variable_5;

    class inner_class_1 extends RequiresNonNullTest15_y {
        protected @Nullable String variable_3;

        public void method_2(inner_class_1 variable_6) {
            //dummy_lines
            // :: error: (contracts.precondition.not.satisfied)
            variable_6.method_1();
        }
    }
}