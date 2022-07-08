import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public class AssertIfChecked24_n {

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

    /* pure */ public static boolean method_2(
            boolean @Nullable [] variable_5, boolean @Nullable [] variable_6) {
        //dummy_lines
        if (!method_1(variable_5, variable_6)) {
            return false;
        }
        // This assert is not needed for inference.
        // assert seq1 != null && seq2 != null; // because sameLength() = true

        int variable_7 = variable_5.length;
        for (int i = 0; i < variable_7; i++) {
            if (variable_5[i] != variable_6[variable_7 - i - 1]) {
                return false;
            }
        }
        return true;
    }
}