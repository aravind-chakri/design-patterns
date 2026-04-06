package command_design_pattern.solution;

import command_design_pattern.solution.commands.*;
import command_design_pattern.solution.receivers.*;

public class CommandDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Command Pattern Demo ===\n");
        
        // Create receivers
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Television tv = new Television();
        
        // Create commands
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        TVOnCommand tvOn = new TVOnCommand(tv);
        
        // Create invoker (remote control)
        RemoteControl remote = new RemoteControl();
        
        // Set commands to slots
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, tvOn, tvOn); // Using same command for demonstration
        
        // Execute commands
        System.out.println("--- Pressing buttons ---");
        remote.onButtonPressed(0);
        remote.offButtonPressed(0);
        System.out.println("\n--- Undo last command ---");
        remote.undoButtonPressed();
        
        System.out.println("\n--- More commands ---");
        remote.onButtonPressed(1);
        remote.onButtonPressed(2);
        
        /*
         * Benefits:
         * - Decouples invoker from receiver
         * - Easy to add new commands
         * - Supports undo/redo operations
         * - Can queue and log commands
         * - Composite commands (macro commands)
         * - Command objects can be stored and reused
         */
    }
}
