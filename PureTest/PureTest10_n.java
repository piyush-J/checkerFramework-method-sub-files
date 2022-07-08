import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.*;

public class PureTest10_n {
    //dummy_lines
    @org.checkerframework.dataflow.qual.Pure
    public @org.checkerframework.dataflow.qual.Pure @Nullable Object method_1() {
        return null;
    }

    static void method_2(PureTest10_n variable_1) {
        if (!(variable_1.method_1() instanceof String)) {
            return;
        }
        variable_1.method_1().toString();
    }
}