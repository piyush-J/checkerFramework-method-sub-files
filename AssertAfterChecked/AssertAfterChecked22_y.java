import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfterChecked22_y {

    class inner_class_1 {
        @Nullable Object variable_1;

        @EnsuresNonNull("f")
            // :: error: (contracts.postcondition.not.satisfied)
        int method_1() {
            //dummy_lines
            return 0;
        }
    }
}