// Test case for Issue 1059:
// https://github.com/typetools/checker-framework/issues/1059

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public class Issue10592_n {
    @Nullable Object variable_1;

    @EnsuresNonNull({"f"})
    void method_1() {
        variable_1 = new Object();
    }

    void method_2() {
        switch (this.hashCode()) {
            case 1:
                //dummy_lines
                method_1();
                Object variable_2 = variable_1.toString();
        }
    }
}