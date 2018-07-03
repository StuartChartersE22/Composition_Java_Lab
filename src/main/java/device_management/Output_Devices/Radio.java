package device_management.Output_Devices;

public class Radio extends SoundDevice {

    public Radio(int maxVolume) {
        super(maxVolume);
    }

    public String tune(String station) {
        return playSound(station);
    }
}
