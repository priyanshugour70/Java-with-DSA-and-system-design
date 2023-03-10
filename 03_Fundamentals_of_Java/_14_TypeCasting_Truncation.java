public class _14_TypeCasting_Truncation {
    

    public static void main(String agrs[]){


        // In Java, truncation refers to the process of removing the decimal part of a floating-point number and returning the integer part.
        // One way to perform truncation in Java is by casting the floating-point number to an integer type. This will discard the decimal part and return the integer part. Here's an example:

        double number = 3.14159;
        int truncatedNumber = (int) number;
        System.out.println("Truncated number: " + truncatedNumber);


        // truncation
        int n1 = 12 ;
        int n2 = 5 ;
        float res = n1/n2 ;

        System.out.println(res); // Ans is 2.4 but due to truncation ANS is 2.0 
    }
}
