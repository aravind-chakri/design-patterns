package singleton_design_pattern.solution;

/**
 * Double-Checked Locking Singleton
 * Best approach for thread-safe lazy initialization
 * Reduces synchronization overhead
 */
public class DoubleCheckedLockingSingleton {
    
    // volatile keyword ensures visibility of changes across threads
    private static volatile DoubleCheckedLockingSingleton instance;
    
    private DoubleCheckedLockingSingleton() {
        System.out.println("DoubleCheckedLockingSingleton instance created");
    }
    
    public static DoubleCheckedLockingSingleton getInstance() {
        // First check without synchronization
        if (instance == null) {
            // Synchronized block for thread safety
            synchronized (DoubleCheckedLockingSingleton.class) {
                // Second check inside synchronized block
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
    
    public void showMessage() {
        System.out.println("Double-Checked Locking Singleton instance");
    }
}
