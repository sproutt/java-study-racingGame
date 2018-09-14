import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator cal;

    @Before
    public void setUp(){
        cal = new Calculator();
    }

    @Test
    public void calculate() {
        assertEquals(10, cal.calculate("2 + 3 * 4 / 2"));
    }

    @Test
    public void operate() {
        assertEquals(2, cal.operate(1,1,"+"));
        assertEquals(0, cal.operate(1,1,"-"));
        assertEquals(1, cal.operate(1,1,"/"));
        assertEquals(1, cal.operate(1,1,"*"));
    }

    @Test
    public void parseInt() {
        assertEquals(1, cal.parseInt("1"));
    }

    @Test
    public void add() {
        assertEquals(2, cal.add(1,1));
    }

    @Test
    public void subtract() {
        assertEquals(0, 1,1);
    }

    @Test
    public void multiply() {
        assertEquals(1,1, 1);
    }

    @Test
    public void divide() {
        assertEquals(1,1,1);
    }

    @After
    public void tearDown() {
        cal = null;
    }
}
