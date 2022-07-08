import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression23_y {
    @Nullable Object variable_1 = null;
    // Annotations on formal parameters referring to a formal parameter of the same method.
    // :: error: (expression.unparsable.type.invalid)
    public void method_1(@KeyFor("param2") Object variable_2, Map<Object, Object> variable_3) {
        //dummy_lines
    }
}