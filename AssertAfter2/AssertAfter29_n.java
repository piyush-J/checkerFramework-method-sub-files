import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfter29_n {

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
        void method_1(final Object variable_5, final Object variable_6, final Object variable_7) {
            //dummy_lines
            // body omitted, not relevant to test case
        }

        @org.checkerframework.dataflow.qual.Pure
        @Nullable Object method_2(Object variable_8, Object variable_9, Object variable_10) {
            return null;
        }

        Object variable_11, variable_12, variable_13;

        void method_3() {
            //dummy_lines
            variable_1.method_1(variable_11, variable_12, variable_13);
            @NonNull Object variable_14 = variable_1.method_2(variable_11, variable_12, variable_13);
        }
    }
}