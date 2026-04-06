package adapter_design_pattern.solution;

/**
 * Target interface - what client expects
 */
public interface MediaPlayer {
    void play(String audioType, String filename);
}
