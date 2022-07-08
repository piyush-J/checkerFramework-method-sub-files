import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.*;

public class PureTest1_n {
    //dummy_lines
    @org.checkerframework.dataflow.qual.Pure
    @Nullable Object method_1(@Nullable Object variable_1) {
        return variable_1;
    }
}