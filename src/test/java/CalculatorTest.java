import static org.junit.Assert.assertEquals;

import controller.Calculator;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator 문자열계산기;

    @Before
    public void setUp() {
        문자열계산기 = new Calculator();
    }

    @Test
    public void 덧셈() {
        assertEquals(10, 문자열계산기.add(5, 5));
    }

    @Test
    public void 뺄셈() {
        assertEquals(2, 문자열계산기.subtract(5, 3));
    }

    @Test
    public void 곱셈() {
        assertEquals(10, 문자열계산기.multiply(2, 5));
    }

    @Test
    public void 나눗셈() {
        assertEquals(1, 문자열계산기.divide(5, 5));
    }

    @Test
    public void 계산() {
        assertEquals(10, 문자열계산기.calculate(5, 5, "+"));
    }

    @Test
    public void 예제() {
        assertEquals(10, 문자열계산기.operate("2 + 3 * 4 / 2"));

    }
}