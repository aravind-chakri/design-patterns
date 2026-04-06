package strategy_design_pattern.solution;

import strategy_design_pattern.solution.flying_behaviour_implementations.FlyWithWings;
import strategy_design_pattern.solution.quacking_behaviour_implementations.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyingBehaviour = new FlyWithWings();
        quackingBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
