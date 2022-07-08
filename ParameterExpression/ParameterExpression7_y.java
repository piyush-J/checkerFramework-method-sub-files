import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression7_y {
    @Nullable Object variable_1 = null;
    @EnsuresNonNull("param")
    // :: error: (flowexpr.parse.error)
    public void method_1(Object variable_2) {
        //dummy_lines
        // :: error: (assignment.type.incompatible)
        variable_2 = null;
    }
}
