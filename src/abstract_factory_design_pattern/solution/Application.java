package abstract_factory_design_pattern.solution;

/**
 * Client class that uses Abstract Factory
 */
public class Application {
    private Button button;
    private Checkbox checkbox;
    private TextField textField;
    
    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        textField = factory.createTextField();
    }
    
    public void render() {
        button.render();
        checkbox.render();
        textField.render();
    }
    
    public void interact() {
        button.onClick();
        checkbox.toggle();
        textField.setText("Hello Abstract Factory!");
    }
}
