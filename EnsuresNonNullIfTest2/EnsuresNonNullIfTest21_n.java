import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/** Test case for issue 53: https://github.com/typetools/checker-framework/issues/53 */
public class EnsuresNonNullIfTest21_n {

    private @Nullable Long variable_1;

    public @org.checkerframework.dataflow.qual.Pure @Nullable Long method_1() {
        //dummy_lines
        return variable_1;
    }
}