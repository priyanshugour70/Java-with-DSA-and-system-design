public class _01_Introduction_to_Multithreading {

    public static void main(String[] args) {

        // Multithreading in Java allows multiple threads of execution to run
        // concurrently within the same program, allowing for more efficient use of
        // system resources. This can be particularly useful for applications that
        // require parallel processing or handling of multiple tasks simultaneously.

        System.out.println("Main Thread in java");

        String threadName = Thread.currentThread().getName();
        System.out.println("Name of the Current Thread is : " + threadName);

        long threadId = Thread.currentThread().getId();
        System.out.println("Id of the Current Thread is : " + threadId);

        int threadPriority = Thread.currentThread().getPriority();
        System.out.println("Priority of the Current Thread is : " + threadPriority);

    }
}