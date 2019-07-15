import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp()  {
        calculator = new Calculator();
    }

    @Test
    public void 덧셈()  {
        assertEquals(7, calculator.calculateAnswer("3 + 4"));
    }

    @Test
    public void 뺄셈()  {
        assertEquals(1, calculator.calculateAnswer("5 - 4"));
    }

    @Test
    public void 곱셈()  {
        assertEquals(6, calculator.calculateAnswer("2 * 3"));
    }

    @Test
    public void 나눗셈()  {
        assertEquals(2, calculator.calculateAnswer("8 / 4"));
    }

    @Test
    public void 복합계산() {
        assertEquals(13, calculator.calculateAnswer("4 * 5 / 2 + 3"));
    }

    @Test(expected = ArithmeticException.class)
    public void 영으로나누기() {
        calculator.calculateAnswer("7 / 0");
    }


    @Test(expected = RuntimeException.class)
    public void 입력없음() {
        calculator.calculateAnswer(" ");
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}