package singleton_design_pattern.problem;

public class SingletonProblemDemo {
    
    public static void main(String[] args) {
        // Problem: Multiple instances can be created
        DatabaseConnection connection1 = new DatabaseConnection();
        DatabaseConnection connection2 = new DatabaseConnection();
        DatabaseConnection connection3 = new DatabaseConnection();
        
        // Each instance is different
        System.out.println("connection1 == connection2: " + (connection1 == connection2));
        System.out.println("connection2 == connection3: " + (connection2 == connection3));
        
        /*
         * Problem: This creates 3 separate database connections
         * - Wastes resources
         * - Can lead to connection pool exhaustion
         * - No centralized control
         * - Inconsistent state across instances
         */
    }
}
