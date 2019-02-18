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
    public void 덧셈() throws Exception {
        assertEquals("7",calculator.calculates("3+4"));
    }
    @Test
    public void 뺄셈() throws Exception {
        assertEquals("1",calculator.calculates("5-4"));
    }
    @Test
    public void 곱셈() throws Exception {
        assertEquals("20",calculator.calculates("5*4"));
    }
    @Test
    public void 나눗셈() throws Exception {
        assertEquals("1.25",calculator.calculates("5/4"));
    }
    @Test
    public void 예외() throws Exception {
        assertEquals("입력값이 없습니다.",calculator.calculates(" "));
    }
    @Test
    public void 공백연산() throws Exception {
        assertEquals("3",calculator.calculates("5 + 5 - 6 * 3 / 4"));
    }
}
