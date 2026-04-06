package adapter_design_pattern.problem;

public class AdapterProblemDemo {
    
    public static void main(String[] args) {
        LegacyAudioPlayer legacyPlayer = new LegacyAudioPlayer();
        AdvancedMediaPlayer advancedPlayer = new AdvancedMediaPlayer();
        
        // Can play MP3 with legacy player
        legacyPlayer.playMP3("song.mp3");
        
        // Cannot play MP4/VLC with legacy player - incompatible interfaces
        // legacyPlayer.playMP4("video.mp4"); // NOT POSSIBLE
        
        // Need to use different player
        advancedPlayer.playMP4("video.mp4");
        advancedPlayer.playVLC("movie.vlc");
        
        /*
         * Problem: Incompatible interfaces
         * - Legacy system expects one interface
         * - New system provides different interface
         * - Cannot use new features with old interface
         * - Client code needs to know multiple interfaces
         */
    }
}
