public class _09_Datatypes_RealNubmer_with_Example {
    

    public static void main(String args[]){

        // To manage Real number type of Data ... 
            // Ex :- float, double ;
            

            float F = 40.454f;
            System.out.println(F);
    
            // using float we use sufix means after the value we use small f or large F (f/F)
            // In float we use after the decimal 7digit decimal points..

            // float can store 4Byte Data which means 64 bit.. 
            // the formula to find how many number store a float .. is 
                    // n = bits
                    // -2pow(n-1)  to  2pow(n-1)-1
                    // -2pow(32-1)  to 2pow(32-1)-1
                    // -2pow(31)  to  2 pow(31)-1
                    // -2147485648  to  2147485647
    
                    // -2147485648  to  2147485647 the Range of foat Datatype 




            double D = 30.32542 ;
            System.out.println(D);

            // In double we use after the decimal 14digit decimal points..
    
            // double can store 8Byte Data which means 64 bit.. 
            // the formula to find how many number double a byte .. is 
                    // n = bits
                    // -2pow(n-1)  to  2pow(n-1)-1
                    // -2pow(64-1)  to 2pow(64-1)-1
                    // -2pow(63)  to  2 pow(63)-1
                    // -2pow(63)  to  2 pow(63)-1
    
                    // -2pow(63)  to  2 pow(63)-1 the Range of double Datatype 


    }
}
