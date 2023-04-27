import java.util.*;

class Employee {
    private String name;
    private int empId;

    public Employee(String name, int empId) {
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

public class _09_HashMap {
    public static void main(String[] args) {

        Employee e = new Employee("Hyder", 171);

        HashMap hm = new HashMap();
        hm.put(e, "Hyder");
        System.out.println(hm);

        e = null;// eligible for garbage collection

        System.gc(); // invocking garbage collector

        System.out.println(hm);

        System.out.println("Last line");

    }

}