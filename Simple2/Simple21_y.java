import org.checkerframework.checker.nullness.qual.*;

public class Simple21_y {

    @NonNull String variable_1;
    //dummy_lines
    public method_1() {
        // :: error: (method.invocation.invalid)
        method_2();

        variable_1 = "abc";
    }

    public void method_2() {
        //dummy_lines
        System.out.println(variable_1.toLowerCase());
    }
}