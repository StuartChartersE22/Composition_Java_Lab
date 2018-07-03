import device_management.Computer;
import device_management.Input_Devices.Keyboard;
import device_management.Input_Devices.Mouse;
import device_management.Output_Devices.Monitor;
import device_management.Output_Devices.Printer;
import device_management.Output_Devices.Speaker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Printer printer;
    Mouse mouse;
    Keyboard keyboard;


    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        computer = new Computer(8, 512, monitor, mouse);
        printer = new Printer("Epson", "Stylus", 120, 4);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasOutputData() {
        assertNotNull(computer.getOutputDevice());
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutPutDataViaPrinter(){
        computer = new Computer(8, 512, printer, mouse);
        assertEquals("printing: holiday pictures", computer.outputData("holiday pictures"));
    }

    @Test
    public void canOutputDataViaSpeaker(){
        Speaker speaker = new Speaker(100);
        computer = new Computer(8, 512, speaker, mouse);
        assertEquals("playing: Beep!", computer.outputData("Beep!"));
    }

    @Test
    public void canSetOutputDevice(){
        computer.setOutputDevice(printer);
        assertEquals("printing: dissertation", computer.outputData("dissertation"));
    }

    @Test
    public void getInputDevice() {
        assertEquals(mouse, computer.getInputDevice());
    }

    @Test
    public void setInputDevice() {
        computer.setInputDevice(keyboard);
        assertEquals(keyboard, computer.getInputDevice());
    }

    @Test
    public void inputData() {
        assertEquals("Hello World!", computer.inputData("Hello World!"));
    }

    @Test
    public void outPutDataStream() {
        computer.inputData("Hello World!");
        assertEquals("Hello World! is now on screen", computer.outPutDataStream());
    }

   }
