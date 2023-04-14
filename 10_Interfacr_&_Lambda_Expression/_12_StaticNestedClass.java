// Static Nested Class:
// A static nested class is defined inside another class but is marked as static. It does not have access to the members of the outer class, and it can be used as a helper class or a logical grouping of classes.



class Outer1 {
    static class StaticNested {
        public void print() {
            System.out.println("This is a static nested class.");
        }
    }
}

public class _12_StaticNestedClass {
    public static void main(String[] args) {
        Outer1.StaticNested nested = new Outer1.StaticNested();
        nested.print(); // prints "This is a static nested class."
    }
}

