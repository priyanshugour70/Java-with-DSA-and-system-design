public class _04_Decrementation_Operators {
    

    public static void main(String args []){

        // The decrementation operator in Java is represented by two consecutive minus signs (--). It is used to decrement the value of a variable by 1.


        int count = 0;
        count--; // post-decrement
        System.out.println(count); // prints -1
            
        int i = 5;
        int j = --i; // pre-decrement
        System.out.println(i); // prints 4
        System.out.println(j); // prints 4
    }
}
