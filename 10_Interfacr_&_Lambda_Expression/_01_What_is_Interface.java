
interface P {
    String name = "Priyanshu Gour" ;
}


public class _01_What_is_Interface {
    
    public static void main(String[] args) {
        // It will allow only abstract methods.
        // It cannot be instantiated
        // Variables are "public static final".
        // Methods are "public and abstract". 
        // No Constructor in Interface

        String Name = P.name ;

        System.out.println(Name);

    }
}