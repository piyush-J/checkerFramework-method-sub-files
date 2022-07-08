import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class NNOEMoreTests2_y {
    class inner_class_1 {
        protected @Nullable String variable_1 = null;
        @Nullable String variable_2 = null;

        @RequiresNonNull("xxx")
            // :: error: (flowexpr.parse.error)
        void method_1() {
            //dummy_lines
            // :: error: (dereference.of.nullable)
            variable_1.toString();
        }
    }
}