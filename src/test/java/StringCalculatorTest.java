import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    StringCalculator calculator;

    @Before
    public void SetUp() {
        calculator = new StringCalculator();
    }

    @Test
    public void add() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void subtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void multiply() {
        assertEquals(8, calculator.multiply(4, 2));
    }

    @Test
    public void divide() {
        assertEquals(2, calculator.divide(8, 4));
    }

    @Test
    public void calculate() {
        assertEquals(6, calculator.makeResult("1 + 2 * 4 / 2"));
    }

    @Test(expected = ArithmeticException.class)
    public void divideZero() {
        calculator.divide(3, 0);
    }
}