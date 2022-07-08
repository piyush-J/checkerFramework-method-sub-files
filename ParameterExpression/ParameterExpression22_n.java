import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression22_n {
    @Nullable Object variable_1 = null;
    @EnsuresNonNullIf(result = true, expression = "field")
    // :: warning: (expression.parameter.name.shadows.field)
    public boolean method_1(@Nullable Object variable_1) {
        //dummy_lines
        variable_1 = null;
        return false;
    }
}