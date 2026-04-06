package template_method_design_pattern.solution;

public class TemplateMethodDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Template Method Pattern Demo ===\n");
        
        System.out.println("Making tea...");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
        
        System.out.println("\nMaking coffee...");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        
        /*
         * Benefits:
         * - Eliminates code duplication
         * - Enforces algorithm structure
         * - Subclasses customize specific steps
         * - Hollywood Principle: "Don't call us, we'll call you"
         * - Easy to add new beverage types
         * - Common behavior in one place
         */
    }
}
