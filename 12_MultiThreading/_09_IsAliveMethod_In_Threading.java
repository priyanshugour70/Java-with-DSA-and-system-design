class myThread1 implements Runnable {

    public void run() {

        for (int i = 0; i < 3; i++) {
            System.out.println("Hey I am Working on myThread");
            try {
                Thread.sleep(3000); // 3 sec in 3000 milesecond
            } catch (Exception e) {
                System.out.println("If An Any Exception : " + e);
            }
        }
    }
}

public class _09_IsAliveMethod_In_Threading {
    public static void main(String[] args) {

        System.out.println("Main Thread is Started ...");

        myThread1 mt = new myThread1();

        Thread th = new Thread(mt);

        System.out.println(th.isAlive());
        // isAlive() is a method that checks whether a thread is still running or has
        // finished executing. It returns a boolean value of true if the thread is still
        // running, and false if it has finished.

        th.start();

        System.out.println(th.isAlive());

        System.out.println("Main Thread is Ended ...");

    }
}
