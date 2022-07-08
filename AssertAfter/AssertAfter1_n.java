import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertAfter1_n {

    protected @Nullable String variable_1;

    @EnsuresNonNull("value")
    public boolean method_1() {
        variable_1 = "";
        //dummy_lines
        return true;
    }
}