public class _05_Incrementation_and_Decrementation_Example {
    

    public static void main(String args []){
        
        int a = 10;
        int b = 5;

        // Pre-increment operator
        System.out.println("a = " + (++a)); // Output: a = 11
        System.out.println("b = " + (++b)); // Output: b = 6

        // Post-increment operator
        System.out.println("a = " + (a++)); // Output: a = 11
        System.out.println("b = " + (b++)); // Output: b = 6

        // Pre-decrement operator
        System.out.println("a = " + (--a)); // Output: a = 10
        System.out.println("b = " + (--b)); // Output: b = 5

        // Post-decrement operator
        System.out.println("a = " + (a--)); // Output: a = 10
        System.out.println("b = " + (b--)); // Output: b = 5

        // Complex example
        int x = 5;
        int y = ++x * 2; // y = 12, x = 6
        int z = x-- + 5; // z = 11, x = 5

        System.out.println("y = " + y); // Output: y = 12
        System.out.println("z = " + z); // Output: z = 11
        System.out.println("x = " + x); // Output: x = 5


        int p = 5 ;
        int d = p++ + ++p + --p ;
        System.out.println("P is " + p);
        System.out.println("D is " + d);

    }
}
