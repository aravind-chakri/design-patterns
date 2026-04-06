package abstract_factory_design_pattern.solution;

public class ModernButton implements Button {
    
    @Override
    public void render() {
        System.out.println("Rendering Modern Button with flat design");
    }
    
    @Override
    public void onClick() {
        System.out.println("Modern Button clicked - smooth animation");
    }
}
