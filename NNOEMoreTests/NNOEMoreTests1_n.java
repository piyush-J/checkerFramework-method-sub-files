import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class NNOEMoreTests1_n {
    class inner_class_1 {
        protected @Nullable String variable_1 = null;
        @Nullable String variable_2 = null;

        @RequiresNonNull("nullable")
        void method_1() {
            //dummy_lines
            variable_1.toString();
        }
    }
}