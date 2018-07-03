package device_management.Input_Devices;

import behaviours.IInput;

public class Keyboard implements IInput {

    private String type;

    public Keyboard(String type){
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String sendData(String data) {
        return data;
    }
}
