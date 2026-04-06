package composite_design_pattern.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite - represents compositions (directories)
 */
public class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components;
    
    public Directory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }
    
    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }
    
    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }
    
    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            System.out.print("  ");
            component.showDetails();
        }
    }
    
    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }
}
