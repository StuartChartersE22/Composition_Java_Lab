package device_management.Input_Devices;

import behaviours.IInput;
import device_management.Computer;

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

    @Override
    public String sendData(String data, Computer computer) {
        computer.inputData(data);
        return data;
    }
}
