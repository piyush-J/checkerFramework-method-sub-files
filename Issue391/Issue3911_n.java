// Test case for Issue 391:
// https://github.com/typetools/checker-framework/issues/391

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

class Issue3911_n {
    private @Nullable String variable_1 = null;

    @EnsuresNonNull("value")
    public void method_1() {
        //dummy_lines
        variable_1 = "";
    }
}