package solution;

import solution.flying_behaviour_implementations.FlyWthWings;
import solution.quacking_behaviour_implementations.Quack;

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
