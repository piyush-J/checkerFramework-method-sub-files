import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;
public class ParameterExpression2_y {
    @SuppressWarnings("assert.postcondition.not.satisfied")
    // "#0" is illegal syntax; it should be "#1"
    @EnsuresNonNull("#0")
    // :: error: (flowexpr.parse.error)
    public void method_1(final @Nullable Object variable_1) {
        //dummy_lines
    }
}
