package command_design_pattern.problem;

public class CommandProblemDemo {
    
    public static void main(String[] args) {
        // Problem: Direct coupling between invoker and receiver
        // Remote control directly calls device methods
        
        System.out.println("Turning on light...");
        // lightOn();
        
        System.out.println("Turning off light...");
        // lightOff();
        
        System.out.println("Turning on TV...");
        // tvOn();
        
        /*
         * Problems:
         * - Remote control tightly coupled with devices
         * - Cannot undo operations
         * - Cannot queue or log commands
         * - Hard to add new commands without modifying remote
         * - Cannot parameterize objects with operations
         * - No command history
         */
    }
}
