package chain_of_responsibility_design_pattern.solution;

import chain_of_responsibility_design_pattern.solution.handlers.*;

public class ChainOfResponsibilityDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Chain of Responsibility Pattern Demo ===\n");
        
        // Create handlers
        Approver juniorManager = new JuniorManager();
        Approver seniorManager = new SeniorManager();
        Approver director = new Director();
        Approver ceo = new CEO();
        
        // Build chain
        juniorManager.setNextApprover(seniorManager);
        seniorManager.setNextApprover(director);
        director.setNextApprover(ceo);
        
        // Test different amounts
        System.out.println("--- Approval Requests ---");
        juniorManager.approve(50);
        juniorManager.approve(250);
        juniorManager.approve(750);
        juniorManager.approve(1500);
        
        /*
         * Benefits:
         * - Decouples sender from receiver
         * - Each handler has single responsibility
         * - Easy to add/remove handlers
         * - Flexible chain configuration
         * - Request can be handled by multiple handlers
         * - Follows Open/Closed Principle
         */
    }
}
