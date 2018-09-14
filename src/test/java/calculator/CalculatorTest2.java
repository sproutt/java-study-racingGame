// JUnit 3.x 버전

package calculator;

import junit.framework.TestCase;

public class CalculatorTest2 extends TestCase {
    Calculator cal;

    protected void setUp() {
        cal = new Calculator();
    }

    public void test_덧셈() {
        assertEquals(7, cal.add(3, 4));
    }

    public void test_뺄셈() {
        assertEquals(1, cal.subtact(5, 4));
    }

    public void test_곱셉() {
        assertEquals(6, cal.multiply(2, 3));
    }

    public void test_나눗셈() {
        assertEquals(2, cal.divide(8, 4));
    }

    protected void tearDown() {
        cal = null;
    }
}
