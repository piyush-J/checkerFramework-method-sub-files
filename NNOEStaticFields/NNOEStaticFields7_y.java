import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class NNOEStaticFields7_y {
    static @Nullable String variable_1 = null;
    static @Nullable String variable_2 = null;

    @RequiresNonNull("NoClueWhatThisShouldBe")
        // :: error: (flowexpr.parse.error)
    void method_1() {
        //dummy_lines
        // :: error: (dereference.of.nullable)
        NNOEStaticFields7_y.variable_1.toString();
    }
}