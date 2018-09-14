import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator cal;

    @Before
        public void setUp(){
            cal = new Calculator();
    }

    @Test
    public void 덧셈(){
        assertEquals(10, cal.add(5,5));
    }

    @Test
    public void 뺄셈(){
        assertEquals(2, cal.subtract(5,3));
    }

    @Test
    public void 곱셈(){
        assertEquals(10, cal.multiply(2,5));
    }

    @Test
    public void 나눗셈(){
        assertEquals(1, cal.add(5,5));
    }

    @Test
    public void 계산(){
        assertEquals(1, cal.calculate(5,5,"+"));
    }

    @After
    public void tearDown() {
        cal = null;
    }
    }