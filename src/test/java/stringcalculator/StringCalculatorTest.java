package stringcalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import stringclaculator.StringCalculator;
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
        assertEquals(7, cal.add(3, 4));
    }

    @Test
    public void substractTest() {
        assertEquals(1, cal.substract(5, 4));
    }

    @Test
    public void multiplyTest() {
        assertEquals(6, cal.multiply(2, 3));
    }

    @Test
    public void divideTest() {
        assertEquals(2, cal.divide(8, 4));
    }

    @Test
    public void inputTest() {
        assertEquals("hello world!", "hello world!");
    }

    @Test
    public void splitExpressionTest() { assertEquals("+", cal.splitExpression("3 + 2")[1]);}

    @Test
    public void makeOperatorListTest() {
        assertEquals("+", cal.makeOperatorList(cal.splitExpression("3 + 2 * 4")).get(0));}

    @Test
    public void makeNumberListTest() {
        assertEquals("3", cal.makeNumberList(cal.splitExpression("3 + 2 * 4")).get(0));}

    @Test
    public void calculateTest() {
        assertEquals(10, cal.calculate("2 + 3 * 4 / 2"));
    }

    @After
    public void tearDown() {
        cal = null;
    }

}
