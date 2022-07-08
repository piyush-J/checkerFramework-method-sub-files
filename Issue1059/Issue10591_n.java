// Test case for Issue 1059:
// https://github.com/typetools/checker-framework/issues/1059

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public class Issue10591_n {
    @Nullable Object variable_1;

    @EnsuresNonNull({"f"})
    void method_1() {
        //dummy_lines
        variable_1 = new Object();
    }
}