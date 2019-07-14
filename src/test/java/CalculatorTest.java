import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator cal;

    @Before
    public void setUp()  {
        cal = new Calculator();
    }

    @Test
    public void 덧셈()  {
        assertEquals(7, cal.add(3, 4));
    }

    @Test
    public void 뺄셈()  {
        assertEquals(1, cal.subtract(5,  4));
    }

    @Test
    public void 곱셈()  {
        assertEquals(6, cal.multiply(2, 3));
    }

    @Test
    public void 나눗셈()  {
        assertEquals(2, cal.divide(8, 4));
    }

    @Test
    public void 단순계산() {
        assertEquals(9, cal.calculate(4, '+', 5));
    }

    @Test
    public void 복합계산() {
        assertEquals(13, cal.getAnswer("4 * 5 / 2 + 3"));
    }

    @Test(expected = ArithmeticException.class)
    public void 영으로나누기() {
        cal.divide(7, 0);
    }


    @Test(expected = RuntimeException.class)
    public void 입력없음() {
        cal.getAnswer(" ");
    }

    @After
    public void tearDown() {
        cal = null;
    }
}