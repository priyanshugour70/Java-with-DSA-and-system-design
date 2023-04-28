import java.util.*;

public class _15_Collections_Class_and_Its_Inbuilt_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(30);
        list.add(75);
        list.add(55);
        list.add(25);

        // For Sorting
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // For Searching
        int index = Collections.binarySearch(list, 55); // This Method works only Sorted Collection because it use
                                                        // BinarySearch Algorithm
        System.out.println("Index of 55 is : " + index); // If Collection Return the negative Value it means Data is not
                                                         // present in The Collection.

        System.out.println("**********************************");

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Pramod Gour");
        list1.add("Anju Gour");
        list1.add("Priyanshu Gour");
        list1.add("Devanshu Gour");
        list1.add("Harshita Gour");

        // For Sorting
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        // For Searching
        int index1 = Collections.binarySearch(list1, "Priyanshu Gour"); // This Method works only Sorted Collection
                                                                        // because it use BinarySearch Algorithm
        System.out.println("Index of Priyanshu Gour is : " + index1); // If Collection Return the negative Value it
                                                                      // means Data is not present in The Collection.

        System.out.println("**********************************");
    }
}
