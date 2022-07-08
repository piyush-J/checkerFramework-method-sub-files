import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class NNOEStaticFields2_n {
    static @Nullable String variable_1 = null;
    static @Nullable String variable_2 = null;

    @RequiresNonNull("NNOEStaticFields.nullable")
    void method_1() {
        //dummy_lines
        variable_1.toString();
    }
}