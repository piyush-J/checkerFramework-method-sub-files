import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfterChecked24_n {

    class inner_class_1 {
        @Nullable Object variable_1;

        @EnsuresNonNull("f")
        int method_1() {
            //dummy_lines
            variable_1 = new Object();
            return 0;
        }
        void method_2() {
            //dummy_lines
            method_1();
            variable_1.toString();
        }
    }
}