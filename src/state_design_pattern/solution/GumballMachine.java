package state_design_pattern.solution;

import state_design_pattern.solution.states.*;

/**
 * Context class
 */
public class GumballMachine {
    private State noCoinState;
    private State hasCoinState;
    private State soldState;
    private State soldOutState;
    
    private State currentState;
    private int count;
    
    public GumballMachine(int count) {
        this.count = count;
        
        // Initialize states
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        
        // Set initial state
        currentState = count > 0 ? noCoinState : soldOutState;
    }
    
    public void insertCoin() {
        currentState.insertCoin();
    }
    
    public void ejectCoin() {
        currentState.ejectCoin();
    }
    
    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }
    
    public void setState(State state) {
        this.currentState = state;
    }
    
    public void releaseBall() {
        System.out.println("A gumball comes rolling out...");
        if (count > 0) {
            count--;
        }
    }
    
    // Getters for states
    public State getNoCoinState() { return noCoinState; }
    public State getHasCoinState() { return hasCoinState; }
    public State getSoldState() { return soldState; }
    public State getSoldOutState() { return soldOutState; }
    public int getCount() { return count; }
}
