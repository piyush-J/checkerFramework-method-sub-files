import org.checkerframework.checker.initialization.qual.*;
import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public class NNOEStaticFields6_n {
        static @Nullable String variable_1 = null;
        static @Nullable String variable_2 = null;

        @RequiresNonNull("NNOEStaticFields.nullable")
        void method_1() {
                NNOEStaticFields6_n.variable_1.toString();
        }

        class inner_class_1 {
                @RequiresNonNull("NNOEStaticFields.nullable")
                void method_2(NNOEStaticFields6_n variable_3) {
                        //dummy_lines
                        variable_3.method_1();
                }
        }
}