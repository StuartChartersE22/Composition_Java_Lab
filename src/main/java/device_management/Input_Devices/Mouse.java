package device_management.Input_Devices;

import behaviours.IInput;
import device_management.Computer;

public class Mouse implements IInput {

    private String type;
    private int numberOfButtons;

    public Mouse(String type, int numberOfButtons){
        this.type = type;
        this.numberOfButtons = numberOfButtons;
    }

    public int getNumberOfButtons() {
        return this.numberOfButtons;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String sendData(String data, Computer computer) {
        computer.inputData(data);
        return data;
    }
}
