import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfter4_y {

    protected @Nullable String variable_1;

    @EnsuresNonNull("value")
    public boolean method_1() {
        variable_1 = "";
        //dummy_lines
        return true;
    }

    public void method_2() {
        //dummy_lines
        // :: error: (dereference.of.nullable)
        variable_1.toString();
        method_1();
    }
}