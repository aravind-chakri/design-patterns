package problem;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am a rubber duck");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void quack() {
        System.out.println("Squeak Squeak");
    }
}
