package decorator_design_pattern.solution.beverages;

import decorator_design_pattern.solution.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("HouseBlend");
    }

    @Override
    public double cost() {
        return 48.6;
    }
}
