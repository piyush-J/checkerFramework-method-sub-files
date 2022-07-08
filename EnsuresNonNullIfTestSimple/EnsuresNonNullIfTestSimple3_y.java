import org.checkerframework.checker.nullness.qual.*;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/*
 * These tests ensure that EnsuresNonNullIf methods
 * are verified.
 */
public class EnsuresNonNullIfTestSimple3_y {

    protected int @Nullable [] variable_1;

    @EnsuresNonNullIf(result = false, expression = "values")
    public boolean method_1() {
        return variable_1 == null;
    }

    public void method_2(EnsuresNonNullIfTestSimple3_y variable_2) {
        //dummy_lines
        if (method_1()) {
            return;
        }
        @NonNull Object variable_3 = variable_1;

        /* TODO skip-tests
         * The two errors are not raised currently
         * The assumption that "values" is NN is added above.
         * However, as repNulled is not pure, it should be removed again here.
        if (s.repNulled()) {
            // : : (dereference.of.nullable)
            values.hashCode();
        } else {
            // we called on "s", so we don't know anything about "values".
            // : : (assignment.type.incompatible)
            @NonNull Object y = values;
        }
        */

        if (variable_2.method_1()) {
            //dummy_lines
            // :: error: (dereference.of.nullable)
            variable_2.variable_1.hashCode();
        } else {
            @NonNull Object variable_4 = variable_2.variable_1;
        }
    }
}