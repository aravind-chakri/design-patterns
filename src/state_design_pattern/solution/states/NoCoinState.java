package state_design_pattern.solution.states;

import state_design_pattern.solution.GumballMachine;
import state_design_pattern.solution.State;

public class NoCoinState implements State {
    private GumballMachine machine;
    
    public NoCoinState(GumballMachine machine) {
        this.machine = machine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
        machine.setState(machine.getHasCoinState());
    }
    
    @Override
    public void ejectCoin() {
        System.out.println("No coin to eject");
    }
    
    @Override
    public void turnCrank() {
        System.out.println("Insert coin first");
    }
    
    @Override
    public void dispense() {
        System.out.println("Pay first");
    }
}
