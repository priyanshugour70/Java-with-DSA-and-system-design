class myThread2 implements Runnable {

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

public class _10_Interrupt_In_Threading {
    public static void main(String[] args) {

        System.out.println("Main Thread Start..");

        myThread2 mt = new myThread2();

        Thread thr = new Thread(mt);

        thr.start();
        thr.interrupt();
        // interrupt() is a method used to interrupt a thread that is currently running.
        // When interrupt() is called on a thread, it sets a flag on the thread
        // indicating that it has been interrupted, which can be checked using the
        // isInterrupted() method.

        System.out.println("Main Thread Closed.. ");
    }
}
