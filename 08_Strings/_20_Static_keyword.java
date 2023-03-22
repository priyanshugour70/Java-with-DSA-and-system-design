class Student
{
    int age = 5;    // instance variable, non - static variable
    static String school;  // non - instance variable, static variable

    static 
    {
        school = "PW";
    }

    public void show()
    {
        System.out.println("in show " + age + " " + school); // static variable can be accessed in non-static method
    }
    public static void study()
    {
        System.out.println("studying ");    // non-static variable cannot be accessed here
    }
}

public class _20_Static_keyword
{

    static{
        System.out.println("in static block");
    }

    public static void main(String[] args) {

        System.out.println("in main method");

        Student obj = new Student();

        Student.study();
        obj.age = 19;
        obj.school = "PWSkills"; // Student.school = "PWSkills";

        Student obj1 = new Student();
        System.out.println(obj1.school);

        obj.show(); // in show 19 PWSkills
        obj1.show();    // in show 0 ?

    }    
}