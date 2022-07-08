import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.Nullable;

public class RepeatEnsuresNonNull7_n {

    protected @Nullable String variable_1;
    protected @Nullable String variable_2;
    protected @Nullable String variable_3;

    @EnsuresNonNullIf(
            expression = {"value1", "value2"},
            result = true)
    @EnsuresNonNullIf(expression = "value3", result = true)
    public boolean method_1() {
        //dummy_lines
        variable_1 = "value1";
        variable_2 = "value2";
        variable_3 = "value3";
        return true;
    }
}