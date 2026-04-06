package factory_method_design_pattern.solution;

public class WordDocumentCreator extends DocumentCreator {
    
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
