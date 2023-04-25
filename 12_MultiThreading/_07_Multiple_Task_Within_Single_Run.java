import java.util.*;

class MyThread extends Thread {

    public void run() {

        String TName = Thread.currentThread().getName();

        if (TName.equals("calc2")) {
            calc2();
        } else {
            ImpMessage();
        }
    }

    public void calc2() {
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

    public void ImpMessage() {
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

public class _07_Multiple_Task_Within_Single_Run {
    public static void main(String[] args) {

        System.out.println("Main Thread started ..!");

        MyThread mt = new MyThread();
        MyThread mt1 = new MyThread();

        mt.setName("calc2");
        mt1.setName("ImpMessage");

        mt.start();
        mt1.start();
    }
}
