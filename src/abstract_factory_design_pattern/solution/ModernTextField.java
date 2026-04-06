package abstract_factory_design_pattern.solution;

public class ModernTextField implements TextField {
    
    @Override
    public void render() {
        System.out.println("Rendering Modern TextField with floating label");
    }
    
    @Override
    public void setText(String text) {
        System.out.println("Modern TextField text set to: " + text);
    }
}
