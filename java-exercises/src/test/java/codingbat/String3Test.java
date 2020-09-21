package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class String3Test {
    private String3 string3testObject;

    @Before
    public void setUp() {
        string3testObject = new String3();
    }

    @Test
    public void countYZTest() {
        assertEquals(2, string3testObject.countYZ("fez day"));
        assertEquals(2, string3testObject.countYZ("day fez"));
        assertEquals(2, string3testObject.countYZ("day fyyyz"));
        assertEquals(1, string3testObject.countYZ("day yak"));
        assertEquals(1, string3testObject.countYZ("day:yak"));
        assertEquals(2, string3testObject.countYZ("!!day--yaz!!"));
        assertEquals(0, string3testObject.countYZ("yak zak"));
        assertEquals(2, string3testObject.countYZ("DAY abc XYZ"));
        assertEquals(3, string3testObject.countYZ("aaz yyz my"));
        assertEquals(2, string3testObject.countYZ("y2bz"));
        assertEquals(0, string3testObject.countYZ("zxyx"));
    }

    @Test
    public void withoutStringTest() {
        assertEquals("He there", string3testObject.withoutString("Hello there", "llo"));
        assertEquals("Hllo thr", string3testObject.withoutString("Hello there", "e"));
        assertEquals("Hello there", string3testObject.withoutString("Hello there", "x"));
        assertEquals("Th a FH", string3testObject.withoutString("This is a FISH", "IS"));
        assertEquals("TH a FH", string3testObject.withoutString("THIS is a FISH", "is"));
        assertEquals("TH a FH", string3testObject.withoutString("THIS is a FISH", "iS"));
        assertEquals("abab", string3testObject.withoutString("abxxxxab", "xx"));
        assertEquals("abxab", string3testObject.withoutString("abxxxab", "xx"));
        assertEquals("abab", string3testObject.withoutString("abxxxab", "x"));
        assertEquals("", string3testObject.withoutString("xxx", "x"));
        assertEquals("x", string3testObject.withoutString("xxx", "xx"));
        assertEquals("xzz", string3testObject.withoutString("xyzzy", "Y"));
        assertEquals("", string3testObject.withoutString("", "x"));
        assertEquals("acac", string3testObject.withoutString("abcabc", "b"));
        assertEquals("AAbb", string3testObject.withoutString("AA22bb", "2"));
        assertEquals("", string3testObject.withoutString("1111", "1"));
        assertEquals("", string3testObject.withoutString("1111", "11"));
        assertEquals("jtx", string3testObject.withoutString("MkjtMkx", "Mk"));
        assertEquals("Hi", string3testObject.withoutString("Hi HoHo", "Ho"));
    }

    @Test
    public void equalIsNotTest() {
        assertFalse(string3testObject.equalIsNot("This is not"));
        assertTrue(string3testObject.equalIsNot("This is notnot"));
        assertTrue(string3testObject.equalIsNot("noisxxnotyynotxisi"));
        assertFalse(string3testObject.equalIsNot("noisxxnotyynotxsi"));
        assertTrue(string3testObject.equalIsNot("xxxyyyzzzintint"));
        assertTrue(string3testObject.equalIsNot(""));
        assertTrue(string3testObject.equalIsNot("isisnotnot"));
        assertFalse(string3testObject.equalIsNot("isisnotno7Not"));
        assertFalse(string3testObject.equalIsNot("isnotis"));
        assertFalse(string3testObject.equalIsNot("mis3notpotbotis"));
    }

    @Test
    public void gHappyTest() {
        assertTrue(string3testObject.gHappy("xxggxx"));
        assertFalse(string3testObject.gHappy("xxgxx"));
        assertFalse(string3testObject.gHappy("xxggyygxx"));
        assertFalse(string3testObject.gHappy("g"));
        assertTrue(string3testObject.gHappy("gg"));
        assertTrue(string3testObject.gHappy(""));
        assertTrue(string3testObject.gHappy("xxgggxyz"));
        assertFalse(string3testObject.gHappy("xxgggxyg"));
        assertTrue(string3testObject.gHappy("xxgggxygg"));
        assertFalse(string3testObject.gHappy("mgm"));
        assertTrue(string3testObject.gHappy("mggm"));
        assertTrue(string3testObject.gHappy("yyygggxyy"));
    }

    @Test
    public void countTripleTest() {
        assertEquals(1, string3testObject.countTriple("abcXXXabc"));
        assertEquals(3, string3testObject.countTriple("xxxabyyyycd"));
        assertEquals(0, string3testObject.countTriple("a"));
        assertEquals(0, string3testObject.countTriple(""));
        assertEquals(1, string3testObject.countTriple("XXXabc"));
        assertEquals(2, string3testObject.countTriple("XXXXabc"));
        assertEquals(3, string3testObject.countTriple("XXXXXabc"));
        assertEquals(3, string3testObject.countTriple("222abyyycdXXX"));
        assertEquals(4, string3testObject.countTriple("abYYYabXXXXXab"));
        assertEquals(0, string3testObject.countTriple("abYYXabXXYXXab"));
        assertEquals(0, string3testObject.countTriple("abYYXabXXYXXab"));
        assertEquals(1, string3testObject.countTriple("122abhhh2"));
    }
}