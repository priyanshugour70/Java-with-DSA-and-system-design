import java.util.*;

class calc1 implements Runnable {

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

class Message1 implements Runnable {

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

public class _06_using_Runable_Interface_create_a_Thread {
    public static void main(String[] args) {

        System.out.println("Main Thread started ..!");

        calc1 cal1 = new calc1();
        Message1 msg1 = new Message1();

        Thread t1 = new Thread(cal1);
        Thread t2 = new Thread(msg1);

        t1.start();
        t2.start();
    }
}
