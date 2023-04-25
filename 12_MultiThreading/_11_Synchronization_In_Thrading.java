class Car implements Runnable {

    synchronized public void run() {
        // the synchronized keyword is used to provide mutual exclusion and ensure that
        // only one thread at a time can execute a block of code or access a shared
        // resource. This is important in multi-threaded applications to prevent race
        // conditions and other synchronization issues.

        try {
            System.out.println(Thread.currentThread().getName() + " : go to the Parking ..");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " : Start Finding The Car..");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " : Car Was Founded in Parking..");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " : Start the Car And go to Travling");
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + " : There is an Exception : " + e);
        }
    }
}

public class _11_Synchronization_In_Thrading {
    public static void main(String[] args) {

        Car car = new Car();

        Thread tc1 = new Thread(car);
        Thread tc2 = new Thread(car);
        Thread tc3 = new Thread(car);

        try {
            tc1.setName("First Person ");
            tc2.setName("Second Person ");
            tc3.setName("Third Person ");
        } catch (Exception e) {
            System.out.println("There is an Exception.. " + e);
        }

        tc1.start();
        tc2.start();
        tc3.start();

    }
}
