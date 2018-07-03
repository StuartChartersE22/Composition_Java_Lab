package device_management.Input_Devices;

import device_management.Computer;
import device_management.Input_Devices.Mouse;
import device_management.Output_Devices.Monitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MouseTest {

    private Mouse mouse;
    private Computer computer;
    private Monitor monitor;

    @Before
    public void setUp() {
        mouse = new Mouse("Wireless", 2);
         monitor = new Monitor(22, 786432);
        computer = new Computer(8, 512, monitor, mouse);
    }

    @Test
    public void getNumberOfButtons() {
        assertEquals(2, mouse.getNumberOfButtons());
    }

    @Test
    public void getType() {
        assertEquals("Wireless", mouse.getType());
    }

    @Test
    public void canSendData(){
        assertEquals("Sending Data", mouse.sendData("Sending Data", computer));
    }
}