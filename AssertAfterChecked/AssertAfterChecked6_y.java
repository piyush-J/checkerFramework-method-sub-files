import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfterChecked6_y {

    class inner_class_1 {
        static @Nullable Object variable_1;
        @EnsuresNonNull("f")
            // :: error: (contracts.postcondition.not.satisfied)
        void method_1() {
            //dummy_lines
        }
    }
}
