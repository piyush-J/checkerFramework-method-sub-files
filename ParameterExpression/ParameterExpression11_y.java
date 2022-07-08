import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression11_y {
    @Nullable Object variable_1 = null;
    @EnsuresNonNull("field")
    // :: error: (contracts.postcondition.not.satisfied)
    // :: warning: (expression.parameter.name.shadows.field)
    public void method_1(Object variable_1) {
        //dummy_lines
        variable_1 = new Object();
    }
}
