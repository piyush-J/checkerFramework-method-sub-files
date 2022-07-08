import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

import javax.swing.JMenuBar;

public abstract class FlowExpressionParsingBug3_n {

    //// Check that JavaExpressions with explicit and implicit 'this' work

    protected @Nullable JMenuBar variable_1 = null;
    static @Nullable String variable_2 = null;
    //dummy_lines
    @RequiresNonNull("FlowExpressionParsingBug.i")
    public void method_1() {
    }
}