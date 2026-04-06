package factory_method_design_pattern.solution;

public class FactoryMethodDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Factory Method Pattern Demo ===\n");
        
        // Client code works with creators through the abstract interface
        DocumentCreator creator;
        
        System.out.println("--- Processing PDF Document ---");
        creator = new PDFDocumentCreator();
        creator.processDocument();
        
        System.out.println("\n--- Processing Word Document ---");
        creator = new WordDocumentCreator();
        creator.processDocument();
        
        System.out.println("\n--- Processing Excel Document ---");
        creator = new ExcelDocumentCreator();
        creator.processDocument();
        
        /*
         * Benefits:
         * - Loose coupling between client and concrete products
         * - Easy to add new document types without modifying existing code
         * - Follows Open/Closed Principle
         * - Single Responsibility Principle - creation logic is separated
         * - Client code works with abstractions (Document interface)
         */
    }
}
