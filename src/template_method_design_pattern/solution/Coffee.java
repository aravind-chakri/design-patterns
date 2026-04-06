package template_method_design_pattern.solution;

public class Coffee extends CaffeineBeverage {
    
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }
    
    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    
    @Override
    protected boolean customerWantsCondiments() {
        // Hook implementation - can customize behavior
        return true;
    }
}
