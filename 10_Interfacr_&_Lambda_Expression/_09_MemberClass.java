
class Outer2 {
    void printNumbers() {
        int x = 10;
        System.out.println("This i printNumbers..!" + x);
    }

    int y = 100 ;

        class Local {
            public void printX() {
                System.out.println("Hey I am printX..!" + y);
            }
        }
}

public class _09_MemberClass {
    public static void main(String[] args) {

        Outer2 obj = new Outer2();
        obj.printNumbers();

        Outer2.Local obj1 = obj.new Local();

        obj1.printX();
    }
}
