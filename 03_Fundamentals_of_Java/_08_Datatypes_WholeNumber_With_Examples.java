public class _08_Datatypes_WholeNumber_With_Examples {
    

    public static void main (String args []){

        // To manage Whole number type of Data ... 
            // Ex :- byte, short, int, long 

        byte B = 10 ;
        System.out.println(B);

        // Byte can store 1Byte Data which means 8 bit.. 
        // the formula to find how many number store a byte .. is 
                // n = bits
                // -2pow(n-1)  to  2pow(n-1)-1
                // -2pow(8-1)  to 2pow(8-1)-1
                // -2pow(7)  to  2 pow(7)-1
                // -128  to  127

                // -128 to 127 the Range of Byte Datatype 

        // Example of Byte Datatype sum :-
        byte x = 10 ;
        byte y = 20 ;

        // byte sm = x+y ;
        int sum = x+y ;
        System.out.println(sum);


        short S = 20 ;
        System.out.println(S);

        // Short can store 2Byte Data which means 16 bit.. 
        // the formula to find how many number store a Short .. is 
                // n = bits
                // -2pow(n-1)  to  2pow(n-1)-1
                // -2pow(16-1)  to 2pow(16-1)-1
                // -2pow(15)  to  2 pow(15)-1
                // -32768  to  32767

                // -32768  to  32767 the Range of Short Datatype 


// Byte and Short are mainly use in 8086 processer or old processors .. we can use currently and maximum us of Int datatype
// java bydefault use Int

        int I = 30 ;
        System.out.println(I);

        // Int can store 4Byte Data which means 32 bit.. 
        // the formula to find how many number Int a byte .. is 
                // n = bits
                // -2pow(n-1)  to  2pow(n-1)-1
                // -2pow(32-1)  to 2pow(32-1)-1
                // -2pow(31)  to  2 pow(31)-1
                // -2147485648  to  2147485647

                // -2147485648  to  2147485647 the Range of Int Datatype 



        long L = 40l;
        System.out.println(L);

        // using long we use sufix means after the value we use small l or large L (l/L)

        // Long can store 8Byte Data which means 64 bit.. 
        // the formula to find how many number store a Long .. is 
                // n = bits
                // -2pow(n-1)  to  2pow(n-1)-1
                // -2pow(64-1)  to 2pow(64-1)-1
                // -2pow(63)  to  2 pow(63)-1
                // -2pow(63)  to  2 pow(63)-1

                // -2pow(63)  to  2 pow(63)-1 the Range of Long Datatype 

    }
}
