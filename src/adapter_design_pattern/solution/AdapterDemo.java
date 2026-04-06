package adapter_design_pattern.solution;

public class AdapterDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Adapter Pattern Demo ===\n");
        
        AudioPlayer audioPlayer = new AudioPlayer();
        
        System.out.println("Playing different audio formats:");
        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.play("avi", "animation.avi");
        
        /*
         * Benefits:
         * - Makes incompatible interfaces work together
         * - Client code uses single consistent interface
         * - Can integrate legacy code with new code
         * - Single Responsibility Principle - adapter handles conversion
         * - Open/Closed Principle - can add new adapters without changing existing code
         */
    }
}
