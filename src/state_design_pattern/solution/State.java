package state_design_pattern.solution;

/**
 * State interface
 */
public interface State {
    void insertCoin();
    void ejectCoin();
    void turnCrank();
    void dispense();
}
