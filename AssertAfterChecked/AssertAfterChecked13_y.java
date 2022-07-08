import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfterChecked13_y {

    class inner_class_1 {
        @EnsuresNonNull("get(#1)")
            // :: error: (contracts.postcondition.not.satisfied)
        void method_1(final inner_class_1 variable_1) {
        }
    }
}