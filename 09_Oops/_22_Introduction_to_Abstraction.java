// abstraction is the concept of hiding the implementation details of a class and exposing only the essential features to the outside world. Abstraction can be achieved in Java using abstract classes and interfaces.

// An abstract class is a class that cannot be instantiated and can contain both abstract and non-abstract methods. An abstract method is a method that has no implementation and is marked with the "abstract" keyword. It can only be declared in an abstract class or interface and must be implemented by a subclass or a concrete class that implements the interface.


abstract class Shape{

    // Never create Constructor, Variable to Abstract

    abstract void Type();

    abstract void Color();
}

class Rectangle extends Shape{

    @Override
    void Type(){
        System.out.println("2D Rectangle..");
    }

    @Override
    void Color(){
        System.out.println("Red Color..");
    }

    void Area(){
        System.out.println("100 m^sqr Area..");
    }
}

class Square extends Shape{

    @Override
    void Type(){
        System.out.println("2D Square..");
    }

    @Override
    void Color(){
        System.out.println("yello Color..");
    }
}

class Circle extends Shape{

    @Override
    void Type(){
        System.out.println("3D Circle..");
    }

    @Override
    void Color(){
        System.out.println("Orange Color..");
    }
}


public class _22_Introduction_to_Abstraction {
    
    public static void main(String[] args) {
        

        Shape sr = new Rectangle();

        sr.Color();
        sr.Type();
        ((Rectangle) sr).Area(); // Because Area is not present in Parent Class that's why we will type casting(Downcasting).


        Shape ss = new Square();
        
        ss.Color();
        ss.Type();
        
        Shape sc = new Circle();

        sc.Color();
        sc.Type();

    }
}
