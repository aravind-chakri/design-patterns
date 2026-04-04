package decorator_design_pattern.solution.decorator;

import decorator_design_pattern.solution.Beverage;
import decorator_design_pattern.solution.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 12.43;
    }
}
