class Human1{

    private String Name ;
    int Age ;
    
    void setName(){
        Name = "Priyanshu gour" ;
        System.out.println(Name);
    }
    
    Human1(){
        System.out.println("Human class Constructor..");
    }

    void sleep(){
        Age = 8 ;
        System.out.println("Atlest " + Age + " Age year older then you will drive..");
    }
}

class Student1 extends Human1 {

    // public Student1(){
    //     super();  // By default the constructor call the Super Method and Super() method is call the Parent Constructor
    // }

    void disp(){
        System.out.println(Age + "is my Age.. ");
        // System.out.println("my Name is " + Name); // We don't Access the (Private Member) of any class.
    }
}

public class _09_More_On_Inheritance {
    
    public static void main(String[] args) {
        
        Student1 st1 = new Student1();
        
        st1.sleep();
        st1.disp();
    }
}
