package decorator_design_pattern.solution.beverages;

import decorator_design_pattern.solution.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription("Dark Roast");
    }

    @Override
    public double cost() {
        return 114.2;
    }
}
