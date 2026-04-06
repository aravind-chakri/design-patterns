package abstract_factory_design_pattern.solution;

public class ClassicCheckbox implements Checkbox {
    
    @Override
    public void render() {
        System.out.println("Rendering Classic Checkbox with checkmark");
    }
    
    @Override
    public void toggle() {
        System.out.println("Classic Checkbox toggled - instant change");
    }
}
