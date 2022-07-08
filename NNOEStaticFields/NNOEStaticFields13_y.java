import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class NNOEStaticFields13_y {
    static @Nullable String variable_1 = null;
    static @Nullable String variable_2 = null;

    static class inner_class_1 {

        // Non-null if doPurity == true
        private static @MonotonicNonNull Set<String> variable_3 = null;

        private static boolean variable_4 = false;

        @EnsuresNonNullIf(result = true, expression = "ChicoryPremain1.pureMethods")
        // this postcondition cannot be proved with the Checker Framework, as the relation
        // between doPurity and pureMethods is not explicit
        public static boolean method_1() {
            //dummy_lines
            // :: error: (contracts.conditional.postcondition.not.satisfied)
            return variable_4;
        }
    }
}