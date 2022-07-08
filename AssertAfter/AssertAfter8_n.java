import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

class AssertAfter8_n {
    private @Nullable String variable_1 = null;

    @EnsuresNonNull("privateField")
    public void method_1() {
        //dummy_lines
        variable_1 = "hello";
    }
}