public class _19_split_Method_String {
    
    public static void main(String[] args) {
        
        // The split() method in Java is used to split a string into an array of substrings based on a specified delimiter. It takes a regular expression as its argument and returns an array of strings.

        String str = "Hello World i am Java";
        String[] arr = str.split(" ");
        System.out.println(arr[1]);
        
    }
}