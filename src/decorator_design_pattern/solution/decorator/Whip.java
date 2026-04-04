package decorator_design_pattern.solution.decorator;

import decorator_design_pattern.solution.Beverage;
import decorator_design_pattern.solution.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 8.4;
    }
}
