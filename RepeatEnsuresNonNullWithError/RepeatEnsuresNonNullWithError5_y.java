import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.Nullable;

public class RepeatEnsuresNonNullWithError5_y {

    protected @Nullable String variable_1;
    protected @Nullable String variable_2;
    protected @Nullable String variable_3;

    @EnsuresNonNullIf.List({
            @EnsuresNonNullIf(expression = "value1", result = true),
            @EnsuresNonNullIf(expression = "value2", result = true),
    })
    @EnsuresNonNullIf(expression = "value3", result = true)
    public boolean method_1() {
        return method_2();
    }
    @EnsuresNonNullIf.List({
            @EnsuresNonNullIf(expression = "value1", result = true),
            @EnsuresNonNullIf(expression = "value2", result = true),
    })
    @EnsuresNonNullIf(expression = "value3", result = true)
    public boolean method_2() {
        //dummy_lines
        variable_1 = "value1";
        variable_2 = "value2";
        variable_3 = null; // condition not satisfied here
        // :: error:  (contracts.conditional.postcondition.not.satisfied)
        return true;
    }
}