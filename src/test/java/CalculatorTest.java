import static org.junit.Assert.assertEquals;

import calculator.Calculator;
import org.junit.Test;

public class CalculatorTest{
    Calculator calculator = new Calculator();
    @Test
    public void 덧셈테스트(){
        assertEquals(3, calculator.add(1,2));
    }
    @Test
    public void 뺄셈테스트(){
        assertEquals(-1, calculator.subtract(1,2));
    }
    @Test
    public void 곱셈테스트(){
        assertEquals(4, calculator.multiple(2,2));
    }

    @Test
    public void 나눗셈테스트(){
        assertEquals(0, calculator.divide(1,2));
    }

    @Test
    public void 계산테스트(){
        assertEquals(4, calculator.calculate(1, "+", 3));
    }

    @Test
    public void 문자열분리테스트(){
        String[] arr = {"4","+","5"};
        assertEquals( arr , calculator.splitString("4 + 5"));
    }
    @Test
    public void 문자열계산테스트(){
        String[] arr ={"0","+","1","*","13"};
        assertEquals(13, calculator.devideString(arr));
    }
}