import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.*;

public class PureTest14_n {
    //dummy_lines
    @org.checkerframework.dataflow.qual.Pure
    @Override
    @SideEffectFree
    public String method_1() {
        return "foo";
    }
}