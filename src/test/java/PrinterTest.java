import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PrinterTest {
    Printer smudge;

    @Before
    public void before() {
        smudge = new Printer();
    }

    @Test
    public void has100Sheets(){
        assertEquals(100, smudge.getSheets());
    }

    @Test
    public void canPrint(){
        smudge.print(5,3);
        assertEquals(85, smudge.getSheets());
    }

    @Test
    public void cannotPrintIfNotEnoughSheets(){
        smudge.print(101,1);
        assertEquals(100,smudge.getSheets());
    }

    @Test
    public void has100TonerUnits(){
        assertEquals(100, smudge.getToner());
    }

    @Test
    public void reducesToner(){
        smudge.print(4, 5);
        assertEquals(80, smudge.getToner());
    }
}
