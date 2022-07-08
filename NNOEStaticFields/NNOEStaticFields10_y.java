import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class NNOEStaticFields10_y {
    static @Nullable String variable_1 = null;
    static @Nullable String variable_2 = null;

    @RequiresNonNull("otherNullable")
    void method_1() {
        //dummy_lines
        // :: error: (dereference.of.nullable)
        variable_1.toString();
        variable_2.toString();
    }
}