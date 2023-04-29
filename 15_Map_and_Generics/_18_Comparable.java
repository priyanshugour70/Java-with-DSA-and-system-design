import java.util.*;

class Engineers1 implements Comparable<Engineers1> {
    int ID;
    String Name;
    int Age;

    public Engineers1(int ID, String Name, int Age) {
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

    public int compareTo(Engineers1 engin) {
        if (this.Age > engin.Age) {
            return 1;
        } else {
            return -1;
        }
    }

}

public class _18_Comparable {
    public static void main(String[] args) {

        // Comparable interface:
        // The Comparable interface is defined in the java.lang package and contains
        // only one method called compareTo(). This method compares the current object
        // with another object of the same class and returns a negative integer, zero,
        // or a positive integer depending on whether the current object is less than,
        // equal to, or greater than the other object.

        Engineers1 eng1 = new Engineers1(1001, "Devanshu Gour", 16);
        Engineers1 eng2 = new Engineers1(1005, "Harshita Gour", 14);
        Engineers1 eng3 = new Engineers1(1003, "Pramod Gour", 42);
        Engineers1 eng4 = new Engineers1(1002, "Priyanshu Gour", 18);
        Engineers1 eng5 = new Engineers1(1004, "Anju Gour", 36);

        List<Engineers1> eng = new ArrayList<>();
        eng.add(eng1);
        eng.add(eng2);
        eng.add(eng3);
        eng.add(eng4);
        eng.add(eng5);

        Collections.sort(eng);
        System.out.println(eng);

    }
}
