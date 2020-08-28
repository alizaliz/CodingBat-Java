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

    @Test
    public void endOtherTest() {
        assertTrue(string2testObject.endOther("Hiabc", "abc"));
        assertTrue(string2testObject.endOther("AbC", "HiaBc"));
        assertTrue(string2testObject.endOther("abc", "abXabc"));
        assertFalse(string2testObject.endOther("Hiabc", "abcd"));
        assertTrue(string2testObject.endOther("Hiabc", "bc"));
        assertFalse(string2testObject.endOther("Hiabcx", "bc"));
        assertTrue(string2testObject.endOther("abc", "abc"));
        assertTrue(string2testObject.endOther("xyz", "12xyz"));
        assertFalse(string2testObject.endOther("yz", "12xz"));
        assertTrue(string2testObject.endOther("Z", "12xz"));
        assertTrue(string2testObject.endOther("12", "12"));
        assertFalse(string2testObject.endOther("abcXYZ", "abcDEF"));
        assertFalse(string2testObject.endOther("ab", "ab12"));
        assertTrue(string2testObject.endOther("ab", "12ab"));
    }

    @Test
    public void xyzThereTest() {
        assertTrue(string2testObject.xyzThere("abcxyz"));
        assertFalse(string2testObject.xyzThere("abc.xyz"));
        assertTrue(string2testObject.xyzThere("xyz.abc"));
        assertFalse(string2testObject.xyzThere("abcxy"));
        assertTrue(string2testObject.xyzThere("xyz"));
        assertFalse(string2testObject.xyzThere("xy"));
        assertFalse(string2testObject.xyzThere("x"));
        assertFalse(string2testObject.xyzThere(""));
        assertTrue(string2testObject.xyzThere("abc.xyzxyz"));
        assertTrue(string2testObject.xyzThere("abc.xxyz"));
        assertFalse(string2testObject.xyzThere(".xyz"));
        assertFalse(string2testObject.xyzThere("12.xyz"));
        assertTrue(string2testObject.xyzThere("12xyz"));
        assertFalse(string2testObject.xyzThere("1.xyz.xyz2.xyz"));
    }

    @Test
    public void bobThereTest() {
        assertTrue(string2testObject.bobThere("abcbob"));
        assertTrue(string2testObject.bobThere("b9b"));
        assertFalse(string2testObject.bobThere("bac"));
        assertTrue(string2testObject.bobThere("bbb"));
        assertFalse(string2testObject.bobThere("abcdefb"));
        assertTrue(string2testObject.bobThere("123abcbcdbabxyz"));
        assertFalse(string2testObject.bobThere("b12"));
        assertTrue(string2testObject.bobThere("b1b"));
        assertTrue(string2testObject.bobThere("b12b1b"));
        assertFalse(string2testObject.bobThere("bbc"));
        assertTrue(string2testObject.bobThere("bbb"));
        assertFalse(string2testObject.bobThere("bb"));
        assertFalse(string2testObject.bobThere("b"));
    }

    @Test
    public void xyBalanceTest() {
        assertTrue(string2testObject.xyBalance("aaxbby"));
        assertFalse(string2testObject.xyBalance("aaxbb"));
        assertFalse(string2testObject.xyBalance("yaaxbb"));
        assertTrue(string2testObject.xyBalance("yaaxbby"));
        assertTrue(string2testObject.xyBalance("xaxxbby"));
        assertFalse(string2testObject.xyBalance("xaxxbbyx"));
        assertTrue(string2testObject.xyBalance("xxbxy"));
        assertFalse(string2testObject.xyBalance("xxbx"));
        assertTrue(string2testObject.xyBalance("bbb"));
        assertFalse(string2testObject.xyBalance("bxbb"));
        assertTrue(string2testObject.xyBalance("bxyb"));
        assertTrue(string2testObject.xyBalance("xy"));
        assertTrue(string2testObject.xyBalance("y"));
        assertFalse(string2testObject.xyBalance("x"));
        assertTrue(string2testObject.xyBalance(""));
        assertFalse(string2testObject.xyBalance("yxyxyxyx"));
        assertTrue(string2testObject.xyBalance("yxyxyxyxy"));
        assertTrue(string2testObject.xyBalance("12xabxxydxyxyzz"));
    }

    @Test
    public void mixStringTest() {
        assertEquals("axbycz", string2testObject.mixString("abc", "xyz"));
        assertEquals("HTihere", string2testObject.mixString("Hi", "There"));
        assertEquals("xTxhxexre", string2testObject.mixString("xxxx", "There"));
        assertEquals("xXxx", string2testObject.mixString("xxx", "X"));
        assertEquals("22/7 around", string2testObject.mixString("2/", "27 around"));
        assertEquals("Hello", string2testObject.mixString("", "Hello"));
        assertEquals("Abc", string2testObject.mixString("Abc", ""));
        assertEquals("", string2testObject.mixString("", ""));
        assertEquals("ab", string2testObject.mixString("a", "b"));
        assertEquals("abx", string2testObject.mixString("ax", "b"));
        assertEquals("abx", string2testObject.mixString("a", "bx"));
        assertEquals("SLoong", string2testObject.mixString("So", "Long"));
        assertEquals("LSoong", string2testObject.mixString("Long", "So"));
    }

    @Test
    public void repeatEndTest() {
        assertEquals("llollollo", string2testObject.repeatEnd("Hello", 3));
        assertEquals("lolo", string2testObject.repeatEnd("Hello", 2));
        assertEquals("o", string2testObject.repeatEnd("Hello", 1));
        assertEquals("", string2testObject.repeatEnd("Hello", 0));
        assertEquals("abcabcabc", string2testObject.repeatEnd("abc", 3));
        assertEquals("3434", string2testObject.repeatEnd("1234", 2));
        assertEquals("234234234", string2testObject.repeatEnd("1234", 3));
        assertEquals("", string2testObject.repeatEnd("", 0));
    }

    @Test
    public void repeatFrontTest() {
        assertEquals("ChocChoChC", string2testObject.repeatFront("Chocolate", 4));
        assertEquals("ChoChC", string2testObject.repeatFront("Chocolate", 3));
        assertEquals("IcI", string2testObject.repeatFront("Ice Cream", 2));
        assertEquals("I", string2testObject.repeatFront("Ice Cream", 1));
        assertEquals("", string2testObject.repeatFront("Ice Cream", 0));
        assertEquals("xyzxyx", string2testObject.repeatFront("xyz", 3));
        assertEquals("", string2testObject.repeatFront("", 0));
        assertEquals("JavaJavJaJ", string2testObject.repeatFront("Java", 4));
        assertEquals("J", string2testObject.repeatFront("Java", 1));
    }

}