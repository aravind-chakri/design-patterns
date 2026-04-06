package state_design_pattern.problem;

public class StateProblemDemo {
    
    public static void main(String[] args) {
        // Problem: Complex conditional logic based on state
        
        String state = "NO_COIN";
        
        if (state.equals("NO_COIN")) {
            System.out.println("Insert coin");
            state = "HAS_COIN";
        }
        
        if (state.equals("HAS_COIN")) {
            System.out.println("Turn crank");
            state = "SOLD";
        }
        
        if (state.equals("SOLD")) {
            System.out.println("Dispensing gumball");
            state = "NO_COIN";
        }
        
        /*
         * Problems:
         * - Complex nested if/else statements
         * - Hard to add new states
         * - State transitions scattered throughout code
         * - Difficult to maintain and understand
         * - Violates Open/Closed Principle
         * - Not object-oriented approach
         */
    }
}
