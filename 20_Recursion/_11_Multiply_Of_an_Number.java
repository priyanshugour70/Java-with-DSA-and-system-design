import java.util.Scanner;

// Time Complexity : O()
// Space Complexity : O()

public class _11_Multiply_Of_an_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int num = sc.nextInt();

        System.out.print("Enter Time's To Multiply : ");
        int mul = sc.nextInt();

        multiply(num, mul);

        sc.close();
    }

    // Code For finding Multipul's
    public static void multiply(int num, int mul) {

        if (mul == 1) {
            System.out.println(num);
            return;
        } else {
            multiply(num, mul - 1);
            System.out.println(num * mul);
        }
    }
}
