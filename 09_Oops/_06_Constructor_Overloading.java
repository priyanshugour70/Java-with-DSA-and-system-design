class Student1 //extends Object
{
    private String name;
    private int age;

    public Student1()
    {
        System.out.println("Default Constructor is called");
        name="Rohan";
        age=18;
    }

    // Every Constructor have a inbilt Super() or This() Any one method . and Before executing Constructor any one super() or this() was run then Constructor..  
    public Student1(String name)
    {
        this.name=name;
        age=19;
    }
    public Student1(String name, int age)
    {
        
        this.name=name;
        this.age=age;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }
}


public class _06_Constructor_Overloading {
    public static void main(String[] args) {
        
        Student1 st1=new Student1();
        st1.disp();

        Student1 st2=new Student1("Rahul");
        st2.disp();

    }
}
