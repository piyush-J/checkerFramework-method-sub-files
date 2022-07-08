import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfter2_y {

    protected @Nullable String variable_1;

    public void method_1() {
        //dummy_lines
        // :: error: (dereference.of.nullable)
        variable_1.toString();
    }
}