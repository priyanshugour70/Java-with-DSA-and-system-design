public class _08_length_vs_lengthMethod {
    
    public static void main(String args[]){

    // In Java, length and length() are used to get the length of an array and the length of a String respectively.


        // length is a field that is used to get the length of an array.
        // length is a property of an array in Java that returns the number of elements in the array. It is not a method and does not require parentheses. Here's an example:
        int[] numbers = {1, 2, 3, 4, 5};
        int lengthOfNumbers = numbers.length;
        System.out.println("The length of the numbers array is: " + lengthOfNumbers);
        
        // length in 2D Array
        int arr[][] = {
                        {1,2,3,4},
                        {5,6,6},
                        {7,9,9,10} 
                    };
    
            System.out.println("Using length : " + arr.length );
            System.out.println("Using length : " + arr[0].length);


            
        // length() is a method that is used to get the length of a string or a collection.
        // length() is a method of the String class in Java that returns the number of characters in the String. It is a method and requires parentheses. Here's an example:
        String greeting = "Hello, World!";
        int lengthOfGreeting = greeting.length();
        System.out.println("The length of the greeting String is: " + lengthOfGreeting);

        



    }
}
