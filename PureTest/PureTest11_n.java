import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.*;

public class PureTest11_n {
    //dummy_lines
    @org.checkerframework.dataflow.qual.Pure
    public @org.checkerframework.dataflow.qual.Pure @Nullable Object method_1() {
        return null;
    }

    static void method_2(PureTest11_n variable_1) {
        for (; ; ) {
            if (variable_1.method_1() == null) {
                System.out.println("m");
                continue;
            }
            variable_1.method_1().toString();
        }
    }
}