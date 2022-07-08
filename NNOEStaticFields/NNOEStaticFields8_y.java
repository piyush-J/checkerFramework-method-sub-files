import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class NNOEStaticFields8_y {
    static @Nullable String variable_1 = null;
    static @Nullable String variable_2 = null;

    void method_1() {
        //dummy_lines
        // :: error: (dereference.of.nullable)
        variable_1.toString();
        // :: error: (dereference.of.nullable)
        variable_2.toString();
    }
}