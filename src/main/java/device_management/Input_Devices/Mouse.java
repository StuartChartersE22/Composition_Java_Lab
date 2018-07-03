package device_management.Input_Devices;

import behaviours.IInput;

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

    public String sendData(String data) {
        return data;
    }
}
