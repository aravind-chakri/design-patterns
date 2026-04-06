package singleton_design_pattern.solution;

/**
 * Thread-Safe Singleton with synchronized method
 * Thread-safe but synchronized method reduces performance
 */
public class ThreadSafeSingleton {
    
    private static ThreadSafeSingleton instance;
    
    private ThreadSafeSingleton() {
        System.out.println("ThreadSafeSingleton instance created");
    }
    
    // Synchronized method ensures thread safety but impacts performance
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    
    public void showMessage() {
        System.out.println("Thread-Safe Singleton instance");
    }
}
