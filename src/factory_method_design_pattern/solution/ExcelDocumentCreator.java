package factory_method_design_pattern.solution;

public class ExcelDocumentCreator extends DocumentCreator {
    
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
