import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator brains = new Calculator();

      @Test
    public void canAdd(){
        assertEquals(10, brains.add(6,4));
      }

      @Test
    public void canSubtract(){
          assertEquals(5, brains.subtract(8,3));
      }

      @Test
    public void canMultiply(){
          assertEquals(12, brains.multiply(3,4));
      }

      @Test
    public void canDivide(){
          assertEquals(2, brains.divide(6.66,3.33), 0.01);
      }
}
