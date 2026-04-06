package factory_method_design_pattern.solution;

/**
 * Creator abstract class
 * Declares the factory method that returns Document objects
 */
public abstract class DocumentCreator {
    
    // Factory Method - subclasses override this to create specific document types
    public abstract Document createDocument();
    
    // Template method that uses the factory method
    public void processDocument() {
        Document doc = createDocument();
        doc.open();
        doc.save();
        doc.close();
    }
}
