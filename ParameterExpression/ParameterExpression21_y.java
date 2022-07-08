import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression21_y {
    @Nullable Object variable_1 = null;
    @EnsuresNonNullIf(result = true, expression = "field")
    // :: warning: (expression.parameter.name.shadows.field)
    public boolean method_1(@Nullable Object variable_1) {
        variable_1 = null;
        //dummy_lines
        // :: error: (contracts.conditional.postcondition.not.satisfied)
        return true;
    }
}