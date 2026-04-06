package strategy_design_pattern.solution.flying_behaviour_implementations;

import strategy_design_pattern.solution.behaviour_interfaces.FlyingBehaviour;

public class FlyWithWings implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings");
    }
}
