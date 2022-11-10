package Command;

import java.util.ArrayList;

public class RemoteControl {
    ArrayList<Command> onCommands;
    ArrayList<Command> offCommands;

    public RemoteControl() {
        onCommands = new ArrayList<>();
        offCommands = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            onCommands.add(i, new NullCommand());
            offCommands.add(i, new NullCommand());
        }
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands.set(index, onCommand);
        offCommands.set(index, offCommand);
    }

    public void onButtonWasPressed(int index) {
        onCommands.get(index).execute();
    }

    public void offButtonWasPressed(int index) {
        offCommands.get(index).execute();
    }

    public void undoButtonWasPressed(int index) {
        offCommands.get(index).undo();
    }
}
