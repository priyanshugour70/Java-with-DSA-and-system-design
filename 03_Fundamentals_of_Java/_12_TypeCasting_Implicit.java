public class _12_TypeCasting_Implicit {
    

    public static void main(String args[]){
        
        // In Java, typecasting is the process of converting one data type into another. There are two types of typecasting: implicit and explicit.
    

        // Implicit Typecasting: Implicit typecasting, also known as widening, occurs when a data type of lower range is converted into a data type of higher range. Java performs implicit typecasting automatically without the need for any explicit instructions. For example:
        
        int num1 = 10;
        double num2 = num1; // Implicit typecasting from int to double
        System.out.println(num2); // Output: 10.0

    }
}
