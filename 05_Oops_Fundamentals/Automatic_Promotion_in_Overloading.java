class Automatic {
    public static void Show(Byte n ){
        System.out.println("Byte : " + n);
    }

    public static void Show(Short n ){
        System.out.println("Short : " + n);
    }
    
    public static void Show(char n ){
        System.out.println("Char : " + n);
    }

    public static void Show(int n ){
        System.out.println("Int : " + n);
    }

    public static void Show(double n ){
        System.out.println("Double : " + n);
    }
}


public class Automatic_Promotion_in_Overloading {
    
    public static void main(String args []){
    
        // Automatic promotion in Java is a mechanism in which the parameters of a method are automatically converted to a larger data type if the original data type is smaller. This can happen during method overloading, which is the process of defining multiple methods with the same name in a class, but with different parameter types or number of parameters.
        // byte -> short -> int -> long -> float -> double

        
        
        // Automatic obj = new Automatic() ;

        // Byte a = 5 ;

        // obj.Show(a) ;
        // obj.Show('P');
        // obj.Show(5);

    }
}
