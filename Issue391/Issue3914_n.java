// Test case for Issue 391:
// https://github.com/typetools/checker-framework/issues/391

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

class outer_Issue3914_n {
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
public class Issue3914_n{
    //dummy_liness
    outer_Issue3913_n variable_2 = new outer_Issue3913_n();

    @EnsuresNonNull("field.value")
    void method_1() {
        //dummy_lines
        variable_2.method_1();
    }
}