package factory_method_design_pattern.solution;

public class ExcelDocument implements Document {
    
    public ExcelDocument() {
        System.out.println("Excel Document created");
    }
    
    @Override
    public void open() {
        System.out.println("Opening Excel document");
    }
    
    @Override
    public void save() {
        System.out.println("Saving Excel document");
    }
    
    @Override
    public void close() {
        System.out.println("Closing Excel document");
    }
}
