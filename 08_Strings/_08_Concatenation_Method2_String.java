public class _08_Concatenation_Method2_String {
    
    public static void main(String[] args) {

        // Using (concat()) Concatenation in String
        String s1 = "Priyanshu"; // This variable value presten the Heap (SCP-String Constant Pool) ..

        String s2 = s1.concat("Gour"); // Using this Method and any pre-defined method or any refrence variable the new Object create in Heap. but outoff (SCP).(and one Copy of the value is also present in the SCP but NO one variable refer those value or copy) 

        System.out.println(s2); // Priyanshu Gour
    }
}
