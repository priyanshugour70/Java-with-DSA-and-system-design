class Student2 //extends Object
{
    private String name;
    private int age;

    public Student2()
    {
       // super();
       this("Rohit", 19);
        System.out.println("Default Constructor is called");
        name="Rohan";
        age=18;
    }

    // Every Constructor have a inbilt Super() or This() Any one method . and Before executing Constructor any one super() or this() was run then Constructor..  
    public Student2(String name)
    {
        this();
        this.name=name;
        age=19;
    }
    public Student2(String name, int age)
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


public class _07_this_Method_in_Constructor  {
    public static void main(String[] args) {
        
        Student2 st2=new Student2();
        st2.disp();

        Student2 st3=new Student2("Rahul");
        st3.disp();

    }
}

