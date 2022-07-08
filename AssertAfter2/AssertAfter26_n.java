import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

import java.util.HashMap;
import java.util.List;

public class AssertAfter26_n {

    public class inner_class_1<T> {

        HashMap<T, List<@KeyFor("childMap") T>> variable_1;

        public inner_class_1(HashMap<T, List<@KeyFor("childMap") T>> variable_1) {
            this.variable_1 = variable_1;
        }

        @SuppressWarnings("contracts.postcondition.not.satisfied")
        @EnsuresNonNull("childMap.get(#1)")
        public void method_1(T variable_2, T variable_3) {
            List<@KeyFor("childMap") T> variable_4 = variable_1.get(variable_2);
        }
    }
}