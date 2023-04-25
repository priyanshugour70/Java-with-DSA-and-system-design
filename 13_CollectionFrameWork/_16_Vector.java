import java.util.*;

public class _16_Vector {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        Enumeration enr = v.elements();

        while (enr.hasMoreElements()) {
            System.out.println(enr.nextElement());
        }

        Iterator itr = v.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(v);
    }
}