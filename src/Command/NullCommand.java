package Command;

public class NullCommand implements Command {
    @Override
    public void execute() {
        // nothing
    }

    @Override
    public void undo() {
        // nothing
    }
}
