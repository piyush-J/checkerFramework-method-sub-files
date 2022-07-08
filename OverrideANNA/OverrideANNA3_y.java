import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;

public class OverrideANNA3_y {
    static class inner_class_1 {
        Object variable_1;

        @EnsuresNonNull("f")
        void method_1(@UnknownInitialization Super this) {
            variable_1 = new Object();
        }
        inner_class_1() {
            method_1();
        }
    }
    static class inner_class_2 extends inner_class_1 {
        @Override
            //dummy_lines
            // :: error: (contracts.postcondition.not.satisfied)
        void method_1(@UnknownInitialization inner_class_2 this) {
            //dummy_lines
        }
    }

    public static void method_2(String[] variable_2) {
        //dummy_lines
        inner_class_1 variable_3 = new inner_class_2();
        variable_3.variable_1.hashCode();
    }
}