import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression9_y {
    @Nullable Object variable_1 = null;
    @EnsuresNonNull("param")
    // :: error: (flowexpr.parse.error)
    public void method_1(@Nullable Object variable_2) {
        //dummy_lines
        variable_2 = null;
    }
}