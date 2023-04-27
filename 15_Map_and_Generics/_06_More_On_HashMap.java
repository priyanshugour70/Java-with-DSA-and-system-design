import java.util.*;

import java.util.Map.Entry;

class Student {

    private String Name;
    private int Age;
    private String City;

    public Student(String Name, int Age, String City) {
        this.Name = Name;
        this.Age = Age;
        this.City = City;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getCity() {
        return City;
    }

    // This is very Important
    public String toString() {
        return "( " + Name + " , " + Age + " , " + City + " )";
    }

}

public class _06_More_On_HashMap {
    public static void main(String[] args) {

        Student std1 = new Student("Priyanshu", 18, "Harda");
        Student std2 = new Student("Devanshu", 17, "Harda");
        Student std3 = new Student("Harshita", 13, "Harda");
        Student std4 = new Student("Suhani", 9, "Harda");

        Map map = new HashMap();

        map.put(1, std1);
        map.put(2, std2);
        map.put(3, std3);
        map.put(4, std4);

        System.out.println(map);

        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            // System.out.println(itr.next());
            Map.Entry data = (Entry) itr.next();
            System.out.println(data);
            System.out.println(data.getKey() + " : " + data.getValue());
        }

    }
}
