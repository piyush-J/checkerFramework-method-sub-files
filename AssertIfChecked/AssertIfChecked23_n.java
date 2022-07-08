import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public class AssertIfChecked23_n {

    boolean variable_1 = false;

    @Nullable Object variable_2;

    @org.checkerframework.dataflow.qual.Pure

    @EnsuresNonNullIf(
            result = true,
            expression = {"#1", "#2"})
    /* pure */ public static boolean method_1(
            boolean @Nullable [] variable_3, boolean @Nullable [] variable_4) {
        //dummy_lines
        return ((variable_3 != null) && (variable_4 != null) && variable_3.length == variable_4.length);
    }
}