import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.*;

public class PureTest2_y {
    //dummy_lines
    @org.checkerframework.dataflow.qual.Pure
    @Nullable
    Object method_1(@Nullable Object variable_1) {
        return variable_1;
    }

    public void method_2() {
        // :: error: (assignment.type.incompatible)
        @NonNull Object variable_2 = method_1(null);

        if (method_1(null) == null) {
            // :: error: (assignment.type.incompatible)
            @NonNull Object variable_3 = method_1(null);
        }

        if (method_1("m") != null) {
            @NonNull Object variable_3 = method_1("m");
        }

        if (method_1("m") != null) {
            // :: error: (assignment.type.incompatible)
            @NonNull Object variable_3 = method_1(null);
        }

        if (method_1("m") != null) {
            // :: error: (assignment.type.incompatible)
            @NonNull Object variable_3 = method_1("n");
        }

        Object variable_4 = new Object();

        if (method_1(variable_4) == null) {
            return;
        }

        @NonNull Object variable_5 = method_1(variable_4);

        variable_4 = new Object();

        // :: error: (assignment.type.incompatible)
        @NonNull Object variable_6 = method_1(variable_4);

        // :: error: (assignment.type.incompatible)
        @NonNull Object variable_7 = method_1("n");
    }
}