import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression17_y {
    @Nullable Object variable_1 = null;
    // Warning issued. 'field' is a field, but in this case what matters is that it is the name of a
    // formal parameter.
    @RequiresNonNull("field")
    // :: warning: (expression.parameter.name.shadows.field)
    public void method_1(Object variable_1) {
        //dummy_lines
    }
}