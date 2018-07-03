package device_management;

public class Mouse {

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
}
