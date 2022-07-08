import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfter5_y {

    protected @Nullable String variable_1;

    @EnsuresNonNull("value")
    public boolean method_1() {
        variable_1 = "";
        //dummy_lines
        return true;
    }

    public void method_2(@Nullable String variable_2) {
        if (variable_2 == null) {
            //dummy_lines
            method_1();
        }
        //dummy_lines
        // :: error: (dereference.of.nullable)
        variable_1.toString();
    }
}