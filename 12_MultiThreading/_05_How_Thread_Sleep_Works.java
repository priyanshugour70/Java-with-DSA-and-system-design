import java.util.*;

class calc extends Thread {

    public void run() {

        System.out.println("Calculation Task Started..!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first Number : ");
        int num1 = sc.nextInt();

        System.out.println("Please enter 2nd Number : ");
        int num2 = sc.nextInt();

        int result = num1 + num2;

        System.out.println(result);
        System.out.println("Calculation Task Ended ");

        System.out.println("***************************************************8");

        sc.close();
    }
}

class Message extends Thread {

    public void run() {
        System.out.println("Displaying important message task ");

        try {

            for (int i = 0; i < 3; i++) {
                System.out.println("Focus is important to master skills ");
                Thread.sleep(2000); // Milesecond 2000 = 2 sec.
            }
        } catch (Exception e) {
            System.out.println("Some Problem : " + e);
        }

        System.out.println("Displaying import message task ended ..!");
    }
}

public class _05_How_Thread_Sleep_Works {
    public static void main(String[] args) {

        System.out.println("Main Thread started ..!");

        calc cal = new calc();

        Message msg = new Message();

        cal.start();
        msg.start();
    }
}
