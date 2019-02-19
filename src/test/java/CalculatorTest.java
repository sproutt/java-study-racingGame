import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest {
    Calculator calculator;
    @Before
    public void setUp(){
        calculator = new Calculator();
    }
    @Test
    public void 덧셈() {
        assertEquals("7",calculator.add(3,4));
    }
    @Test
    public void 뺄셈() throws Exception {
        assertEquals("1",calculator.substract(5,4));
    }
    @Test
    public void 곱셈() throws Exception {
        assertEquals("20",calculator.multiply(4,5));
    }
    @Test
    public void 나눗셈() throws Exception {
        assertEquals("1.25",calculator.divide(5,4));
    }
    @Test
    public void 예외() throws Exception {
        assertEquals(true,calculator.checkError(new String[]{""}));
    }
    @Test
    public void 다중연산() throws Exception {
        assertEquals("3",calculator.multipleCalculation("5 + 5 - 6 * 3 / 4"));
    }
}
