import org.checkerframework.checker.initialization.qual.UnknownInitialization;
import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@org.checkerframework.framework.qual.DefaultQualifier(Nullable.class)
public class RawMethodInvocation3_y {
    Object variable_1;
    Object variable_2;

    RawMethodInvocation3_y(boolean variable_3) {
        variable_1 = 1;
        method_1();
    }

    @EnsuresNonNull("b")
    void method_1(@UnknownInitialization RawMethodInvocation this) {
        variable_2 = 2;
    }
    RawMethodInvocation3_y(int variable_4) {
        method_2();
    }

    @EnsuresNonNull({"a", "b"})
    void method_2(@UnknownInitialization RawMethodInvocation this) {
        variable_1 = 1;
        variable_2 = 2;
    }
    RawMethodInvocation3_y(long variable_5) {
        variable_1 = 1;
        //dummy_lines
        // this call is not valid, this is still raw
        // :: error: (method.invocation.invalid)
        method_3();
        variable_2 = 2;
    }

    void method_3() {}
}