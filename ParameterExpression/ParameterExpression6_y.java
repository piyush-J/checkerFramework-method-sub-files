import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression6_y {
    @Nullable Object variable_1 = null;
    @EnsuresNonNull("param")
    //dummy_lines
    // :: error: (flowexpr.parse.error)
    public void method_1(Object variable_2) {
        variable_2 = new Object();
    }
}
