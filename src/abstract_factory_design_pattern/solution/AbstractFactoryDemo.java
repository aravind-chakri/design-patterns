package abstract_factory_design_pattern.solution;

public class AbstractFactoryDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Abstract Factory Pattern Demo ===\n");
        
        // Modern Theme
        System.out.println("--- Creating Application with Modern Theme ---");
        UIFactory modernFactory = new ModernUIFactory();
        Application modernApp = new Application(modernFactory);
        modernApp.render();
        System.out.println("\nInteracting with Modern UI:");
        modernApp.interact();
        
        System.out.println("\n--- Creating Application with Classic Theme ---");
        UIFactory classicFactory = new ClassicUIFactory();
        Application classicApp = new Application(classicFactory);
        classicApp.render();
        System.out.println("\nInteracting with Classic UI:");
        classicApp.interact();
        
        /*
         * Benefits:
         * - Ensures consistency - all objects from same family
         * - Loose coupling - client works with interfaces
         * - Easy to add new product families (themes)
         * - Single Responsibility Principle - creation code in one place
         * - Open/Closed Principle - can extend without modifying existing code
         * - No risk of mixing incompatible objects
         */
    }
}
