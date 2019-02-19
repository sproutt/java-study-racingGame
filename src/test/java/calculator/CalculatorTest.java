package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void 덧셈() {
        assertEquals(7, calculator.add(3, 4), 0.0);
    }

    @Test
    public void 뺄셈() {
        assertEquals(1, calculator.substract(5, 4), 0.0);
    }

    @Test
    public void 곱셈() {
        assertEquals(20, calculator.multiply(4, 5), 0.0);
    }

    @Test
    public void 나눗셈() {
        assertEquals(1.25, calculator.divide(5, 4), 0.0);
    }

    @Test
    public void 다중연산() {
        assertEquals(3.0, calculator.progress("5 + 5 - 6 * 3 / 4"), 0.0);
    }

    @Test
    public void 연산자있는덧셈() {
        assertEquals(8.0, calculator.calculate("+", 5, 3), 0.0);
    }

    @Test
    public void 연산자있는뺄셈() {
        assertEquals(2.0, calculator.calculate("-", 5, 3), 0.0);
    }

    @Test
    public void 연산자있는곱셈() {
        assertEquals(15.0, calculator.calculate("*", 5, 3), 0.0);
    }

    @Test
    public void 연산자있는나눗셈() {
        assertEquals(2.0, calculator.calculate("/", 12, 6), 0.0);
    }
}
