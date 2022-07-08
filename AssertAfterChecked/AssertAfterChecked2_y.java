import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfterChecked2_y {

    class inner_class_1 {
        @Nullable Object variable_1;
        @EnsuresNonNull("f")
            // :: error: (contracts.postcondition.not.satisfied)
        void method_1() {
            //dummy_lines
        }
    }
}
