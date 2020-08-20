package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Test cases for String2 exercises
 */
public class String2Test {

    private String2 string2testObject;

    @Before
    public void setUp() {
        string2testObject = new String2();
    }

    @Test
    public void doubleCharTest() {
        assertEquals("TThhee", string2testObject.doubleChar("The"));
        assertEquals("AAAAbbbb", string2testObject.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", string2testObject.doubleChar("Hi-There"));
        assertEquals("WWoorrdd!!", string2testObject.doubleChar("Word!"));
        assertEquals("!!!!", string2testObject.doubleChar("!!"));
        assertEquals("", string2testObject.doubleChar(""));
        assertEquals("aa", string2testObject.doubleChar("a"));
        assertEquals("..", string2testObject.doubleChar("."));
        assertEquals("aaaa", string2testObject.doubleChar("aa"));
    }

}