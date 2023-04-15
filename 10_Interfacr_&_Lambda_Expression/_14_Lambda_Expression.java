// A lambda expression in Java is a concise way to create an anonymous function, also known as a lambda function. It is a new feature added in Java 8 that simplifies the process of writing code for certain tasks that require the implementation of functional interfaces.

// To provide the implementation of Functional interface.
// Less Coding.

@FunctionalInterface
interface Year {
    void Age(int age);
}


public class _14_Lambda_Expression {
    public static void main(String[] args) {
        
        Year yr = (int age) -> {
            System.out.println("hey .. I am Priyanshu Gour and my Age is : " + age);
        };


        yr.Age(18);
    }
}
