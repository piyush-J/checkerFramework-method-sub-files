import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfterChecked9_n {

    class inner_class_1 {
        static @Nullable Object variable_1;

        @EnsuresNonNull("InitStaticField.f")
        void method_1() {
            //dummy_lines
            inner_class_1.variable_1 = new Object();
        }
    }
}