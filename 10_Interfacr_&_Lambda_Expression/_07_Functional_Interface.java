interface Interf{
    
    void m1();
    default void m3(){  
        System.out.println("m3-I");
    }
    
    static void m4(){
        System.out.println("m4-I");
    }
    
}
    
class A implements Interf{
    
    @Override
    public void m1(){
        System.out.println("m1-A");
    }
}
    
public class _07_Functional_Interface{
    
    public static void main(String args[]){
        Interf i=new A();
        i.m1();
        i.m3();
        Interf.m4();
    }    
}
