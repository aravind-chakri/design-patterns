package composite_design_pattern.problem;

public class CompositeProblemDemo {
    
    public static void main(String[] args) {
        // Problem: Treating individual objects and compositions differently
        
        System.out.println("Drawing individual shapes:");
        // circle.draw();
        // rectangle.draw();
        
        System.out.println("\nDrawing group of shapes:");
        // Must handle each shape individually
        // for (Shape shape : shapes) {
        //     shape.draw();
        // }
        
        /*
         * Problems:
         * - Cannot treat individual objects and compositions uniformly
         * - Client code needs to know if dealing with leaf or composite
         * - Complex code to traverse hierarchical structures
         * - Difficult to add new component types
         * - No uniform interface for tree structures
         */
    }
}
