import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.*;

public class PureTest13_y {
    //dummy_lines
    @org.checkerframework.dataflow.qual.Pure
    public @org.checkerframework.dataflow.qual.Pure @Nullable Object method_1() {
        return null;
    }
    void method_2(@Nullable Object variable_1) {
        //dummy_lines
        // set the field returned by getSuperclass.
    }

    static void method_3(PureTest13_y variable_2) {
        if (!(variable_2.method_1() instanceof Object)) {
            return;
        } else {
            variable_2.method_2(null);
        }
        // :: error: (dereference.of.nullable)
        variable_2.method_1().toString();
    }
}