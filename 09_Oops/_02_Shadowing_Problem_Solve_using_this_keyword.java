
class Student {
    private String name ;

    // The this keyword refers to the current object in a method or constructor. 
    // The most common use of the this keyword is to eliminate the confusion between class attributes and parameters
    // with the same name (because a class attribute is shadowed by a method or constructor parameter).
    
    public void setData(String name) {
        this.name = name ;  
    }

    public String getData (){
        return name ;
    }
}

public class _02_Shadowing_Problem_Solve_using_this_keyword {
    
    public static void main(String[] args) {
        
        Student s = new Student() ;

        s.setData("Priyanshu Gour");
    }
}