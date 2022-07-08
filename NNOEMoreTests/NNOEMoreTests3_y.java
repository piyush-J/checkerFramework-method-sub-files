import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class NNOEMoreTests3_y {
    class inner_class_1 {
        protected @Nullable String variable_1 = null;
        @Nullable String variable_2 = null;

        @RequiresNonNull("nullable")
        void method_1() {
            variable_1.toString();
        }

        @RequiresNonNull("xxx")
            // :: error: (flowexpr.parse.error)
        void method_2() {
            // :: error: (dereference.of.nullable)
            variable_1.toString();
        }
    }
    class inner_class_2 {
        void method_3(inner_class_1 variable_3) {
            //dummy_lines
            // :: error: (contracts.precondition.not.satisfied)
            variable_3.method_1();

            Object variable_4 = new Object();
            // :: error: (flowexpr.parse.error)
            variable_3.method_2();
        }
    }
}