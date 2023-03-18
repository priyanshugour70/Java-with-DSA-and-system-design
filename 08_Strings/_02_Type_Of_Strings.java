public class _02_Type_Of_Strings {
    
    public static void main(String args[]){
        //  Types of String

        //  In java Strings are classified into 2 types
        //  1. Mutable String
        //  2. Immutable String


        // Mutable String
        
        // Once if we create a String, on that String if we try to perform any operation and
        // if those changes get reflected in the same object then such strings are called
        // “Mutable String”. 
        // Example: StringBuffer, StringBuilder
        StringBuilder name = new StringBuilder("Priyanshu Gour");
        System.out.println(name);
        name.append(" From Bhopal"); // Mutable String
        System.out.println(name);


        // Immutable String

        // Once if we create a String, on that String if we try to perform any operation
        // then those changes won’t be reflected in the same object, rather a new object
        // will be created.Such type of String is called as “Immutable String”.
        // Example: String
        String myName = "Priyanshu Gour" ;
        System.out.println(myName);
        myName.concat(" From Bhopal"); // Immutable String
        System.out.println(myName);     

    }
}
