class myThread implements Runnable {

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

public class _08_JoinMethod_In_Threading {
    public static void main(String[] args) {

        System.out.println("Hey Main Thread Was Started ..");
        myThread t1 = new myThread();

        Thread t2 = new Thread(t1);

        t2.start();

        try {
            t2.join();
            // join() is a method that waits for a thread to complete its execution before
            // moving on to the next line of code. This is often used to ensure that a
            // thread has finished before continuing with the rest of the program
        } catch (Exception e) {
            System.out.println("There is an Exception : " + e);
        }

        System.out.println("Hey Main Thread Was Started ..");

    }
}
