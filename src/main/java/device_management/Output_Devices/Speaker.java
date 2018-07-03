package device_management.Output_Devices;

import behaviours.IOutput;

public class Speaker extends SoundDevice implements IOutput {
    public Speaker(int maxVolume) {
        super(maxVolume);
    }

    public String outputData(String data) {
        return playSound(data);
    }
}
