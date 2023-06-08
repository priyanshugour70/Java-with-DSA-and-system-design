import java.util.*;

public class _06_validParenthesis_Using_Stack {

    public static boolean isValid(String str) {
        char[] charArr = str.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char i : charArr) {
            // 1. if the element contains open bracket, push it to the stack
            if (i == '(' || i == '{' || i == '[') {
                stack.push(i);
                continue;
            } else if (i == ')' || i == '}' || i == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if (i == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (i == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (i == ']' && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("Is the string valid: " + isValid(str));

        sc.close();
    }
}
