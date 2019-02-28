import Calculator.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    @Test
    public void 덧셈() {
        assertEquals(7, calculator.add(3, 4));
    }
    @Test
    public void 뺄셈() {
        assertEquals(2, calculator.minus(5, 3));
    }

    @Test
    public void 곱셈() {
        assertEquals(12, calculator.multiple(3, 4));
    }
    @Test
    public void 나눗셈() {
        assertEquals(3, calculator.divide(15, 5));
    }

    @After
    public void tearDown(){
        calculator = null;
    }
}
