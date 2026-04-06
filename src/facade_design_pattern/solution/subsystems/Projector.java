package facade_design_pattern.solution.subsystems;

public class Projector {
    
    public void on() {
        System.out.println("Projector: Turning on");
    }
    
    public void off() {
        System.out.println("Projector: Turning off");
    }
    
    public void wideScreenMode() {
        System.out.println("Projector: Setting to wide screen mode");
    }
}
