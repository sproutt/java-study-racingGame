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
    public void testAdd() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(8, calculator.multiply(4, 2));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(8, 4));
    }

    @Test
    public void testCalculate() {
        assertEquals(6, calculator.makeResult("1 + 2 * 4 / 2"));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideZero() {
        calculator.divide(3, 0);
    }

    @Test
    public void test계산() {
        assertEquals(5, calculator.calculate(1, '+', 4));
    }

    @Test(expected = RuntimeException.class)
    public void testIsBlank() {
        calculator.makeResult(" ");
    }
}