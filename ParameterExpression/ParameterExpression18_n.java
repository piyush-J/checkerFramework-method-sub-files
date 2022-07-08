import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression18_n {
    @Nullable Object variable_1 = null;
    // Conditional postconditions
    @EnsuresNonNullIf(result = true, expression = "field") // OK
    public boolean method_1() {
        //dummy_lines
        variable_1 = new Object();
        return true;
    }
}
