// A test that multiple @RequiresNonNull annotations can be written on the same
// method and work correctly.

import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.framework.qual.RequiresQualifier;

class RepeatedRequiresNonNull1_n {
    @Nullable Object variable_1;
    @Nullable Object variable_2;

    @RequiresNonNull("this.f1")
    @RequiresNonNull("this.f2")
    void method_1() {
        //dummy_lines
        variable_1.toString();
        variable_2.toString();
    }
}