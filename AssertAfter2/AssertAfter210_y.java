import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfter210_y {

    public class inner_class_1 {
        inner_class_1(inner_class_1 variable_1, Object variable_2, Object variable_3, Object variable_4) {
            this.variable_1 = variable_1;
            this.variable_2 = variable_2;
            this.variable_3 = variable_3;
            this.variable_4 = variable_4;
        }

        inner_class_1 variable_1;

        @SuppressWarnings("contracts.postcondition.not.satisfied")
        @EnsuresNonNull("get(#1, #2, #3)")

        @org.checkerframework.dataflow.qual.Pure
        @Nullable Object method_1(Object variable_5, Object variable_6, Object variable_7) {
            return null;
        }

        Object variable_8, variable_9, variable_10;
        void method_2() {
            //dummy_lines
            // :: error: (assignment.type.incompatible)
            @NonNull Object variable_11 = method_1(variable_8, variable_9, variable_10);
        }
    }
}