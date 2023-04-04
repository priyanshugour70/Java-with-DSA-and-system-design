class Human{  // Super class // Base Class // Parent Class

    int age ;
    void sleep(){
        age = 18 ;
        System.out.println(age + " Hours needed to a Human . ");
    }
}

class Student extends Human{ // child class // sub class // derived class

}

public class _08_Introduction_to_Inheritance {
    
    public static void main(String[] args) {
        // Inheritance is a fundamental concept in object-oriented programming, 
        // which allows a class to inherit properties and behavior from another 
        // class. In Java, inheritance is achieved by using the "extends" keyword 
        // to create a subclass that inherits from a superclass.


        Student st = new Student() ;

        st.sleep();
    }
}