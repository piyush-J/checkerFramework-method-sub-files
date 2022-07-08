import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression5_n {
    @Nullable Object variable_1 = null;

    // Postconditions
    @EnsuresNonNull("field") // OK
    public void method_1() {
        variable_1 = new Object();
    }
}
