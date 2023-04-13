interface A {
    void Show();

    default void DefMethod(){
        System.out.println("I am Default Method..!");
    }

    static void StaMethod(){
        System.out.println("I am Static Method..!");
    }
}

class B implements A{

    @Override
    public void Show(){
        System.out.println("Hey I am Show..!");
    }

    @Override
    public void DefMethod(){
        System.out.println("Hey I am Default Method ..!");
    }

    public void StaMethod(){
        System.out.println("hey I am Static method ..!");
    }
}


public class _06_Java8_Features {
    public static void main(String[] args) {
        
        // Default Methods:
        // Default methods allow you to add functionality to interfaces without breaking existing implementations. 


        
        A b = new B() ;
        
        A.StaMethod();
        
        b.Show();
        b.DefMethod();

    }
}
