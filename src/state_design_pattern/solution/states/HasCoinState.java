package state_design_pattern.solution.states;

import state_design_pattern.solution.GumballMachine;
import state_design_pattern.solution.State;

public class HasCoinState implements State {
    private GumballMachine machine;
    
    public HasCoinState(GumballMachine machine) {
        this.machine = machine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Can't insert another coin");
    }
    
    @Override
    public void ejectCoin() {
        System.out.println("Coin ejected");
        machine.setState(machine.getNoCoinState());
    }
    
    @Override
    public void turnCrank() {
        System.out.println("Crank turned");
        machine.setState(machine.getSoldState());
    }
    
    @Override
    public void dispense() {
        System.out.println("Turn crank first");
    }
}
