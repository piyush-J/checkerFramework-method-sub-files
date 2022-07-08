import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfterChecked19_y {

    class inner_class_1 {
        @EnsuresNonNull("get(#1)")
            // :: error: (contracts.postcondition.not.satisfied)
        void method_1(final inner_class_1 variable_1) {
        }
        @org.checkerframework.dataflow.qual.Pure
        @Nullable Object method_2(Object variable_2) {
            return null;
        }
        void method_3(inner_class_1 variable_3) {
            //dummy_lines
            variable_3.method_1(this);
            this.method_2(this).toString();
        }
    }
}