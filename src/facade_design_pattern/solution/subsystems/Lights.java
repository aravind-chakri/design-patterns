package facade_design_pattern.solution.subsystems;

public class Lights {
    
    public void dim(int level) {
        System.out.println("Lights: Dimming to " + level + "%");
    }
    
    public void on() {
        System.out.println("Lights: Turning on");
    }
}
