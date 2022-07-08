import org.checkerframework.checker.nullness.qual.*;

@org.checkerframework.framework.qual.DefaultQualifier(Nullable.class)
public class ArrayArgs3_y {

    public void method_1(@NonNull String[] variable_1) {
    }
    public void method_1(Class<@NonNull ? extends java.lang.annotation.Annotation> variable_2) {
    }

    public void method_1() {
        method_1(NonNull.class);
        //dummy_lines
        String[] variable_3 = new String[] {null, null, null};
        // :: error: (argument.type.incompatible)
        method_1(variable_3);
        String[] variable_4 = new String[] {"hello", null, "goodbye"};
        // :: error: (argument.type.incompatible)
        method_1(variable_4);
        // :: error: (assignment.type.incompatible)
        @NonNull String[] variable_5 = new String[] {"hello", null, "goodbye"};
        // :: error: (new.array.type.invalid)
        @NonNull String[] variable_6 = new String[3];

        // TODO: when issue 25 is fixed, the following is safe
        // and no error needs to be raised.
        String[] variable_7 = new String[] {"hello", "goodbye"};
        // :: error: (argument.type.incompatible)
        method_1(variable_7);
        @NonNull String[] variable_8 = new String[] {"hello", "goodbye"};
        method_1(variable_8);
    }
}