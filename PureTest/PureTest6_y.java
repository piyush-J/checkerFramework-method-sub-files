import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.*;

public class PureTest6_y {
    //dummy_lines
    @org.checkerframework.dataflow.qual.Pure
    public @org.checkerframework.dataflow.qual.Pure @Nullable Object method_1() {
        return null;
    }

    static void method_2(PureTest6_y variable_1) {
        if (variable_1.method_1() instanceof Object) {
            return;
        }
        // :: error: (dereference.of.nullable)
        variable_1.method_1().toString();
    }
}