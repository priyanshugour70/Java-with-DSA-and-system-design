
class MyThread extends Thread {

    public void run() {
        System.out.println("Child Thread ..!");
    }
}

public class _03_How_To_Create_Threads {

    public static void main(String[] args) {

        Thread t = new MyThread();
        t.start();
        System.out.println("Main Thread..");
    }
}