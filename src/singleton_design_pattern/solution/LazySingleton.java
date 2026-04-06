package singleton_design_pattern.solution;

/**
 * Lazy Initialization Singleton
 * Instance is created only when needed
 * NOT thread-safe - use only in single-threaded applications
 */
public class LazySingleton {
    
    private static LazySingleton instance;
    
    private LazySingleton() {
        System.out.println("LazySingleton instance created");
    }
    
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
    
    public void showMessage() {
        System.out.println("Lazy Singleton instance");
    }
}
