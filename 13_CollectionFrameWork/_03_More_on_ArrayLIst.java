import java.util.*;

public class _03_More_on_ArrayLIst {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);

        // Check if value is present or not in list in ArrayList..
        System.out.println(list.contains(200));

        // Find Index of the Element
        System.out.println(list.indexOf(400));

        // ensureCapacity(); this method functionality is to reserve memory or extra
        // memory.
        list.ensureCapacity(10);

        // Size of the memory.
        System.out.println(list.size());

        // trimToSize(); this method is to remove extra reserve memory in ArrayList.
        list.trimToSize();

        // We create new ArrayList using parent class(polymorphism);
        List list2 = new ArrayList();

        list2.add("I ");
        list2.add("am ");
        list2.add("Priyanshu ");
        list2.add("Gour..!");

        System.out.println(list2);

    }
}
