public class _13_Valid_Parentheses_Using_Recursion {
    public static void main(String[] args) {

        validParentheses(2, 0, 0, "");

    }

    public static void validParentheses(int n, int oc, int cc, String str) {

        if (oc == n && cc == n) {
            System.out.println(str);
            return;
        }

        if (oc < n) {
            validParentheses(n, oc + 1, cc, str + "(");
        }
        if (oc > cc) {
            validParentheses(n, oc, cc + 1, str + ")");
        }
    }
}