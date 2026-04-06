package abstract_factory_design_pattern.solution;

public class ClassicButton implements Button {
    
    @Override
    public void render() {
        System.out.println("Rendering Classic Button with 3D effect");
    }
    
    @Override
    public void onClick() {
        System.out.println("Classic Button clicked - standard click");
    }
}
