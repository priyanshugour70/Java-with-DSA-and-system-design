public class _18_StringBuffer_vs_StringBuilder {
    
    public static void main(String[] args) {
        
        // StringBuffer..
        // Indroduce in JDK: 1.0 version
        // In StringBuffer at a time single Thread 
        // Use Synchronized
        // performance is low as compare to StringBuilder

        // StringBuilder..
        // Indroduce in JDK: 1.5 version
        // In StringBuilder at a time MuliThread Possible
        // Not-Used Synchronized
        // performance is high as compare to StringBuffer

    }
}
