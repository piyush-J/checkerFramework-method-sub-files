import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/** Test case for issue 53: https://github.com/typetools/checker-framework/issues/53 */
public class EnsuresNonNullIfTest26_n {

    private @Nullable Long variable_1;

    @EnsuresNonNullIf(result = true, expression = "this.id")
    public boolean method_1() {
        //dummy_lines
        return this.variable_1 != null;
    }
}