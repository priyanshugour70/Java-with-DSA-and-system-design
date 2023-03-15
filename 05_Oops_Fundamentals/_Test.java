public class _Test {
    
    int Age = 0 ;  // Instance Variable
    String Name = "Priyanshu Gour" ;  // Instance Variable

    public static void main(String ags[]){
        
        int Num = 10 ;  // Local Variable

        _Test obj1 = new _Test() ;  // Object Creation 
        _Test obj2 = new _Test() ;  // Object Creation

        obj1.Name = "Devanshu Gour" ;
        obj1.Age = 16 ;

        System.out.println(Num);

        System.out.println(obj1.Age);
        System.out.println(obj1.Name);

        System.out.println(obj2.Age);
        System.out.println(obj2.Name);
    }
}