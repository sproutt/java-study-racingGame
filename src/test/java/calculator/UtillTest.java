package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class UtillTest {
    Util util;

    @Before
    public void setUp() {
        util = new Util();
    }

    @Test
    public void 공백검사() {
        assertEquals(true, util.isNull(""));
    }

    @Test
    public void 공백나누기() {
        String[] element = new String[]{"3", "+", "2"};
        assertArrayEquals(element, util.split("3 + 2"));
    }

    @Test
    public void 공백지우기() {
        assertEquals("", util.removeBlank(" "));
    }
}
