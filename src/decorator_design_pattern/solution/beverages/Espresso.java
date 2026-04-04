package decorator_design_pattern.solution.beverages;

import decorator_design_pattern.solution.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 60.5;
    }
}
