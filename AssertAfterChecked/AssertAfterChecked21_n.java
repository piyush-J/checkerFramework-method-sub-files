import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfterChecked21_n {

    class inner_class_1 {
        @Nullable Object variable_1;

        @EnsuresNonNull("f")
        int method_1() {
            //dummy_lines
            if (5 == 5) {
                variable_1 = new Object();
                return 0;
            } else {
                variable_1 = new Object();
                return 1;
            }
        }
    }
}