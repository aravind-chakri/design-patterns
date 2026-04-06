package abstract_factory_design_pattern.solution;

public class ClassicUIFactory implements UIFactory {
    
    @Override
    public Button createButton() {
        return new ClassicButton();
    }
    
    @Override
    public Checkbox createCheckbox() {
        return new ClassicCheckbox();
    }
    
    @Override
    public TextField createTextField() {
        return new ClassicTextField();
    }
}
