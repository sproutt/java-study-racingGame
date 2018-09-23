import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class StringcalculatorTest {
    Stringcalculator stringcalculator;
    @Before
    public void setUp(){
        stringcalculator = new Stringcalculator();
    }

    @Test
    public void 연산자확인(){
        assertEquals(true, stringcalculator.checkOperator("+"));
    }

    @Test
    public void 피연산자확인(){
        assertEquals(false, stringcalculator.checkOperand("-"));
    }
    @Test
    public void 입력식정제(){
        assertEquals(5, stringcalculator.trimmingExpression("1 + 2 * 3").length);
    }

    @Test
    public void 연산자리스트(){
        assertEquals(2, stringcalculator.separateReturnOperations(stringcalculator.trimmingExpression("1 + 2 * 3")).size());
    }

    @Test
    public void 피연산자리스트(){
        assertEquals(3, stringcalculator.separateReturnOperands(stringcalculator.trimmingExpression("1 + 2 * 3")).size());
    }

    @Test
    public void 계산(){
        assertEquals(9,stringcalculator.calculate(
                stringcalculator.separateReturnOperands(stringcalculator.trimmingExpression("1 + 2 * 3")), stringcalculator.separateReturnOperations(stringcalculator.trimmingExpression("1 + 2 * 3"))
        ));
    }
}



