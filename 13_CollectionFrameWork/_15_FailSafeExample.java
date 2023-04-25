import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class _15_FailSafeExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
            list.add(4); // This will not throw ConcurrentModificationException in a fail-safe collection
        }
    }
}
