import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfterChecked7_n {

    class inner_class_1 {
        static @Nullable Object variable_1;

        void method_1() {
            variable_1 = new Object();
        }
        void method_2() {
            //dummy_lines
            method_1();
            variable_1.toString();
        }
    }
}