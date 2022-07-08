import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class OverrideNNOE22_y {
    static class inner_class_1 {
        @Nullable Object variable_1;

        @RequiresNonNull("f")
        void method_1() {
        }
    }
    static class inner_class_2 extends inner_class_1 {
        @Nullable Object variable_2;

        @Override
        @RequiresNonNull({"f", "g"})
            // :: error: (contracts.precondition.override.invalid)
        void method_1() {
            //dummy_lines
            variable_2.hashCode();
        }
    }
}