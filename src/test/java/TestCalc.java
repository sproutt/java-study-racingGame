import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

    @Test
    public void testSum() {
        Calculator cal = new Calculator();
        cal.setAnswer(1);
        cal.calculate('+', 1);
        assertEquals(2,cal.getAnswer());
    }

    @Test
    public void testSub() {
        Calculator cal = new Calculator();
        cal.setAnswer(1);
        cal.calculate('-', 1);
        assertEquals(0,cal.getAnswer());
    }

    @Test
    public void testMul() {
        Calculator cal = new Calculator();
        cal.setAnswer(1);
        cal.calculate('*', 1);
        assertEquals(1,cal.getAnswer());
    }

    @Test
    public void testDiv() {
        Calculator cal = new Calculator();
        cal.setAnswer(2);
        cal.calculate('/', 2);
        assertEquals(1,cal.getAnswer());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNull() {
        Calculator cal = new Calculator();
        cal.takeInput();
    }


}