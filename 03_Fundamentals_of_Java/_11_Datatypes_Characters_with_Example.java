public class _11_Datatypes_Characters_with_Example {
    

    public static void main(String args[]){
        
        // Characters DataTypes
            // char :- 'a', 'A', 'P' ;


            // ASCII : American Standard Code for Information Interchange
            // In ASCII total 128 Characters which means 2pow(7) roundfigure 8bits required means 1 Bytes. if java follow ASCII then char required 1 Byte .....


            // UTF : Unicode Transformation Format
            // In UTF total 65536 Characters which means 2pow(16) 16 bits required means 2 Bytes. if java follow UTF then char required 2 Bytes..... 


            // JAVA Follow's UTF
            // char required 2 Bytes Memory for any character store.. 


            // char hey = 'h' ;  valid
            // char hey = 'h', 'e' ; Invalid
            // char hey = 'he' ; Invalid


            char A = 'P' ;

            System.out.println(A);



    }
}
