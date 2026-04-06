package facade_design_pattern.solution;

import facade_design_pattern.solution.subsystems.*;

/**
 * Facade - provides simple interface to complex subsystem
 */
public class HomeTheaterFacade {
    
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Lights lights;
    private Screen screen;
    
    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector proj, Lights lights, Screen screen) {
        this.amplifier = amp;
        this.dvdPlayer = dvd;
        this.projector = proj;
        this.lights = lights;
        this.screen = screen;
    }
    
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }
    
    public void endMovie() {
        System.out.println("Shutting down home theater...");
        dvdPlayer.stop();
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        screen.up();
        lights.on();
    }
}
