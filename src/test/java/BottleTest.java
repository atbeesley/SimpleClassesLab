import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    Bottle glug;

    @Before
    public void before() {
        glug = new Bottle();
    }

    @Test
    public void volumeIs100(){
        assertEquals(100, glug.getVolume());
    }

    @Test
    public void canDrinkOnce(){
        glug.drink();
        assertEquals(90, glug.getVolume());
    }

    @Test
    public void canDrinkTwice(){
        glug.drink();
        glug.drink();
        assertEquals(80, glug.getVolume());
    }

    @Test
    public void canEmpty() {
        glug.empty();
        assertEquals(0, glug.getVolume());
    }

    @Test
    public void canFill() {
        glug.fill();
        assertEquals(100, glug.getVolume());
    }
}
