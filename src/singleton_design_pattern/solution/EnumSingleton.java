package singleton_design_pattern.solution;

/**
 * Enum Singleton (Most robust approach)
 * Protects against reflection and serialization attacks
 * Thread-safe by default
 */
public enum EnumSingleton {
    INSTANCE;
    
    // Constructor
    EnumSingleton() {
        System.out.println("EnumSingleton instance created");
    }
    
    public void showMessage() {
        System.out.println("Enum Singleton instance");
    }
}
