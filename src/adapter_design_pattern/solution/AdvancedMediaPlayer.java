package adapter_design_pattern.solution;

/**
 * Adaptee - advanced player with different interface
 */
public class AdvancedMediaPlayer {
    
    public void playVLC(String filename) {
        System.out.println("Playing VLC file: " + filename);
    }
    
    public void playMP4(String filename) {
        System.out.println("Playing MP4 file: " + filename);
    }
}
