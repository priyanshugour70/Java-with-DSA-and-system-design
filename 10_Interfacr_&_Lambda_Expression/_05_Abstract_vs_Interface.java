// both interfaces and abstract classes are used to define abstract types that cannot be instantiated on their own, but they serve different purposes.
// An interface in Java defines a contract of behavior that a class can implement. It specifies a set of methods that a class must provide, but it does not provide any implementation for those methods. An interface can also define constants and default methods. Any class that implements an interface must provide an implementation for all the methods specified by the interface.
// An abstract class in Java is a class that cannot be instantiated on its own, but it can have abstract methods (methods without a body) and concrete methods (methods with a body). Abstract classes can also have instance variables, constructors, and static methods. Abstract methods in an abstract class are meant to be implemented by its subclasses.

// Interface definition
interface Vehicle {
    void start();
    void stop();
}

// Abstract class definition
abstract class Car implements Vehicle {
    protected String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + " is starting...");
    }

    // Abstract method
    abstract void drive();

    @Override
    public void stop() {
        System.out.println(model + " is stopping...");
    }
}

// Concrete class that extends the abstract class
class Sedan extends Car {
    public Sedan(String model) {
        super(model);
    }

    @Override
    public void drive() {
        System.out.println(model + " is driving...");
    }
}

// Main program
public class _05_Abstract_vs_Interface {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("BMW");
        sedan.start();
        sedan.drive();
        sedan.stop();
    }
}