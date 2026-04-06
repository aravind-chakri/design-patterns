package prototype_design_pattern.problem;

public class PrototypeProblemDemo {
    
    public static void main(String[] args) {
        // Problem: Creating new objects is expensive
        
        // Creating object with expensive initialization
        System.out.println("Creating object1 (expensive operation)...");
        // ExpensiveObject obj1 = new ExpensiveObject();
        // obj1.loadHeavyData();
        
        // Need another similar object
        System.out.println("Creating object2 (expensive operation again)...");
        // ExpensiveObject obj2 = new ExpensiveObject();
        // obj2.loadHeavyData();
        
        /*
         * Problems:
         * - Object creation is expensive (time/resources)
         * - Repeated initialization overhead
         * - Complex object construction
         * - No way to copy existing objects efficiently
         * - Tight coupling with concrete classes
         */
    }
}
