package util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SplitGeneratorTest {

    SplitGenerator splitGenerator;

    @Before
    public void setUp(){
        splitGenerator = new SplitGenerator();
    }

    @Test
    public void splitStringTest(){
        String[] splitedString = SplitGenerator.getSplitString("one,two,three",",");
        assertEquals("one", splitedString[0]);
        assertEquals("two", splitedString[1]);
        assertEquals("three", splitedString[2]);
    }
}