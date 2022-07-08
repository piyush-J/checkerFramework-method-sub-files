import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

class AssertAfter10_n {
    private @Nullable String variable_1 = null;

    @EnsuresNonNull("privateField")
    public void method_1() {
        variable_1 = "hello";
    }

    @EnsuresNonNull("privateField")
    public void method_2() {
        //dummy_lines
    }
}
class outer_class_1 {

    void method_3() {
        //dummy_lines
        AssertAfter10_n variable_2 = new AssertAfter10_n();
        variable_2.method_1();
        variable_2.method_2();
    }
}