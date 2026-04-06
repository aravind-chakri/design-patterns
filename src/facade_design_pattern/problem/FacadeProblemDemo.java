package facade_design_pattern.problem;

public class FacadeProblemDemo {
    
    public static void main(String[] args) {
        // Problem: Client needs to know and interact with multiple subsystems
        System.out.println("Starting home theater system...");
        
        // Turn on amplifier
        System.out.println("Amplifier.on()");
        System.out.println("Amplifier.setVolume(5)");
        
        // Turn on DVD player
        System.out.println("DVDPlayer.on()");
        System.out.println("DVDPlayer.play(movie)");
        
        // Turn on projector
        System.out.println("Projector.on()");
        System.out.println("Projector.wideScreenMode()");
        
        // Dim lights
        System.out.println("Lights.dim(10)");
        
        // Lower screen
        System.out.println("Screen.down()");
        
        /*
         * Problems:
         * - Client needs to know all subsystems
         * - Complex sequence of operations
         * - Tight coupling with multiple classes
         * - Difficult to use and error-prone
         * - Changes in subsystems affect client code
         */
    }
}
