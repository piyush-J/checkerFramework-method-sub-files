import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class OverrideNNOE21_n {
    static class inner_class_1 {
        @Nullable Object variable_1;

        @RequiresNonNull("f")
        void method_1() {
            //dummy_lines
        }
    }
}