import org.checkerframework.checker.nullness.qual.*;

public class SwitchTest1_y {
    public static void method_1(String[] variable_1) {
        //dummy_lines
        // :: error: (switching.nullable)
        switch (method_2()) {
            case X:
                System.out.println("X");
                break;
            default:
                System.out.println("default");
        }
    }

    public static @Nullable inner_class_1 method_2() {
        return null;
    }

    public static enum inner_class_1 {
        X
    }

}