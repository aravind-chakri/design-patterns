package problem;

public class DuckDemo {
    public static void main(String[] args) {

        MallarDuck mallarDuck = new MallarDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        mallarDuck.fly();
        redheadDuck.quack();
        decoyDuck.fly();
        rubberDuck.swim();
    }

    /*
    This code works but by breaking SRP and OCP. Any change or modification needs
    lot-of manual intervention. Here we have different behaviours under fly and quack.
    We can make these ducks choose their behaviour dynamically during runtime.
     */
}
