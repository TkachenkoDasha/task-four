package task3;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Switch> listOfDevices = Arrays.asList(new Lamp(), new TVSet(), new Iron());
        RemoteController remoteController = new RemoteController(listOfDevices);

        System.out.println("Turn on");
        remoteController.on();

        System.out.println("Turn off");
        remoteController.off();

        System.out.println("Add new device");
        remoteController.addDevice(new Lamp());

        System.out.println("Remove old device");
        remoteController.removeDevice(remoteController.getListOfDevices().get(2));
    }
}
