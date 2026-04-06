package chain_of_responsibility_design_pattern.solution.handlers;

import chain_of_responsibility_design_pattern.solution.Approver;

public class SeniorManager extends Approver {
    
    @Override
    public void approve(int amount) {
        if (amount <= 500) {
            System.out.println("Senior Manager approved $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approve(amount);
        }
    }
}
