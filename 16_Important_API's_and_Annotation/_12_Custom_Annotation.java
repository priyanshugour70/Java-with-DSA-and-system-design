import java.lang.annotation.*;
import java.lang.reflect.*;
// In Java, custom annotation is a feature that allows programmers to create their own annotations that can be used to add metadata to classes, methods, fields, or other program elements. Custom annotations can be used to add extra information to the code, such as documentation, runtime behavior, or configuration data.

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CustomAnnotation {

    String value();

    int count() default 1;
}

public class _12_Custom_Annotation {

    @CustomAnnotation(value = "example", count = 3)
    public void myMethod() {
        // method body
    }

    public static void main(String[] args) {
        _12_Custom_Annotation obj = new _12_Custom_Annotation();
        Class<? extends _12_Custom_Annotation> clazz = obj.getClass();

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(CustomAnnotation.class)) {
                CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Value: " + annotation.value());
                System.out.println("Count: " + annotation.count());
            }
        }
    }
}
