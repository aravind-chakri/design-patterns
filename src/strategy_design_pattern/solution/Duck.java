package strategy_design_pattern.solution;

import strategy_design_pattern.solution.behaviour_interfaces.FlyingBehaviour;
import strategy_design_pattern.solution.behaviour_interfaces.QuackingBehaviour;

public abstract class Duck {

    FlyingBehaviour flyingBehaviour;
    QuackingBehaviour quackingBehaviour;

    public void swim() {
        System.out.println("I am swimming");
    }

    public abstract void display();

    public void makeSound() {
        quackingBehaviour.quack();
    }

    public void performFly() {
        flyingBehaviour.fly();
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public void setQuackingBehaviour(QuackingBehaviour quackingBehaviour) {
        this.quackingBehaviour = quackingBehaviour;
    }
}
