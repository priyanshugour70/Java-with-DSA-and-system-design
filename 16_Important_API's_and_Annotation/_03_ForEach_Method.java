import java.util.*;

public class _03_ForEach_Method {
    public static void main(String[] args) {

        java.util.List<Integer> list1 = new java.util.ArrayList<Integer>();

        list1.add(20);
        list1.add(40);
        list1.add(60);
        list1.add(80);
        list1.add(100);
        System.out.println("Normal Input print : " + list1);

        for (Integer i : list1) {
            System.out.println(i);
        }

        System.out.println("**********************************************");

        List<Integer> list2 = Arrays.asList(10, 30, 50, 70, 90);
        System.out.println("Sort Input print : " + list2);

        for (Integer i : list2) {
            System.out.println(i);
        }

        System.out.println("**********************************************");

        System.out.println("Modern ForEach Loop using Lambda .. !");
        list1.forEach(n -> System.out.println(n));
        // list1.forEach((Integer n) -> System.out.println(n)); // Both are same

    }
}
