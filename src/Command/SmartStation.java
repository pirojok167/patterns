package Command;

import java.util.ArrayList;

public class SmartStation {
    public static void main(String[] args) {
        executeEachCommand();
        userCameHome();
    }

    public static void executeEachCommand() {
        RemoteControl remoteControl = new RemoteControl();

        Light kitchenLighting = new Light("Kitchen");
        Kettle kettle = new Kettle();

        remoteControl.setCommand(0, new LightOnCommand(kitchenLighting), new LightOffCommand(kitchenLighting));
        remoteControl.setCommand(1, new KettleOnCommand(kettle), new KettleOffCommand(kettle));

        remoteControl.onButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.undoButtonWasPressed(1);

        remoteControl.offButtonWasPressed(0);
        remoteControl.offButtonWasPressed(1);
    }

    public static void userCameHome() {
        RemoteControl remoteControl = new RemoteControl();
        Light lightingRoom = new Light("Hall");
        Kettle kettle = new Kettle();

        ArrayList<Command> cameHomeCommands = new ArrayList<>();
        cameHomeCommands.add(new LightOnCommand(lightingRoom));
        cameHomeCommands.add(new KettleOnCommand(kettle));

        ArrayList<Command> leftHomeCommands = new ArrayList<>();
        leftHomeCommands.add(new LightOffCommand(lightingRoom));
        leftHomeCommands.add(new KettleOffCommand(kettle));

        remoteControl.setCommand(0, new HomeCommand(cameHomeCommands), new HomeCommand(leftHomeCommands));

        remoteControl.onButtonWasPressed(0);
    }
}
