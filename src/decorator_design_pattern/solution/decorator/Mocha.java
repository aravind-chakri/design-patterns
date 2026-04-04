package decorator_design_pattern.solution.decorator;

import decorator_design_pattern.solution.Beverage;
import decorator_design_pattern.solution.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 10.3;
    }
}
