public class _15_InnerClass {


    class Inner15 {
        
        void disp(){
            System.out.println("I am the Inner of the Class..");
        }
    }
    
    public static void main(String[] args) {
        
        _15_InnerClass.Inner15 e = new _15_InnerClass().new Inner15();

        e.disp();
    }
}