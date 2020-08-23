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

    @Test
    public void countHiTest() {
        assertEquals(1, string2testObject.countHi("abc hi ho"));
        assertEquals(2, string2testObject.countHi("ABChi hi"));
        assertEquals(2, string2testObject.countHi("hihi"));
        assertEquals(2, string2testObject.countHi("hiHIhi"));
        assertEquals(0, string2testObject.countHi(""));
        assertEquals(0, string2testObject.countHi("h"));
        assertEquals(1, string2testObject.countHi("hi"));
        assertEquals(0, string2testObject.countHi("Hi is no HI on ahI"));
        assertEquals(2, string2testObject.countHi("hiho not HOHIhi"));
    }

    @Test
    public void catDogTest() {
        assertTrue(string2testObject.catDog("catdog"));
        assertFalse(string2testObject.catDog("catcat"));
        assertTrue(string2testObject.catDog("1cat1cadodog"));
        assertFalse(string2testObject.catDog("catxxdogxxxdog"));
        assertTrue(string2testObject.catDog("catxdogxdogxcat"));
        assertFalse(string2testObject.catDog("catxdogxdogxca"));
        assertFalse(string2testObject.catDog("dogdogcat"));
        assertTrue(string2testObject.catDog("dogogcat"));
        assertFalse(string2testObject.catDog("dog"));
        assertFalse(string2testObject.catDog("cat"));
        assertTrue(string2testObject.catDog("ca"));
        assertTrue(string2testObject.catDog("c"));
        assertTrue(string2testObject.catDog(""));
    }

    @Test
    public void countCodeTest() {
        assertEquals(1, string2testObject.countCode("aaacodebbb"));
        assertEquals(2, string2testObject.countCode("codexxcode"));
        assertEquals(2, string2testObject.countCode("cozexxcope"));
        assertEquals(1, string2testObject.countCode("cozfxxcope"));
        assertEquals(1, string2testObject.countCode("xxcozeyycop"));
        assertEquals(0, string2testObject.countCode("cozcop"));
        assertEquals(0, string2testObject.countCode("abcxyz"));
        assertEquals(1, string2testObject.countCode("code"));
        assertEquals(0, string2testObject.countCode("ode"));
        assertEquals(0, string2testObject.countCode("c"));
        assertEquals(0, string2testObject.countCode(""));
        assertEquals(3, string2testObject.countCode("AAcodeBBcoleCCccoreDD"));
        assertEquals(2, string2testObject.countCode("AAcodeBBcoleCCccorfDD"));
        assertEquals(3, string2testObject.countCode("coAcodeBcoleccoreDD"));
    }

}