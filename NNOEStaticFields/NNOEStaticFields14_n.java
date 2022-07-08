import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class NNOEStaticFields14_n {
    static @Nullable String variable_1 = null;
    static @Nullable String variable_2 = null;

    static class inner_class_1 {

        // Non-null if doPurity == true
        private static @MonotonicNonNull Set<String> variable_3 = null;

        private static boolean variable_4 = false;

        @RequiresNonNull("ChicoryPremain1.pureMethods")
        public static Set<String> method_1() {
            //dummy_lines
            return Collections.unmodifiableSet(variable_3);
        }
    }
}