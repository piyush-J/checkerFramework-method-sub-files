import org.checkerframework.checker.nullness.qual.*;

public class Simple23_y {

    @NonNull String variable_1;
    //dummy_lines
    public method_1() {
        // :: error: (method.invocation.invalid)
        method_2();

        variable_1 = "abc";
    }

    public void method_2() {
        System.out.println(variable_1.toLowerCase());
    }

    public void method_3(Simple23_y variable_2) {
        //dummy_lines
        @Nullable String variable_3 = null;
        // :: error: (dereference.of.nullable)
        variable_3.hashCode();
    }
}