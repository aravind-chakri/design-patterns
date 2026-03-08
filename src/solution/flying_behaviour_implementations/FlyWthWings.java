package solution.flying_behaviour_implementations;

import solution.behaviour_interfaces.FlyingBehaviour;

public class FlyWthWings implements FlyingBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings");
    }
}
