import java.util.*;

class Engineers {
    int ID;
    String Name;
    int Age;

    public Engineers(int ID, String Name, int Age) {
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String toString() {
        return "" + ID + " : " + Name + " , " + Age + "";
    }
}

// // Create a Class for Comparator
// class Alpha implements Comparator<Engineers> {
// public int compare(Engineers a, Engineers b) {
// if (a.Age > b.Age) {
// return 1;
// } else {
// return -1;
// }
// }
// }

public class _17_Comparator {
    public static void main(String[] args) {
        // Comparator interface:
        // The Comparator interface is defined in the java.util package and contains two
        // methods: compare() and equals(). The compare() method compares two objects of
        // the same class based on a specific property and returns a negative integer,
        // zero, or a positive integer depending on the comparison result. The equals()
        // method is used to check if two Comparator objects are equal.

        Engineers eng1 = new Engineers(1001, "Devanshu Gour", 16);
        Engineers eng2 = new Engineers(1005, "Harshita Gour", 14);
        Engineers eng3 = new Engineers(1003, "Pramod Gour", 42);
        Engineers eng4 = new Engineers(1002, "Priyanshu Gour", 18);
        Engineers eng5 = new Engineers(1004, "Anju Gour", 36);

        // Alpha a = new Alpha();

        // Comparator using Lambda
        Comparator<Engineers> comparator = (Engineers a, Engineers b) -> {
            if (a.Age > b.Age) {
                return 1;
            } else {
                return -1;
            }
        };

        List<Engineers> eng = new ArrayList<>();
        eng.add(eng1);
        eng.add(eng2);
        eng.add(eng3);
        eng.add(eng4);
        eng.add(eng5);

        // Collections.sort(eng, (Engineers a, Engineers b) -> {
        // if (a.Age > b.Age) {
        // return 1;
        // } else {
        // return -1;
        // }
        // });
        Collections.sort(eng, comparator);
        System.out.println(eng);

    }
}
