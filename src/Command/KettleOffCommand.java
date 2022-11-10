package Command;

public class KettleOffCommand implements Command {
    Kettle kettle;

    public KettleOffCommand(Kettle kettle) {
        this.kettle = kettle;
    }

    @Override
    public void execute() {
        kettle.off();
    }

    @Override
    public void undo() {
        kettle.boil();
        kettle.off();
    }
}
