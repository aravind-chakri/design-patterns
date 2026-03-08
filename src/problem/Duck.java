package problem;

public abstract class Duck {


    public void swim() {
        System.out.println("I'm swimming");
    }

    public abstract void display();

    /*
    * Implemented fly and quack behaviours concretely which can vary from duck to duck.
    * Rubber duck can't quack. Like-wise decoy duck can't fly and quack
    * Now I need to override these methods in my subclasses to exhibit different behaviour.
    * Or I need to write multiple if else conditions with in fly and quack to make them work for different ducks.
    * But this violates the SRP and OCP desgin principles if
    * Let's see how we can solve this using Strategy desgin pattern.
    * */


    /*
    * Few ducks might not have wings to fly. In that case we need to override this method*/
    public void fly() {
        System.out.println("I'm flying");
    }

    /*
    * Rubber duck and decoy duck cannot quack.
    * We need to override this behaviour in that case or change concrete implementation
    * to quack according to subtype.
    * But when we want to add a new quacking behaviour. It's open for modifying which breaks OCP*/
    public void quack() {
        System.out.println("Quack Quack");
    }

    /*
    To fix this issue, we need to follow few design principles. First one would be,
    Separate code that is varying from what is not varying.
    Here fly and quack behaviour varies based on the subclass of Duck.
    So we separate to take fly and quack behaviour implementation from Duck class

    Second Desgin Principle:
    We need to program to an interface but not to implementation.
    Which means, we need to create an Interface and program to it. Instead of Keeping all
    fly or quack behaviours tightly coupled.

    Third Design Principle:
    We should consider composition over inheritance.
     */
}
