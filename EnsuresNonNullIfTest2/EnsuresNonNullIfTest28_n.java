import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/** Test case for issue 53: https://github.com/typetools/checker-framework/issues/53 */
public class EnsuresNonNullIfTest28_n {

    private @Nullable Long variable_1;

    public @org.checkerframework.dataflow.qual.Pure @Nullable Long method_1() {
        return variable_1;
    }
    class inner_class_1 {
        @EnsuresNonNullIf(result = true, expression = "getId()")
        public boolean method_2() {
            //dummy_lines
            return method_1() != null;
        }
    }
}