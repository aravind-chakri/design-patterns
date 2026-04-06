package state_design_pattern.solution;

public class StateDemo {
    
    public static void main(String[] args) {
        System.out.println("=== State Pattern Demo ===\n");
        
        GumballMachine machine = new GumballMachine(3);
        
        System.out.println("--- First purchase ---");
        machine.insertCoin();
        machine.turnCrank();
        
        System.out.println("\n--- Second purchase ---");
        machine.insertCoin();
        machine.turnCrank();
        
        System.out.println("\n--- Trying without coin ---");
        machine.turnCrank();
        
        System.out.println("\n--- Third purchase ---");
        machine.insertCoin();
        machine.turnCrank();
        
        System.out.println("\n--- Trying when sold out ---");
        machine.insertCoin();
        machine.turnCrank();
        
        /*
         * Benefits:
         * - Eliminates complex conditional logic
         * - Each state encapsulated in its own class
         * - Easy to add new states
         * - State transitions are explicit
         * - Follows Single Responsibility Principle
         * - Follows Open/Closed Principle
         */
    }
}
