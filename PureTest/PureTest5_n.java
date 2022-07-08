import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.*;

public class PureTest5_n {
    //dummy_lines
    @org.checkerframework.dataflow.qual.Pure
    public @org.checkerframework.dataflow.qual.Pure @Nullable Object method_1() {
        return null;
    }

    static void method_2(PureTest5_n variable_1) {
        if ((variable_1.method_1() == null) || variable_1.method_1().equals(Enum.class)) {
            // empty body
            //dummy_lines
        }
    }
}