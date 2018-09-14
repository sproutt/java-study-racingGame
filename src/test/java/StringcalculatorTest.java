import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;


public class StringcalculatorTest {

    Stringcalculator scal;

    @Before
    public void setUp(){
        scal = new Stringcalculator();
    }
    @Test
    public void 문자추출(){
        assertEquals("S", scal.parseStringtoChar("String"));
    }
    @After
    public void tearDown(){
        scal = null;
    }




}



