package factory_method_design_pattern.solution;

public class PDFDocumentCreator extends DocumentCreator {
    
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}
