class Library implements Runnable {

    String std1 = new String("Java");
    String std2 = new String("JavaScript");
    String std3 = new String("ReactJs");

    public void run() {

        String Name = Thread.currentThread().getName();
        if (Name.equals("Student1")) {
            try {

                Thread.sleep(3000);
                synchronized (std1) {
                    System.out.println(Thread.currentThread().getName() + " I have a Book which name is : " + std1);
                    Thread.sleep(3000);
                    synchronized (std2) {
                        System.out
                                .println(
                                        Thread.currentThread().getName() + " I have also Book which name is : " + std2);
                        Thread.sleep(3000);
                        synchronized (std3) {
                            System.out.println(Thread.currentThread().getName() + " Also Book which name is : " + std3);
                            Thread.sleep(3000);
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println("There is a an Exception..");
            }
        } else {
            try {

                Thread.sleep(3000);
                synchronized (std1) {
                    System.out.println(Thread.currentThread().getName() + " I have a Book which name is : " + std1);
                    Thread.sleep(3000);
                    synchronized (std2) {
                        System.out
                                .println(
                                        Thread.currentThread().getName() + " I have also Book which name is : " + std2);
                        Thread.sleep(3000);
                        synchronized (std3) {
                            System.out.println(Thread.currentThread().getName() + " Also Book which name is : " + std3);
                            Thread.sleep(3000);
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println("There is a an Exception..");
            }
        }
    }
}

public class _13_DeadLock_In_Threading {
    public static void main(String[] args) {

        Library li = new Library();

        Thread s1 = new Thread(li);
        Thread s2 = new Thread(li);

        s1.setName("Student1");
        s2.setName("Student2");

        s1.start();
        s2.start();

    }
}
