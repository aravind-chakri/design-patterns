package abstract_factory_design_pattern.problem;

/**
 * Problem: Creating families of related objects without abstraction
 * Tight coupling and hard to maintain consistency
 */
public class AbstractFactoryProblemDemo {
    
    public static void main(String[] args) {
        String theme = "Modern";
        
        // Problem: Client needs to know all concrete classes
        // Hard to ensure consistency across related objects
        if (theme.equals("Modern")) {
            System.out.println("Creating Modern UI");
            System.out.println("Modern Button created");
            System.out.println("Modern Checkbox created");
            System.out.println("Modern TextField created");
        } else {
            System.out.println("Creating Classic UI");
            System.out.println("Classic Button created");
            System.out.println("Classic Checkbox created");
            System.out.println("Classic TextField created");
        }
        
        /*
         * Problems:
         * - Client code needs to know all concrete classes
         * - Hard to add new themes (requires changing client code)
         * - Risk of mixing incompatible objects (Modern button with Classic checkbox)
         * - Violates Open/Closed Principle
         * - No guarantee of consistency across product families
         */
    }
}
