package strategy_design_pattern.problem;

public class DecoyDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void quack() {
        System.out.println("Mute");
    }

    @Override
    public void swim() {
        System.out.println();
    }
}
