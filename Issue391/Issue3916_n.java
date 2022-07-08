// Test case for Issue 391:
// https://github.com/typetools/checker-framework/issues/391

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

class outer_Issue3916_n {
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
public class Issue3916_n{
    outer_Issue3916_n variable_2 = new outer_Issue3916_n();

    @RequiresNonNull("field.value")
    void method_3() {
    }
    @EnsuresNonNull("field.value")
    void method_1() {
        variable_2.method_1();
    }
    void method_4() {
        //dummy_lines
        method_1();
        method_3();

        outer_Issue3916_n a = new outer_Issue3916_n();
        a.method_1();
        a.method_2();
    }
}