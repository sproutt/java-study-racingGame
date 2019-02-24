import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    StringCalculator stringCalculator;

    @Before
    public void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void 덧셈() {
        assertEquals(7, stringCalculator.add(3, 4));
    }

    @Test
    public void 뺄셈() {
        assertEquals(2, stringCalculator.minus(5, 3));
    }

    @Test
    public void 곱셈() {
        assertEquals(12, stringCalculator.multiple(3, 4));
    }

    @Test
    public void 나눗셈() {
        assertEquals(3, stringCalculator.divide(15, 5));
    }

    @Test
    public void 연산자확인() {
        assertEquals(1, stringCalculator.operands(0, '+'));
        assertEquals(2, stringCalculator.operands(1, '-'));
        assertEquals(1, stringCalculator.operands(0, '*'));
        assertEquals(3, stringCalculator.operands(2, '/'));
    }
    @Test
    public void 연산자갯수세기() {
        int[] array = {'2','+','3','*','4','/','2'};
        assertEquals(3,StringCalculator.calculateOperandCount(array));
    }
    @Test
    public void 정답(){
        int[] numverArray = {2,3,4,2};
        int[] operandArray = {'+','*','/'};
        assertEquals(10,StringCalculator.makeAnswer(numverArray,operandArray));
    }
}
