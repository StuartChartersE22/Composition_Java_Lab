package device_management;

import device_management.Input_Devices.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MouseTest {

    private Mouse mouse;

    @Before
    public void setUp() {
        mouse = new Mouse("Wireless", 2);
    }

    @Test
    public void getNumberOfButtons() {
        assertEquals(2, mouse.getNumberOfButtons());
    }

    @Test
    public void getType() {
        assertEquals("Wireless", mouse.getType());
    }
}