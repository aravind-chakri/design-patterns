package decorator_design_pattern.solution.beverages;

import decorator_design_pattern.solution.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        setDescription("Decaf");
    }

    @Override
    public double cost() {
        return 79.40;
    }
}
