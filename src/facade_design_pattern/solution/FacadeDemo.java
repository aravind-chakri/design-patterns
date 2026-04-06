package facade_design_pattern.solution;

import facade_design_pattern.solution.subsystems.*;

public class FacadeDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Facade Pattern Demo ===\n");
        
        // Create subsystems
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();
        Screen screen = new Screen();
        
        // Create facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights, screen);
        
        // Simple interface - client doesn't need to know subsystems
        System.out.println("--- Starting Movie ---");
        homeTheater.watchMovie("Inception");
        
        System.out.println("\n--- Ending Movie ---");
        homeTheater.endMovie();
        
        /*
         * Benefits:
         * - Simplifies complex subsystem interaction
         * - Loose coupling between client and subsystems
         * - Easy to use - single method call instead of many
         * - Changes in subsystems don't affect client code
         * - Promotes subsystem independence
         */
    }
}
