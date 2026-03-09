package strategy_design_pattern.solution;

import strategy_design_pattern.solution.quacking_behaviour_implementations.Squeak;

public class StrategyDemo {

    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.makeSound();
        mallarDuck.setQuackingBehaviour(new Squeak());
        mallarDuck.makeSound();
        mallarDuck.performFly();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.makeSound();


    }
}
