package abstract_factory_design_pattern.solution;

public class ModernCheckbox implements Checkbox {
    
    @Override
    public void render() {
        System.out.println("Rendering Modern Checkbox with toggle switch");
    }
    
    @Override
    public void toggle() {
        System.out.println("Modern Checkbox toggled - animated transition");
    }
}
