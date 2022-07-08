import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class NNOEMoreTests4_n {
    class inner_class_1 {
        protected @Nullable String variable_1 = null;
        @Nullable String variable_2 = null;

        @RequiresNonNull("nullable")
        void method_1() {
            variable_1.toString();
        }

    }
    class inner_class_2 {
        void method_2(inner_class_1 variable_3) {
            //dummy_lines
            variable_3.variable_1 = "";
            variable_3.method_1();
        }
    }
}