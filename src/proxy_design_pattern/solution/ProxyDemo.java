package proxy_design_pattern.solution;

public class ProxyDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Proxy Pattern Demo ===\n");
        
        // Virtual Proxy - Lazy Initialization
        System.out.println("--- Virtual Proxy (Lazy Loading) ---");
        Image image1 = new ImageProxy("photo1.jpg");
        Image image2 = new ImageProxy("photo2.jpg");
        
        System.out.println("Images created (not loaded yet)\n");
        
        System.out.println("Displaying image1:");
        image1.display();  // Loads from disk
        
        System.out.println("\nDisplaying image1 again:");
        image1.display();  // Uses cached version
        
        System.out.println("\nDisplaying image2:");
        image2.display();  // Loads from disk
        
        // Protection Proxy - Access Control
        System.out.println("\n--- Protection Proxy (Access Control) ---");
        Internet internet = new ProxyInternet();
        
        internet.connectTo("google.com");
        internet.connectTo("blocked.com");
        internet.connectTo("stackoverflow.com");
        internet.connectTo("banned.com");
        
        /*
         * Benefits:
         * - Lazy initialization (Virtual Proxy)
         * - Access control (Protection Proxy)
         * - Remote proxy for distributed systems
         * - Caching proxy for performance
         * - Logging and monitoring
         * - Smart reference counting
         */
    }
}
