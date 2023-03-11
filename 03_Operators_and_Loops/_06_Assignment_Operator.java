public class _06_Assignment_Operator {
    

    public static void main(String args []){

        // There are several types of assignment operators in Java:

        // Simple assignment operator =

        int a = 5;
        System.out.println(a);


        // Addition assignment operator +=

        int b = 5;
        b += 3; // equivalent to x = x + 3;
        System.out.println(b);


        // Subtraction assignment operator -=

        int c = 5;
        c -= 3; // equivalent to x = x - 3;
        System.out.println(c);


        // Multiplication assignment operator *=

        int d = 5;
        d *= 3; // equivalent to x = x * 3;
        System.out.println(d);


        // Division assignment operator /=

        int e = 5;
        e /= 3; // equivalent to x = x / 3;
        System.out.println(e);


        // Modulus assignment operator %=

        int f = 5;
        f %= 3; // equivalent to x = x % 3;
        System.out.println(f);

        a = b = c = d = e = f = 100 ;

        System.out.println(a);
    }
}
