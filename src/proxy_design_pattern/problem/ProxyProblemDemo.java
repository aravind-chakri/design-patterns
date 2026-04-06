package proxy_design_pattern.problem;

public class ProxyProblemDemo {
    
    public static void main(String[] args) {
        // Problem: Direct access to expensive/sensitive resources
        
        System.out.println("Loading image from disk...");
        // ExpensiveImage img = new ExpensiveImage("large_photo.jpg");
        // img.display();  // Loads immediately even if not needed
        
        System.out.println("\nAccessing sensitive data...");
        // SensitiveData data = new SensitiveData();
        // data.read();  // No access control
        
        /*
         * Problems:
         * - No lazy initialization (loads even if not needed)
         * - No access control or authentication
         * - No caching
         * - No logging or monitoring
         * - Cannot add pre/post processing
         * - Direct coupling with real object
         */
    }
}
