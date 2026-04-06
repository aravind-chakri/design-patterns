package chain_of_responsibility_design_pattern.solution.handlers;

import chain_of_responsibility_design_pattern.solution.Approver;

public class CEO extends Approver {
    
    @Override
    public void approve(int amount) {
        System.out.println("CEO approved $" + amount);
    }
}
