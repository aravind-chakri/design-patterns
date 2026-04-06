package chain_of_responsibility_design_pattern.problem;

public class ChainOfResponsibilityProblemDemo {
    
    public static void main(String[] args) {
        int amount = 250;
        
        // Problem: Tightly coupled request handling with complex conditionals
        if (amount <= 100) {
            System.out.println("Junior Manager approved $" + amount);
        } else if (amount <= 500) {
            System.out.println("Senior Manager approved $" + amount);
        } else if (amount <= 1000) {
            System.out.println("Director approved $" + amount);
        } else {
            System.out.println("CEO approved $" + amount);
        }
        
        /*
         * Problems:
         * - Tight coupling between sender and receiver
         * - All logic in one place (violates Single Responsibility)
         * - Hard to add/remove handlers
         * - Cannot change order of processing
         * - No way to stop processing chain early
         * - Difficult to test individual handlers
         */
    }
}
