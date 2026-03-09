package strategy_design_pattern.solution;


import strategy_design_pattern.solution.flying_behaviour_implementations.FlyNoWings;
import strategy_design_pattern.solution.quacking_behaviour_implementations.Squeak;

public class RubberDuck extends Duck{

    public RubberDuck() {
        flyingBehaviour = new FlyNoWings();
        quackingBehaviour = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I am rubber duck");
    }
}
