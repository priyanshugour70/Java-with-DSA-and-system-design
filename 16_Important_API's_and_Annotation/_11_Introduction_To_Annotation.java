@FunctionalInterface // This is Kown as Annotation in java
interface Demo {
    void disp();
    // void disp2();
}

class Plane {
    public void FlyPlane() {
        System.out.println("This Plane is Flying in the Sky..!");
    }
}

class CargoPlane extends Plane {

    @Override // This is Kown as Annotation in java
    public void FlyPlane() {
        System.out.println("This Name is CargoPlane ..! ");
    }
}

public class _11_Introduction_To_Annotation {
    public static void main(String[] args) {

        Plane pln = new CargoPlane();
        pln.FlyPlane();

        Demo dmo = () -> {
            System.out.println("Hey I am Fuctional Interface");
        };

        System.out.println(dmo);

    }
}

// In Java, the @ symbol is used to denote annotations, which provide metadata
// about the code they are attached to. Here are some commonly used annotations
// in Java and their meanings:

// @Override: This annotation is used to indicate that a method in a subclass is
// intended to override a method in its superclass. If the method signature does
// not match the overridden method, a compilation error will be thrown.

// @SuppressWarnings: This annotation is used to suppress compiler warnings for
// a given method, class, or variable. It can be used to silence warnings about
// unchecked casts, deprecation, and other potentially problematic code.

// @Deprecated: This annotation is used to mark a class, method, or variable as
// deprecated. It indicates that the code should no longer be used and may be
// removed in future versions of the API.

// @SafeVarargs: This annotation is used to suppress compiler warnings that may
// occur when using a varargs parameter of a generic type. It indicates that the
// method is safe to use with varargs, even though the compiler cannot verify
// it.

// @FunctionalInterface: This annotation is used to indicate that an interface
// is intended to be a functional interface, which means it has a single
// abstract method. This is used in conjunction with lambda expressions and
// functional programming in Java.