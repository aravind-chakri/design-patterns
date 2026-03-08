package solution.quacking_behaviour_implementations;

import solution.behaviour_interfaces.QuackingBehaviour;

public class Quack implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }
}
