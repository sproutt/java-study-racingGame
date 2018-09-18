import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Scanner;


public class StringcalculatorTest {

    Stringcalculator stringcalculator;

    @Before
    public void setUp(){
        stringcalculator = new Stringcalculator();
    }

    @Test
    public void 문자형변환(){
        assertEquals('J', stringcalculator.parseStringToCharacter("Jehyeon"));
    }

    @Test
    public void 계산(){
        stringcalculator.trimmingExpression("1 + 2 * 3");
        stringcalculator.separateExpression();
        stringcalculator.calculation();
        assertEquals(9,stringcalculator.printAnswer());
    }


}



