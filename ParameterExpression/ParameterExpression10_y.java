import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression10_y {
    @Nullable Object variable_1 = null;
    @EnsuresNonNull("param.toString()")
    // :: error: (flowexpr.parse.error)
    public void method_1(@Nullable Object variable_2) {
        //dummy_lines
        variable_2 = null;
    }
}