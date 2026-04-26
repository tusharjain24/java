package annotations;

/*
 1. They are not compiled and hence not executed. They are just a meta data about
 the code.
 2. They don't have any functionality, but they can be used to provide functionality to
 the code.
 3. They are used to provide extra information to the compiler or to the runtime environment.
 4. Examples: @Override, @Deprecated, @SuppressWarnings, etc.
 */
public class AnnotationDemo {
    @Override
    public String toString() {
        return super.toString();
    }
}
