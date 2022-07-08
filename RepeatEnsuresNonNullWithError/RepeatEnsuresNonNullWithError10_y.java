import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.Nullable;

public class RepeatEnsuresNonNullWithError10_y {

    protected @Nullable String variable_1;
    protected @Nullable String variable_2;
    protected @Nullable String variable_3;

    @EnsuresNonNull.List({@EnsuresNonNull("value1"), @EnsuresNonNull("value2")})
    @EnsuresNonNull("value3")
    // :: error:  (contracts.postcondition.not.satisfied)
    public void method_1() {
        //dummy_lines
        variable_1 = "value1";
        variable_2 = "value2";
        variable_3 = null; // condition not satisfied here
    }
}