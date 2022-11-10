package Command;

public class KettleOnCommand implements Command {
    Kettle kettle;

    public KettleOnCommand(Kettle kettle) {
        this.kettle = kettle;
    }

    @Override
    public void execute() {
        kettle.boil();
        kettle.off();
    }

    @Override
    public void undo() {
        kettle.off();
    }
}
