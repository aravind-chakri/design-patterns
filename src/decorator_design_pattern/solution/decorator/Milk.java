package decorator_design_pattern.solution.decorator;

import decorator_design_pattern.solution.Beverage;
import decorator_design_pattern.solution.CondimentDecorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 12.4;
    }
}
