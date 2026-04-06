package state_design_pattern.solution.states;

import state_design_pattern.solution.GumballMachine;
import state_design_pattern.solution.State;

public class SoldState implements State {
    private GumballMachine machine;
    
    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("Please wait, dispensing gumball");
    }
    
    @Override
    public void ejectCoin() {
        System.out.println("Already turned crank");
    }
    
    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get another gumball");
    }
    
    @Override
    public void dispense() {
        machine.releaseBall();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoCoinState());
        } else {
            System.out.println("Out of gumballs!");
            machine.setState(machine.getSoldOutState());
        }
    }
}
