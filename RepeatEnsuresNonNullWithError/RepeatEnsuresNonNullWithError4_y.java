import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.Nullable;

public class RepeatEnsuresNonNullWithError4_y {

    protected @Nullable String variable_1;
    protected @Nullable String variable_2;
    protected @Nullable String variable_3;

    @EnsuresNonNull("value1")
    @EnsuresNonNull(value = {"value2", "value3"})
    public void method_1() {
        return method_2();
    }
    @EnsuresNonNull("value1")
    @EnsuresNonNull(value = {"value2", "value3"})
    // :: error:  (contracts.postcondition.not.satisfied)
    public void method_2() {
        //dummy_lines
        variable_1 = "value1";
        variable_2 = "value2";
        variable_3 = null; // condition not satisfied here
    }
}