import java.util.*;

class Student {
    private String Name;
    private int ID;
}

class Employee {
    private String Name;
    private int ID;
}

public class _13_Generics {
    public static void main(String[] args) {

        Student std = new Student();
        Student std1 = new Student();

        Employee emp = new Employee();

        ArrayList<Student> al = new ArrayList<Student>();

        al.add(std);
        al.add(std1);
        // al.add(emp); // Its give error because type is Student
    }
}
