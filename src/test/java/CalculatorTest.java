import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() throws Exception {
    calculator = new Calculator();
    }

    // 덧샘기능 test
    @Test
    public void sumTest(){
        assertEquals(2,calculator.sum(1,1));
    }

    // 뺼샘기능 test
    @Test
    public void subtractTest(){
        assertEquals(1,calculator.subtract(6,5));
    }

    // 곱샘기능 test
    @Test
    public void multipleTest(){
        assertEquals(3,calculator.multiple(1,3));
    }

    // 나누샘기능 test
    @Test
    public void divideTest(){
        assertEquals(1,calculator.divide(1,1));
    }

    // 문자열을 문자열 배열로 올바르게 바꾸는지 Test
    @Test
    public void stringToArrayCharTest(){
        char[] testArray = {'1',' ','+',' ','1'};
        assertArrayEquals(testArray,calculator.makeArrayFunction("1 + 1"));
    }

    // 문자로 된 숫자를 integer로 바꾸는지 test
    @Test
    public void characterToIntegerTest(){
        assertEquals(1,calculator.changeNumber('1'));
    }

    //기호를 넘겨주면 올바른 계산을 하는지 test
    // 덧샘
    @Test
    public void matchingSumTest(){
        assertEquals(2,calculator.matchFunction('+',1,1));
    }

    // 뺄샘
    @Test
    public void matchingSubtractTest(){
        assertEquals(0,calculator.matchFunction('-',1,1));
    }

    // 곱샘
    @Test
    public void matchingMultipleTest(){
        assertEquals(1,calculator.matchFunction('*',1,1));
    }

    // 나눗샘
    @Test
    public void matchingDivideTest(){
        assertEquals(2,calculator.matchFunction('/',6,3));
    }

    // 올바른 계산을 하는지 Test
    @Test
    public void calculateTest(){
        assertEquals(2,calculator.calculate("1 + 1"));
    }

}