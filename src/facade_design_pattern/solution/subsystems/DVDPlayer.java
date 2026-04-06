package facade_design_pattern.solution.subsystems;

public class DVDPlayer {
    
    public void on() {
        System.out.println("DVD Player: Turning on");
    }
    
    public void off() {
        System.out.println("DVD Player: Turning off");
    }
    
    public void play(String movie) {
        System.out.println("DVD Player: Playing '" + movie + "'");
    }
    
    public void stop() {
        System.out.println("DVD Player: Stopped");
    }
}
