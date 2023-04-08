
// Final Class: A final class in Java can't be extended or subclassed. It means that the class can't be inherited by any other class. To declare a class as final, the final keyword is used before the class name.
/* final */class MyFinalClass{

    // Final Variable: A final variable in Java can only be initialized once and its value can't be changed later. To declare a variable as final, the final keyword is used before the variable name.
    final int myNumber = 10;

    // Final Method: A final method in Java can't be overridden by any subclass. To declare a method as final, the final keyword is used before the method signature.
    final void myMethod() {
        // Method implementation
        System.out.println("Hey i am Fianl myMethod..");
     }
}


// class MyChildClass extends MyFinalClass{  // We can't create a child class of a final class
class MyChildClass extends MyFinalClass{

    

}

public class _23_Final_Keyword_in_java {
    
    public static void main(String[] args) {
        
        MyChildClass mcc = new MyChildClass();

        mcc.myMethod();

    }
}
