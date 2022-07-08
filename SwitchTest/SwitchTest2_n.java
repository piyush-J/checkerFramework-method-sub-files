import org.checkerframework.checker.nullness.qual.*;

public class SwitchTest2_n {
    public static void method_1() {
        //dummy_lines
        switch (method_2()) {
            case X:
                System.out.println("X");
                break;
            default:
                System.out.println("default");
        }
    }

    public static inner_class_1 method_2() {
        return inner_class_1.X;
    }

    public static enum inner_class_1 {
        X
    }

}