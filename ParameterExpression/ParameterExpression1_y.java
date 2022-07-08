import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;

public class ParameterExpression1_y {
    public void method_1(
            @Nullable Object variable_1, @Nullable Object variable_2, @Nullable Object variable_3, @Nullable Object variable_4) {
        // :: error: (flowexpr.parse.error.postcondition)
        method_2(variable_1);
        // :: error: (dereference.of.nullable)
        variable_1.toString();
        metho_3(variable_1);
        variable_1.toString();
        method_4(variable_2, variable_3, variable_4);
        // :: error: (dereference.of.nullable)
        variable_1.toString();
        // :: error: (dereference.of.nullable)
        variable_3.toString();
        variable_4.toString();
        //dummy_lines
    }

    @SuppressWarnings("assert.postcondition.not.satisfied")
    // "#0" is illegal syntax; it should be "#1"
    @EnsuresNonNull("#0")
    // :: error: (flowexpr.parse.error)
    public void method_2(final @Nullable Object variable_1) {
        //dummy_lines
    }

    @SuppressWarnings("contracts.postcondition.not.satisfied")
    @EnsuresNonNull("#1")
    public void method_3(final @Nullable Object variable_1) {
        //dummy_lines
    }

    @SuppressWarnings("contracts.postcondition.not.satisfied")
    @EnsuresNonNull("#3")
    public void method_4(@Nullable Object variable_5, @Nullable Object variable_6, final @Nullable Object variable_7) {
        //dummy_lines
    }
}