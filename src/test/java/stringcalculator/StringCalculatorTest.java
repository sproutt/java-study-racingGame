package stringcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import stringclaculator.StringCalculator;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    StringCalculator cal = new StringCalculator();

    @Before
    public void setUp() {
        cal = new StringCalculator();
    }

    @Test
    public void null_or_공백() throws Exception {
        System.out.println("error!");
    }

    @Test
    public void addTest() {
        assertEquals(7, cal.add(3,4));
    }

    @Test
    public void subtractTest() {
        assertEquals(1, cal.subtact(5, 4));
    }

    @Test
    public void multiplyTest() {
        assertEquals(6, cal.multiply(2,3));
    }

    @Test
    public void divideTest() {
        assertEquals(2, cal.divide(8,4));
    }

    @Test
    public void answerTest() { assertEquals(10, cal.answer("2 + 3 * 4 / 2"));}

    @After
    public void tearDown() {
        cal = null;
    }

}
