import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.dataflow.qual.Pure;

public class RequiresNonNullTest2_n {

    @Nullable Object variable_1;
    @Nullable Object variable_2;

    @RequiresNonNull("field1")
    void method_1() {
        //dummy_lines
        variable_1.toString(); // OK, field1 is known to be non-null
        this.variable_1.toString(); // OK, field1 is known to be non-null
        // :: error: (dereference.of.nullable)
        variable_2.toString(); // error, might throw NullPointerException
    }
    @RequiresNonNull("field1")
    void method_2() {
        //dummy_lines
        // ok, precondition satisfied by NNOE
        method_1();
    }
}