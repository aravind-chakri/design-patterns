package abstract_factory_design_pattern.solution;

public class ClassicTextField implements TextField {
    
    @Override
    public void render() {
        System.out.println("Rendering Classic TextField with border");
    }
    
    @Override
    public void setText(String text) {
        System.out.println("Classic TextField text set to: " + text);
    }
}
