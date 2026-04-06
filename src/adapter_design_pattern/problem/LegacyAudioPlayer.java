package adapter_design_pattern.problem;

/**
 * Legacy audio player that only plays MP3 files
 */
public class LegacyAudioPlayer {
    
    public void playMP3(String filename) {
        System.out.println("Playing MP3 file: " + filename);
    }
}
