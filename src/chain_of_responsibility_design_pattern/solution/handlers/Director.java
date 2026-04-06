package chain_of_responsibility_design_pattern.solution.handlers;

import chain_of_responsibility_design_pattern.solution.Approver;

public class Director extends Approver {
    
    @Override
    public void approve(int amount) {
        if (amount <= 1000) {
            System.out.println("Director approved $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approve(amount);
        }
    }
}
