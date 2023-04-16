public class _02_Exception_Handling_Using_TryCatch {
    
    public static void main(String[] args) {
        
        int a = 5 ;
        int b = 0 ;

        int result = 0 ;

        try{
            result = a / b ;
        }catch(Exception obj){
            System.out.println("Something went wrong .. " + obj);
        }

        System.out.println("Result is : " + result);
        System.out.println("Bye bye..");
    }
}
