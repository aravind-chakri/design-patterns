package command_design_pattern.solution.commands;

import command_design_pattern.solution.Command;
import command_design_pattern.solution.receivers.Television;

public class TVOnCommand implements Command {
    private Television tv;
    
    public TVOnCommand(Television tv) {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.on();
        tv.setChannel(1);
    }
    
    @Override
    public void undo() {
        tv.off();
    }
}
