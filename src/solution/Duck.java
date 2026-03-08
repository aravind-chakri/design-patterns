package solution;

import solution.behaviour_interfaces.FlyingBehaviour;
import solution.behaviour_interfaces.QuackingBehaviour;

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
