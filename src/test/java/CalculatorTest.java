import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator cal;

    @Before
    public void setUp() throws Exception {
        cal = new Calculator();
    }

    @Test
    public void 덧셈() {
        Assert.assertEquals(7, cal.add(3, 4), 0.0);
    }

    @Test
    public void 뺄셈() {
        Assert.assertEquals(1, cal.subtract(5, 4), 0.0);
    }

    @Test
    public void 곱셈() {
        Assert.assertEquals(6, cal.multiply(2, 3), 0.0);
    }

    @Test
    public void 나눗셈() {
        Assert.assertEquals(2, cal.divide(8, 4), 0.0);
    }


    @After
    public void tearDown() throws Exception {
        cal = null;
    }
}
