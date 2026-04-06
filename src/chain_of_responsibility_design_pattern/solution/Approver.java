package chain_of_responsibility_design_pattern.solution;

/**
 * Abstract Handler
 */
public abstract class Approver {
    protected Approver nextApprover;
    
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
    
    public abstract void approve(int amount);
}
