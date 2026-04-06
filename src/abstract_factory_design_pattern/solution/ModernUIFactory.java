package abstract_factory_design_pattern.solution;

public class ModernUIFactory implements UIFactory {
    
    @Override
    public Button createButton() {
        return new ModernButton();
    }
    
    @Override
    public Checkbox createCheckbox() {
        return new ModernCheckbox();
    }
    
    @Override
    public TextField createTextField() {
        return new ModernTextField();
    }
}
