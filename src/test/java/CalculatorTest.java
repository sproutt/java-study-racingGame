import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

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
}