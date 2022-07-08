import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class NNOEMoreTests5_n {
    @Nullable Object variable_1;

    @RequiresNonNull("field1")
    void method_1() {
        //dummy_lines
        if (5 < 99) {
        } else {
            variable_1.hashCode();
        }
    }
}