class Queue {

    int x;
    boolean flag = false;

    synchronized public void put(int j) {

        try {
            if (flag == true) {
                // wait() and notify() methods are used for inter-thread communication. The
                // wait() method causes the current thread to wait until another thread calls
                // the notify() method or the notifyAll() method on the same object.
                wait();
            } else {
                x = j;
                System.out.println("I have Produce value  x : " + x);
                flag = true;

                notify();
            }
        } catch (Exception e) {
            System.out.println("There is a an Exception : " + e);
        }
    }

    synchronized public void get() {

        try {
            if (flag == false) {
                wait();
            } else {
                System.out.println("I have Consume value x : " + x);
                flag = false;
                notify();
            }
        } catch (Exception e) {
            System.out.println("There is a an Exception : " + e);
        }

    }
}

class Producer extends Thread {

    Queue q;

    Producer(Queue b) {
        q = b;
    }

    public void run() {
        int i = 1;

        while (true) {
            q.put(i++);
        }
    }
}

class Consumer extends Thread {

    Queue q;

    Consumer(Queue c) {
        q = c;
    }

    public void run() {

        while (true) {
            q.get();
        }
    }

}

public class _14_Producer_and_Consumer {
    public static void main(String[] args) {

        Queue q = new Queue();

        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.start();
        c.start();
    }
}