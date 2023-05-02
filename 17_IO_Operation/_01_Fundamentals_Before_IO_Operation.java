class Student {
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString() {
        return "Name : " + name + " | Age : " + age + " | City : " + city;
    }
}

public class _01_Fundamentals_Before_IO_Operation {
    public static void main(String[] args) {

        Student stu1 = new Student("John", 18, "New York");
        System.out.println(stu1);
        Student stu2 = new Student("Tom", 23, "New York");
        System.out.println(stu2);
    }
}