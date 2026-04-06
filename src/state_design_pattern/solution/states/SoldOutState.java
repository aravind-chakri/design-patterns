package state_design_pattern.solution.states;

import state_design_pattern.solution.GumballMachine;
import state_design_pattern.solution.State;

public class SoldOutState implements State {
    private GumballMachine machine;
    
    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Sold out - cannot accept coin");
    }
    
    @Override
    public void ejectCoin() {
        System.out.println("No coin to eject");
    }
    
    @Override
    public void turnCrank() {
        System.out.println("Sold out");
    }
    
    @Override
    public void dispense() {
        System.out.println("No gumballs to dispense");
    }
}
