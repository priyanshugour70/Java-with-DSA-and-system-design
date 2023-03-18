class print {


    public int printArray(int arr[]){
        
        int result = 0 ;

        for(int n : arr){
            result += n ;
        }

        return result ;

    }
}

public class _09_Anonymous_Array {
    
    public static void main(String args[]){
        

        //  In Java, an anonymous array is an array that is declared and instantiated without assigning it to a variable. This means that the array is created and used all in one line of code, without giving it a name.

        print obj = new print() ;

        int arr [] = {1,2,3,4,5,6,7,8,9,10} ;
        
        
        int Sum1 = obj.printArray(arr) ; // Normal Array ..
        int Sum2 = obj.printArray(new int[]{1,2,3,4,5,6,7,8,9,10} ) ;  // Anonymous Array..


        System.out.println(Sum1);
        System.out.println(Sum2);
    }
}
