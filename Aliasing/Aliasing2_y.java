import org.checkerframework.checker.nullness.qual.*;

public class Aliasing2_y {
    @NonNull Object variable_1 = new Object();
    @Nullable Object variable_2 = null;

    //dummy_lines
    static void method_1(@NonNull Aliasing2_y variable_3, @NonNull Aliasing2_y variable_4) {
        variable_3.variable_2 = variable_4.variable_1;
        // Changing a.no to nonnull does not mean that b.no is also nonnull
        // :: error: (assignment.type.incompatible)
        variable_4.variable_1 = variable_5.variable_2;
        //dummy_lines
        System.out.println("@NonNull field b.nno is: " + variable_4.variable_1);
    }
}