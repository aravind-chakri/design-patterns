package prototype_design_pattern.solution;

public class PrototypeDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Prototype Pattern Demo ===\n");
        
        // Create original object (expensive)
        System.out.println("--- Creating Original Objects ---");
        Shape circle = new Shape("Circle", "Red", 0, 0);
        Shape rectangle = new Shape("Rectangle", "Blue", 0, 0);
        
        // Clone objects (cheap)
        System.out.println("\n--- Cloning Objects ---");
        Shape circle2 = (Shape) circle.clone();
        circle2.setPosition(10, 10);
        
        Shape circle3 = (Shape) circle.clone();
        circle3.setPosition(20, 20);
        
        Shape rectangle2 = (Shape) rectangle.clone();
        rectangle2.setPosition(30, 30);
        
        // Display all shapes
        System.out.println("\n--- All Shapes ---");
        circle.display();
        circle2.display();
        circle3.display();
        rectangle.display();
        rectangle2.display();
        
        /*
         * Benefits:
         * - Avoids expensive object creation
         * - Reduces initialization overhead
         * - Hides complexity of object creation
         * - Can create new objects at runtime
         * - Alternative to subclassing for variation
         * - Performance improvement for expensive objects
         */
    }
}
