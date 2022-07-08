import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/** Test case for issue 53: https://github.com/typetools/checker-framework/issues/53 */
public class EnsuresNonNullIfTest27_y {

    private @Nullable Long variable_1;
    //dummy_lines
    @EnsuresNonNullIf(result = true, expression = "id")
    public boolean method_1() {
        return variable_1 != null;
    }

    @EnsuresNonNullIf(result = true, expression = "id")
    public boolean method_2() {
        return this.variable_1 != null;
    }

    @EnsuresNonNullIf(result = true, expression = "this.id")
    public boolean method_3() {
        return variable_1 != null;
    }

    @EnsuresNonNullIf(result = true, expression = "this.id")
    public boolean method_4() {
        return this.variable_1 != null;
    }

    void method_5() {
        //dummy_lines
        if (method_1()) {
            variable_1.toString();
        }
        if (method_2()) {
            variable_1.toString();
        }
        if (method_3()) {
            variable_1.toString();
        }
        if (method_4()) {
            variable_1.toString();
        }
        // :: error: (dereference.of.nullable)
        variable_1.toString();
    }
}