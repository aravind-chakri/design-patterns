package strategy_design_pattern.solution;

import strategy_design_pattern.solution.flying_behaviour_implementations.FlyWthWings;
import strategy_design_pattern.solution.quacking_behaviour_implementations.Quack;

public class MallarDuck extends Duck{

    public MallarDuck(){
        flyingBehaviour = new FlyWthWings();
        quackingBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a mallar duck");
    }
}
