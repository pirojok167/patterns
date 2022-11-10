package Command;

import java.util.ArrayList;

public class HomeCommand implements Command {
    private final ArrayList<Command> commands;

    public HomeCommand(ArrayList<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command: commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command: commands) {
            command.undo();
        }
    }
}
