import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator cal;

    @Before
    public void setUp(){
        cal = new Calculator();
    }

   @Test
    public void 계산기(){
        assertEquals(10, cal.readExpression("2 + 3 * 4 / 2"));
   }

   @After
    public void tearDown() {
        cal = null;
   }
}
