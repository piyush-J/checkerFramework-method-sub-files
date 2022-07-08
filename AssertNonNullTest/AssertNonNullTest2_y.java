import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class AssertNonNullTest2_y {
    public @Nullable String variable_1;

    // :: error: (contracts.postcondition.not.satisfied)
    public @EnsuresNonNull("s") void method_1() {
        variable_1 = null;
    }

    public static void method_2(String[] variable_2) {
        //dummy_lines
        AssertNonNullTest variable_3 = new AssertNonNullTest();
        // :: error: (dereference.of.nullable)
        variable_3.variable_1.equals("we");
        AssertNonNullTest variable_4 = new AssertNonNullTest();
        variable_4.method_1();
        variable_4.variable_1.equals("we");
    }
}