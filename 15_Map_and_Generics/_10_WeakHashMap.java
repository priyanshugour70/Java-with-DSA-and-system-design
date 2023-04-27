import java.util.*;

class Employee1 {
    private String name;
    private int empId;

    public Employee1(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public String toString() {
        return empId + "";
    }

    @Override
    public void finalize() {
        System.out.println("clean up work  by GC before de allocating memoery from heap");

    }

}

public class _10_WeakHashMap {
    public static void main(String[] args) {

        Employee1 e = new Employee1("Hyder", 171);

        WeakHashMap hm = new WeakHashMap();
        hm.put(e, "Hyder");
        System.out.println(hm);

        e = null;// eligible for garbage collection

        System.gc(); // invocking garbage collector

        System.out.println(hm);

        System.out.println("Last line");

    }

}