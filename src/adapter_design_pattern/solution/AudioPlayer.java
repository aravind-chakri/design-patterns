package adapter_design_pattern.solution;

/**
 * Audio player that uses adapter to play different formats
 */
public class AudioPlayer implements MediaPlayer {
    
    private MediaAdapter mediaAdapter;
    
    @Override
    public void play(String audioType, String filename) {
        // Built-in support for MP3
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file: " + filename);
        }
        // Use adapter for other formats
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, filename);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
