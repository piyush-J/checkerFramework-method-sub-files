import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertNonNullTest1_y {
    public @Nullable String variable_1;

    // :: error: (contracts.postcondition.not.satisfied)
    public @EnsuresNonNull("s") void method_1() {
        //dummy_lines
        variable_1 = null;
    }
}