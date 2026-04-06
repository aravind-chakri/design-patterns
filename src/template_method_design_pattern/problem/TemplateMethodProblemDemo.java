package template_method_design_pattern.problem;

public class TemplateMethodProblemDemo {
    
    public static void main(String[] args) {
        // Problem: Code duplication in similar algorithms
        
        System.out.println("Making Tea:");
        // boilWater();
        // steepTeaBag();
        // pourInCup();
        // addLemon();
        
        System.out.println("\nMaking Coffee:");
        // boilWater();  // DUPLICATE CODE
        // brewCoffeeGrinds();
        // pourInCup();  // DUPLICATE CODE
        // addSugarAndMilk();
        
        /*
         * Problems:
         * - Code duplication (boilWater, pourInCup repeated)
         * - No way to enforce algorithm structure
         * - Hard to maintain consistency
         * - Violates DRY (Don't Repeat Yourself)
         * - Changes need to be made in multiple places
         */
    }
}
