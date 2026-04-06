package template_method_design_pattern.solution;

/**
 * Abstract class defining template method
 */
public abstract class CaffeineBeverage {
    
    // Template method - defines algorithm structure
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
    
    // Common methods implemented in base class
    private void boilWater() {
        System.out.println("Boiling water");
    }
    
    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
    
    // Abstract methods - subclasses must implement
    protected abstract void brew();
    protected abstract void addCondiments();
    
    // Hook method - subclasses can override but not required
    protected boolean customerWantsCondiments() {
        return true;
    }
}
