public class _11_Switch_case {
    

    public static void main(String args[]){


        // In Java, the switch statement allows you to execute different code blocks based on the value of a variable or an expression. There are several types of switch statements available in Java, including:


        // Switch statement with a single value: This type of switch statement allows you to test a variable or an expression against a single value. If the value matches the case label, the corresponding code block is executed.
        int num = 2;
        switch(num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid number");
        }

        

        
    }
}
