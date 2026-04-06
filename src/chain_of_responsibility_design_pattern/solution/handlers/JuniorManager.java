package chain_of_responsibility_design_pattern.solution.handlers;

import chain_of_responsibility_design_pattern.solution.Approver;

public class JuniorManager extends Approver {
    
    @Override
    public void approve(int amount) {
        if (amount <= 100) {
            System.out.println("Junior Manager approved $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approve(amount);
        }
    }
}
