package factory_method_design_pattern.problem;

/**
 * Problem: Direct object creation using 'new' keyword
 * - Tight coupling between client and concrete classes
 * - Hard to extend with new types
 * - Violates Open/Closed Principle
 */
public class Document {
    private String type;
    
    public Document(String type) {
        this.type = type;
        System.out.println("Creating " + type + " document");
    }
    
    public void open() {
        System.out.println("Opening " + type + " document");
    }
    
    public void save() {
        System.out.println("Saving " + type + " document");
    }
}
