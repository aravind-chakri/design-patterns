package solution.quacking_behaviour_implementations;

import solution.behaviour_interfaces.QuackingBehaviour;

public class Mute implements QuackingBehaviour {
    @Override
    public void quack() {
        System.out.println("mute");
    }
}
