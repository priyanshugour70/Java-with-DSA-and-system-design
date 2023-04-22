public class _02_Change_Threads_Property {

    public static void main(String[] args) {

        System.out.println("Before Change Thread in java");

        String threadName = Thread.currentThread().getName();
        System.out.println("Name of the Current Thread is : " + threadName);

        long threadId = Thread.currentThread().getId();
        System.out.println("Id of the Current Thread is : " + threadId);

        int threadPriority = Thread.currentThread().getPriority();
        System.out.println("Priority of the Current Thread is : " + threadPriority);

        System.out.println("**********************************************");

        System.out.println("After Change Thread in java");

        Thread t = Thread.currentThread();

        t.setName("Priyanshu");
        t.setPriority(3);

        String threadName1 = Thread.currentThread().getName();
        System.out.println("Name of the Current Thread is : " + threadName1);

        int threadPriority1 = Thread.currentThread().getPriority();
        System.out.println("Priority of the Current Thread is : " + threadPriority1);

        System.out.println("**********************************************");

    }
}
