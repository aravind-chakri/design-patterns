package composite_design_pattern.solution;

public class CompositeDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Composite Pattern Demo ===\n");
        
        // Create leaf objects (files)
        File file1 = new File("document.txt", 10);
        File file2 = new File("image.jpg", 200);
        File file3 = new File("video.mp4", 5000);
        
        // Create composite objects (directories)
        Directory rootDir = new Directory("root");
        Directory documentsDir = new Directory("documents");
        Directory mediaDir = new Directory("media");
        
        // Build tree structure
        documentsDir.addComponent(file1);
        
        mediaDir.addComponent(file2);
        mediaDir.addComponent(file3);
        
        rootDir.addComponent(documentsDir);
        rootDir.addComponent(mediaDir);
        
        // Client treats leaf and composite uniformly
        System.out.println("--- File System Structure ---");
        rootDir.showDetails();
        
        System.out.println("\n--- Total Size ---");
        System.out.println("Root directory size: " + rootDir.getSize() + " KB");
        System.out.println("Documents directory size: " + documentsDir.getSize() + " KB");
        System.out.println("Media directory size: " + mediaDir.getSize() + " KB");
        
        /*
         * Benefits:
         * - Uniform treatment of individual and composite objects
         * - Easy to add new component types
         * - Simplifies client code
         * - Recursive composition naturally supported
         * - Open/Closed Principle - easy to extend
         */
    }
}
