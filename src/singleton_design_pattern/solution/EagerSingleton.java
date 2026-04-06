package singleton_design_pattern.solution;

/**
 * Eager Initialization Singleton
 * Instance is created at class loading time
 * Thread-safe but creates instance even if not needed
 */
public class EagerSingleton {
    
    // Instance created at class loading
    private static final EagerSingleton instance = new EagerSingleton();
    
    // Private constructor prevents instantiation from other classes
    private EagerSingleton() {
        System.out.println("EagerSingleton instance created");
    }
    
    public static EagerSingleton getInstance() {
        return instance;
    }
    
    public void showMessage() {
        System.out.println("Eager Singleton instance");
    }
}
