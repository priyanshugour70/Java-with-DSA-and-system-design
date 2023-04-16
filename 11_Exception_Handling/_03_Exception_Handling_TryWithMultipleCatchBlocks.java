public class _03_Exception_Handling_TryWithMultipleCatchBlocks {
    
    public static void main(String[] args) {
        
        // In this code we will see how to include multipule CatchBlocks in a Exception Handling.. 


        int a = 5 ;
        int b = 0 ;

        int result = 0 ;

        int marks[] = {1,2,3,4,5} ;

        try{
            result = a / b ; 
            System.out.println(marks[7]);
        }catch(ArithmeticException c){
            System.out.println("you Can't divide by Zero : "+ c);
        }catch(ArrayIndexOutOfBoundsException d){
            System.out.println("Please write the index under the Range : " + d);
        }catch(Exception e ){
            System.out.println("Something went Wrong in this code : " + e);
        }

        System.out.println(result);
        System.out.println("Bye bye..!");
    }
}
