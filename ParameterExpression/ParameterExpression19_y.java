import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression19_y {
    @Nullable Object variable_1 = null;
    // Warning issued. 'field' is a field, but in this case what matters is that it is the name of a
    // formal parameter.
    @EnsuresNonNullIf(result = true, expression = "field")
    // :: warning: (expression.parameter.name.shadows.field)
    public boolean method_1(@Nullable Object variable_1) {
        variable_1 = new Object();
        //dummy_lines
        // :: error: (contracts.conditional.postcondition.not.satisfied)
        return true;
    }
}