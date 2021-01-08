package task3;

import java.util.Arrays;
import java.util.List;

public class RemoteController implements Switch {

    private List<Switch> listOfDevices;

    public RemoteController(List<Switch> listOfDevices) {
        this.listOfDevices = listOfDevices;
    }

    public List<Switch> getListOfDevices() {
        return listOfDevices;
    }

    public void setListOfDevices(List<Switch> listOfDevices) {
        this.listOfDevices = listOfDevices;
    }

    public void on() {
        for (Switch device : listOfDevices) {
            device.on();
        }
    }

    public void off() {
        for (Switch device : listOfDevices) {
            device.off();
        }
    }

    public void addDevice(Switch newDevice) {
        listOfDevices.add(newDevice);
    }

    public void removeDevice(Switch oldDevice) {
        listOfDevices.remove(oldDevice);
    }
}
