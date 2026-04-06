package abstract_factory_design_pattern.solution;

/**
 * Abstract Factory interface
 * Declares methods for creating each abstract product
 */
public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
    TextField createTextField();
}
