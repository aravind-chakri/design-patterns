package adapter_design_pattern.problem;

/**
 * New advanced player that plays modern formats
 */
public class AdvancedMediaPlayer {
    
    public void playVLC(String filename) {
        System.out.println("Playing VLC file: " + filename);
    }
    
    public void playMP4(String filename) {
        System.out.println("Playing MP4 file: " + filename);
    }
}
