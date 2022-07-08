import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class OverrideNNOE3_n {
    static class inner_class_1 {
        @Nullable Object variable_1;

        void method_1() {
        }
    }
    static class inner_class_2 extends inner_class_1 {
        @Override
        @RequiresNonNull("f")
            // :: error: (contracts.precondition.override.invalid)
        void method_1() {
            variable_1.hashCode();
        }
    }
    public static void method_2(String[] variable_2) {
        //dummy_lines
        inner_class_1 variable_3 = new inner_class_2();
        variable_3.method_1();
    }
}