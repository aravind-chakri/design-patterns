package solution.quacking_behaviour_implementations;

import solution.behaviour_interfaces.QuackingBehaviour;

public class Squeak implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }
}
