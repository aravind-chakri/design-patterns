package strategy_design_pattern.solution.quacking_behaviour_implementations;

import strategy_design_pattern.solution.behaviour_interfaces.QuackingBehaviour;

public class Mute implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("mute");
    }
}
