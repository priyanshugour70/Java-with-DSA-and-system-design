// Encapsulation in Java is a fundamental concept in object-oriented programming that allows the programmer to hide the implementation details of a class from other classes. Encapsulation provides data security, code reusability, and modularity.

class Student {

    private String myName ;
    private int myAge ;

    public void setData() {
        myName = "Priyanshu Gour" ;
        myAge = 18 ;
    }

    public void showData(){
        System.out.println(myName + " " + myAge);
    }
}

public class _01_Introduction_to_Encapsulation {
    
    public static void main(String args[]){

        Student s1 = new Student();

        s1.showData();
        s1.setData();
        s1.showData();
    }
}