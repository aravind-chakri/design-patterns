package singleton_design_pattern.solution;

/**
 * Bill Pugh Singleton (Recommended approach)
 * Uses inner static helper class for lazy loading
 * Thread-safe without synchronization overhead
 */
public class BillPughSingleton {
    
    private BillPughSingleton() {
        System.out.println("BillPughSingleton instance created");
    }
    
    // Inner static class - loaded only when getInstance() is called
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
    
    public void showMessage() {
        System.out.println("Bill Pugh Singleton instance");
    }
}
