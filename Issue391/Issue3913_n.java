// Test case for Issue 391:
// https://github.com/typetools/checker-framework/issues/391

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

class outer_Issue3913_n {
    private @Nullable String variable_1 = null;

    @EnsuresNonNull("value")
    public void method_1() {
        variable_1 = "";
    }

    @RequiresNonNull("value")
    public String method_2() {
        return variable_1;
    }
}
public class Issue3913_n{
    outer_Issue3913_n variable_2 = new outer_Issue3913_n();

    @RequiresNonNull("field.value")
    void method_3() {
        //dummy_lines
    }
}