import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class OverrideNNOE2_y {
    static class inner_class_1 {
        @Nullable Object variable_1;

        void method_1() {
            //dummy_lines
        }
    }
    static class inner_class_2 extends inner_class_1 {
        @Override
        @RequiresNonNull("f")
            // :: error: (contracts.precondition.override.invalid)
        void method_1() {
            variable_1.hashCode();
        }
    }
}