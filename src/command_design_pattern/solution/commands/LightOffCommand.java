package command_design_pattern.solution.commands;

import command_design_pattern.solution.Command;
import command_design_pattern.solution.receivers.Light;

public class LightOffCommand implements Command {
    private Light light;
    
    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    @Override
    public void execute() {
        light.off();
    }
    
    @Override
    public void undo() {
        light.on();
    }
}
