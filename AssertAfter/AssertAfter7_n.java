import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfter7_n {

    protected @Nullable String variable_1;

    @EnsuresNonNull("value")
    public boolean method_1() {
        variable_1 = "";
        //dummy_lines
        return true;
    }

    // skip-test: Come back when working on improved flow
    public void method_2() {
        if (method_1()) {
        } else {
            //dummy_lines
            variable_1.toString(); // valid!
        }
    }
}