package command_design_pattern.solution.commands;

import command_design_pattern.solution.Command;
import command_design_pattern.solution.receivers.Light;

public class LightOnCommand implements Command {
    private Light light;
    
    public LightOnCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.on();
    }
    
    @Override
    public void undo() {
        light.off();
    }
}
