package decorator_design_pattern.solution;

import decorator_design_pattern.solution.beverages.Decaf;
import decorator_design_pattern.solution.beverages.Espresso;
import decorator_design_pattern.solution.decorator.Mocha;
import decorator_design_pattern.solution.decorator.Soy;
import decorator_design_pattern.solution.decorator.Whip;

public class OrderDemo {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " costs Rupees: " + beverage.cost());

        Beverage beverage1 = new Mocha(beverage);
        System.out.println(beverage1.getDescription() + " costs Rupees: " + beverage1.cost());

        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " costs Rupees: " + beverage1.cost());

        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDescription() + " costs Rupees: " + beverage1.cost());
    }
}
