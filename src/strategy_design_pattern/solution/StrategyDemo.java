package strategy_design_pattern.solution;

import strategy_design_pattern.solution.quacking_behaviour_implementations.Squeak;

public class StrategyDemo {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.makeSound();
        mallardDuck.setQuackingBehaviour(new Squeak());
        mallardDuck.makeSound();
        mallardDuck.performFly();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.makeSound();


    }
}
