package prototype_design_pattern.solution;

public class Shape implements Prototype {
    private String type;
    private String color;
    private int x;
    private int y;
    
    public Shape(String type, String color, int x, int y) {
        this.type = type;
        this.color = color;
        this.x = x;
        this.y = y;
        
        // Simulate expensive initialization
        System.out.println("Creating " + type + " - Expensive operation!");
    }
    
    // Copy constructor for cloning
    private Shape(Shape source) {
        this.type = source.type;
        this.color = source.color;
        this.x = source.x;
        this.y = source.y;
        System.out.println("Cloning " + type + " - Fast operation!");
    }
    
    @Override
    public Prototype clone() {
        return new Shape(this);
    }
    
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void display() {
        System.out.println(type + " [" + color + "] at (" + x + ", " + y + ")");
    }
}
