class Student1{
    private Heart h ;

    public Student1(Heart h){
        this.h = h ;
    }

    public void setH(Heart h){
        this.h = h ;
    }


    public void call(){
        h.heartBeatr();
    }
}


class Heart{

    public void heartBeatr(){
        System.out.println("heart is important ..!");
    }
}


public class _28_Dependency_Injection {
    
    public static void main(String[] args) {
        // Dependency Injection (DI) is a design pattern used in software engineering that allows for the creation of loosely coupled code. In DI, the dependencies of a class are not instantiated within the class itself, but are instead passed in from outside. This helps to improve the testability, maintainability, and flexibility of the code.

        Heart h = new Heart();

        Student1 s = new Student1(h);
        s.setH(h);
        
    }
}
