package factory_method_design_pattern.solution;

/**
 * Product interface - defines the interface of objects the factory method creates
 */
public interface Document {
    void open();
    void save();
    void close();
}
