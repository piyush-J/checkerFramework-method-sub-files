import org.checkerframework.checker.nullness.qual.*;

public class Aliasing1_y {
    @NonNull Object variable_1 = new Object();
    @Nullable Object variable_2 = null;

    public static void method_1(String[] variable_3) {
        Aliasing1_y variable_4 = new Aliasing();
        Aliasing1_y variable_5 = new Aliasing();
        method_2(variable_4, variable_5);
    }
    //dummy_lines
    static void method_2(@NonNull Aliasing1_y variable_4, @NonNull Aliasing1_y variable_5) {
        variable_4.variable_2 = variable_5.variable_1;
        // Changing a.no to nonnull does not mean that b.no is also nonnull
        // :: error: (assignment.type.incompatible)
        variable_5.variable_1 = variable_5.variable_2;
        //dummy_lines
        System.out.println("@NonNull field b.nno is: " + variable_5.variable_1);
    }
}