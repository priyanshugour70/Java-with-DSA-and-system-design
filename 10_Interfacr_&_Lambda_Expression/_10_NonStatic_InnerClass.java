// Non-static or Inner Class:
// A non-static or inner class is defined inside another class and has access to all the members of the outer class, including private members. It is used to encapsulate a helper class or a stateful implementation of an interface.

class Outer {
    private int x = 10;
    
    class Inner {
        public void printX() {
            System.out.println(x);
        }
    }
}

public class _10_NonStatic_InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printX(); // prints 10
    }
}
