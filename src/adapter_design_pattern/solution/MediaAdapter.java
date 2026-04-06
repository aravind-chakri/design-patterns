package adapter_design_pattern.solution;

/**
 * Adapter - makes AdvancedMediaPlayer compatible with MediaPlayer interface
 */
public class MediaAdapter implements MediaPlayer {
    
    private AdvancedMediaPlayer advancedPlayer;
    
    public MediaAdapter() {
        this.advancedPlayer = new AdvancedMediaPlayer();
    }
    
    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedPlayer.playVLC(filename);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedPlayer.playMP4(filename);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}
