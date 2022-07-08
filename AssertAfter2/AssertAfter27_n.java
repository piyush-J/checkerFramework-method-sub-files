import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

import java.util.HashMap;
import java.util.List;

public class AssertAfter27_n {

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
    }
}