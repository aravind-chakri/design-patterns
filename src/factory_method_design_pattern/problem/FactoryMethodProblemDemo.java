package factory_method_design_pattern.problem;

public class FactoryMethodProblemDemo {
    
    public static void main(String[] args) {
        String docType = "PDF";
        
        // Problem: Client code needs to know concrete class names
        Document doc;
        if (docType.equals("PDF")) {
            doc = new Document("PDF");
        } else if (docType.equals("Word")) {
            doc = new Document("Word");
        } else if (docType.equals("Excel")) {
            doc = new Document("Excel");
        } else {
            doc = new Document("Text");
        }
        
        doc.open();
        doc.save();
        
        /*
         * Problems:
         * - Client code tightly coupled with Document class
         * - Adding new document type requires modifying client code
         * - Violates Open/Closed Principle (open for extension, closed for modification)
         * - No way to customize object creation logic
         */
    }
}
