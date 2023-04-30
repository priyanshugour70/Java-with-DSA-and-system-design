
// enum
enum Week {
    MON, TUE, WED, THR, FRI, SAT, SUN
}

public class _08_Introduction_to_enum {

    enum Result {
        PASS, FAIL, NR;
    }

    public static void main(String[] args) {

        // In Java, an enum is a special data type that allows you to define a set of
        // named constants. An enum is declared using the enum keyword and it can have
        // its own methods, constructors, and fields.

        // One of the main benefits of using enums is that they provide type safety,
        // meaning that the compiler can verify that the values assigned to an enum are
        // valid. This helps to prevent programming errors and makes code easier to read
        // and maintain.

        // Another benefit of enums is that they allow you to group related constants
        // together and define behavior for those constants. For example, you could
        // define methods within an enum to perform operations on the constants, or to
        // retrieve additional information about each constant.

        // Enums also have several properties that make them useful in programming. For
        // example:

        // Enums are implicitly final and cannot be subclassed, ensuring that the set of
        // constants remains fixed.

        // Enums are comparable and can be used in switch statements.

        // Enums can be used in annotations, allowing you to associate metadata with
        // specific constants.

        // Some common use cases for enums include:

        // Defining a set of options for a parameter or configuration value.

        // Grouping related constants together for use in conditional logic.

        // Creating an enumerated type to represent a specific domain concept or entity.

        // In summary, enums provide a type-safe and organized way to define a set of
        // named constants in Java. They offer several benefits, including type safety,
        // readability, and maintainability, and can be used in a variety of programming
        // scenarios.

        Week m = Week.MON;
        System.out.println(m);

        Result r = Result.PASS;
        System.out.println(r);

        // It's Return Index of enum.
        int index = Week.SUN.ordinal();
        System.out.println(index);

        // It's Return Array.. of Week.
        Week wk[] = Week.values();
        for (Week w : wk) {
            System.out.println(w + " : " + w.ordinal());
        }
    }
}
