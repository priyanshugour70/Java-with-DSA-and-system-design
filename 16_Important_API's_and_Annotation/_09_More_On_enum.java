
enum Home {
    Priyanshu, Devanshu, Harshita, Shuhani;

    // Bee Hind The Scenes
    // public static final Result Priyanshu =new Home();
    // public static final Result Devanshu =new Home();
    // public static final Result Harshita =new Home()
    // public static final Result Shuhani =new Home()
    // It's mean perticular Constant Coverted in a Object Bee hind the Scenes

    int marks;

    Home() {
        System.out.println("Welcome To the Home..!");
    }

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }
}

public class _09_More_On_enum {
    public static void main(String[] args) {

        // If we can't set marks then output is Zero(0)
        Home.Priyanshu.setMarks(80);
        int m1 = Home.Priyanshu.getMarks();
        System.out.println("Priyanshu's marks are " + m1);

        Home.Devanshu.setMarks(90);
        int m2 = Home.Devanshu.getMarks();
        System.out.println("Devanshu's marks are " + m2);

        Home.Harshita.setMarks(70);
        int m3 = Home.Harshita.getMarks();
        System.out.println("Harshita's marks are " + m3);

        Home.Shuhani.setMarks(90);
        int m4 = Home.Shuhani.getMarks();
        System.out.println("Shuhani's marks are " + m4);

    }
}
