package device_management.Input_Devices;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyboardTest {

    private Keyboard keyboard;

    @Before
    public void setUp() {
        keyboard = new Keyboard("English");
    }

    @Test
    public void getType() {
        assertEquals("English", keyboard.getType());
    }

    @Test
    public void canSendData(){
        assertEquals("Sending Data", keyboard.sendData("Sending Data"));
    }
}