import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.Pure;

public class RequiresNonNullTest6_n {

    @Nullable Object variable_1;
    @Nullable Object variable_2;

    protected @Nullable Object variable_3;
    //dummy_lines
    @RequiresNonNull("field")
    public void method_1() {}

    public void method_2(RequiresNonNullTest6_n variable_4) {
        //dummy_lines
        variable_4.variable_3 = new Object();
        // note that the following line works
        @NonNull Object variable_5 = variable_4.variable_3;

        variable_4.method_1(); // OK, field is known to be non-null
    }
}