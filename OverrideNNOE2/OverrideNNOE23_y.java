import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class OverrideNNOE23_y {
    static class inner_class_1 {
        @Nullable Object variable_1;

        @RequiresNonNull("f")
        void method_1() {
        }
    }
    static class inner_class_2 extends inner_class_1 {
        @Nullable Object variable_2;

        @Override
        @RequiresNonNull({"f", "g"})
            // :: error: (contracts.precondition.override.invalid)
        void method_1() {
            variable_2.hashCode();
        }
    }
    public static void method_3(String[] variable_3) {
        //dummy_lines
        inner_class_1 variable_4 = new inner_class_2();
        variable_4.variable_1 = new Object();
        variable_4.method_1();
    }
}