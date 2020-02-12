package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Test cases for Recursion1 exercises
 */
public class Recursion1Test {

    private Recursion1 recursion1TestObject;

    @Before
    public void setUp() {
        recursion1TestObject = new Recursion1();
    }

    @Test
    public void factoralTest() {
        assertEquals(1, recursion1TestObject.factorial(1));
        assertEquals(2, recursion1TestObject.factorial(2));
        assertEquals(6, recursion1TestObject.factorial(3));
        assertEquals(24, recursion1TestObject.factorial(4));
        assertEquals(120, recursion1TestObject.factorial(5));
        assertEquals(720, recursion1TestObject.factorial(6));
        assertEquals(5040, recursion1TestObject.factorial(7));
        assertEquals(40320, recursion1TestObject.factorial(8));
        assertEquals(479001600, recursion1TestObject.factorial(12));
    }

    @Test
    public void bunnyEarsTest() {
        assertEquals(0, recursion1TestObject.bunnyEars(0));
        assertEquals(2, recursion1TestObject.bunnyEars(1));
        assertEquals(4, recursion1TestObject.bunnyEars(2));
        assertEquals(6, recursion1TestObject.bunnyEars(3));
        assertEquals(8, recursion1TestObject.bunnyEars(4));
        assertEquals(10, recursion1TestObject.bunnyEars(5));
        assertEquals(24, recursion1TestObject.bunnyEars(12));
        assertEquals(100, recursion1TestObject.bunnyEars(50));
        assertEquals(468, recursion1TestObject.bunnyEars(234));
    }

    @Test
    public void fibonacciTest() {
        assertEquals(0, recursion1TestObject.fibonacci(0));
        assertEquals(1, recursion1TestObject.fibonacci(1));
        assertEquals(1, recursion1TestObject.fibonacci(2));
        assertEquals(2, recursion1TestObject.fibonacci(3));
        assertEquals(3, recursion1TestObject.fibonacci(4));
        assertEquals(5, recursion1TestObject.fibonacci(5));
        assertEquals(8, recursion1TestObject.fibonacci(6));
        assertEquals(13, recursion1TestObject.fibonacci(7));
    }

    @Test
    public void bunnyEars2Test() {
        assertEquals(0, recursion1TestObject.bunnyEars2(0));
        assertEquals(2, recursion1TestObject.bunnyEars2(1));
        assertEquals(5, recursion1TestObject.bunnyEars2(2));
        assertEquals(7, recursion1TestObject.bunnyEars2(3));
        assertEquals(10, recursion1TestObject.bunnyEars2(4));
        assertEquals(12, recursion1TestObject.bunnyEars2(5));
        assertEquals(15, recursion1TestObject.bunnyEars2(6));
        assertEquals(25, recursion1TestObject.bunnyEars2(10));
    }

    @Test
    public void triagleTest() {
        assertEquals(0, recursion1TestObject.triangle(0));
        assertEquals(1, recursion1TestObject.triangle(1));
        assertEquals(3, recursion1TestObject.triangle(2));
        assertEquals(6, recursion1TestObject.triangle(3));
        assertEquals(10, recursion1TestObject.triangle(4));
        assertEquals(15, recursion1TestObject.triangle(5));
        assertEquals(21, recursion1TestObject.triangle(6));
        assertEquals(28, recursion1TestObject.triangle(7));
    }

    @Test
    public void sumDigitsTest() {
        assertEquals(9, recursion1TestObject.sumDigits(126));
        assertEquals(13, recursion1TestObject.sumDigits(49));
        assertEquals(3, recursion1TestObject.sumDigits(12));
        assertEquals(1, recursion1TestObject.sumDigits(10));
        assertEquals(1, recursion1TestObject.sumDigits(1));
        assertEquals(0, recursion1TestObject.sumDigits(0));
        assertEquals(10, recursion1TestObject.sumDigits(730));
        assertEquals(4, recursion1TestObject.sumDigits(1111));
        assertEquals(5, recursion1TestObject.sumDigits(11111));
        assertEquals(3, recursion1TestObject.sumDigits(10110));
        assertEquals(10, recursion1TestObject.sumDigits(235));
    }

    @Test
    public void count7Test() {
        assertEquals(2, recursion1TestObject.count7(717));
        assertEquals(1, recursion1TestObject.count7(7));
        assertEquals(0, recursion1TestObject.count7(123));
        assertEquals(2, recursion1TestObject.count7(77));
        assertEquals(1, recursion1TestObject.count7(7123));
        assertEquals(3, recursion1TestObject.count7(771237));
        assertEquals(4, recursion1TestObject.count7(771737));
        assertEquals(2, recursion1TestObject.count7(47571));
        assertEquals(6, recursion1TestObject.count7(777777));
        assertEquals(4, recursion1TestObject.count7(70701277));
        assertEquals(5, recursion1TestObject.count7(777576197));
        assertEquals(0, recursion1TestObject.count7(99999));
        assertEquals(1, recursion1TestObject.count7(99799));
    }

    @Test
    public void cont8Test() {
        assertEquals(1, recursion1TestObject.count8(8));
        assertEquals(2, recursion1TestObject.count8(818));
        assertEquals(4, recursion1TestObject.count8(8818));
        assertEquals(4, recursion1TestObject.count8(8088));
        assertEquals(0, recursion1TestObject.count8(123));
        assertEquals(2, recursion1TestObject.count8(81238));
        assertEquals(6, recursion1TestObject.count8(88788));
        assertEquals(1, recursion1TestObject.count8(8234));
        assertEquals(1, recursion1TestObject.count8(2348));
        assertEquals(3, recursion1TestObject.count8(23884));
        assertEquals(0, recursion1TestObject.count8(0));
        assertEquals(5, recursion1TestObject.count8(1818188));
        assertEquals(5, recursion1TestObject.count8(8818181));
        assertEquals(1, recursion1TestObject.count8(1080));
        assertEquals(3, recursion1TestObject.count8(188));
        assertEquals(9, recursion1TestObject.count8(88888));
        assertEquals(2, recursion1TestObject.count8(9898));
        assertEquals(1, recursion1TestObject.count8(78));
    }

    @Test
    public void powerNTest() {
        assertEquals(3, recursion1TestObject.powerN(3, 1));
        assertEquals(9, recursion1TestObject.powerN(3, 2));
        assertEquals(27, recursion1TestObject.powerN(3, 3));
        assertEquals(2, recursion1TestObject.powerN(2, 1));
        assertEquals(4, recursion1TestObject.powerN(2, 2));
        assertEquals(8, recursion1TestObject.powerN(2, 3));
        assertEquals(16, recursion1TestObject.powerN(2, 4));
        assertEquals(32, recursion1TestObject.powerN(2, 5));
        assertEquals(10, recursion1TestObject.powerN(10, 1));
        assertEquals(100, recursion1TestObject.powerN(10, 2));
        assertEquals(1000, recursion1TestObject.powerN(10, 3));
    }

    @Test
    public void countXTest() {
        assertEquals(4, recursion1TestObject.countX("xxhixx"));
        assertEquals(3, recursion1TestObject.countX("xhixhix"));
        assertEquals(0, recursion1TestObject.countX("hi"));
        assertEquals(0, recursion1TestObject.countX("h"));
        assertEquals(1, recursion1TestObject.countX("x"));
        assertEquals(0, recursion1TestObject.countX(""));
        assertEquals(0, recursion1TestObject.countX("hihi"));
        assertEquals(0, recursion1TestObject.countX("hiAAhi12hi"));
    }

    @Test
    public void countHiTest() {
        assertEquals(1, recursion1TestObject.countHi("xxhixx"));
        assertEquals(2, recursion1TestObject.countHi("xhixhix"));
        assertEquals(1, recursion1TestObject.countHi("hi"));
        assertEquals(2, recursion1TestObject.countHi("hihih"));
        assertEquals(0, recursion1TestObject.countHi("h"));
        assertEquals(0, recursion1TestObject.countHi(""));
        assertEquals(4, recursion1TestObject.countHi("ihihihihih"));
        assertEquals(5, recursion1TestObject.countHi("ihihihihihi"));
        assertEquals(3, recursion1TestObject.countHi("hiAAhi12hi"));
        assertEquals(3, recursion1TestObject.countHi("xhixhxihihhhih"));
        assertEquals(1, recursion1TestObject.countHi("ship"));
    }

    @Test
    public void changeXYTest() {
        assertEquals("codey", recursion1TestObject.changeXY("codex"));
        assertEquals("yyhiyy", recursion1TestObject.changeXY("xxhixx"));
        assertEquals("yhiyhiy", recursion1TestObject.changeXY("xhixhix"));
        assertEquals("hiy", recursion1TestObject.changeXY("hiy"));
        assertEquals("h", recursion1TestObject.changeXY("h"));
        assertEquals("y", recursion1TestObject.changeXY("x"));
        assertEquals("", recursion1TestObject.changeXY(""));
        assertEquals("yyy", recursion1TestObject.changeXY("xxx"));
        assertEquals("yyhyyi", recursion1TestObject.changeXY("yyhxyi"));
        assertEquals("hihi", recursion1TestObject.changeXY("hihi"));
    }

    @Test
    public void changePiTest() {
        assertEquals("x3.14x", recursion1TestObject.changePi("xpix"));
        assertEquals("3.143.14", recursion1TestObject.changePi("pipi"));
        assertEquals("3.14p", recursion1TestObject.changePi("pip"));
        assertEquals("3.14", recursion1TestObject.changePi("pi"));
        assertEquals("hip", recursion1TestObject.changePi("hip"));
        assertEquals("p", recursion1TestObject.changePi("p"));
        assertEquals("x", recursion1TestObject.changePi("x"));
        assertEquals("", recursion1TestObject.changePi(""));
        assertEquals("3.14xx", recursion1TestObject.changePi("pixx"));
        assertEquals("xyzzy", recursion1TestObject.changePi("xyzzy"));
    }

    @Test
    public void noXTest() {
        assertEquals("ab", recursion1TestObject.noX("xaxb"));
        assertEquals("abc", recursion1TestObject.noX("abc"));
        assertEquals("", recursion1TestObject.noX("xx"));
        assertEquals("", recursion1TestObject.noX(""));
        assertEquals("ab", recursion1TestObject.noX("axxbxx"));
        assertEquals("Hello", recursion1TestObject.noX("Hellox"));
    }

    @Test
    public void array6Test() {
        assertTrue(recursion1TestObject.array6(new int[] { 1, 6, 4 }, 0));
        assertFalse(recursion1TestObject.array6(new int[] { 1, 4 }, 0));
        assertTrue(recursion1TestObject.array6(new int[] { 6 }, 0));
        assertFalse(recursion1TestObject.array6(new int[] {}, 0));
        assertTrue(recursion1TestObject.array6(new int[] { 6, 2, 2 }, 0));
        assertFalse(recursion1TestObject.array6(new int[] { 2, 5 }, 0));
        assertTrue(recursion1TestObject.array6(new int[] { 1, 9, 4, 6, 6 }, 0));
        assertTrue(recursion1TestObject.array6(new int[] { 2, 5, 6 }, 0));
    }

    @Test
    public void array11Test() {
        assertEquals(1, recursion1TestObject.array11(new int[] { 1, 2, 11 }, 0));
        assertEquals(2, recursion1TestObject.array11(new int[] { 11, 11 }, 0));
        assertEquals(0, recursion1TestObject.array11(new int[] { 1, 2, 3, 4 }, 0));
        assertEquals(3, recursion1TestObject.array11(new int[] { 1, 11, 3, 11, 11 }, 0));
        assertEquals(1, recursion1TestObject.array11(new int[] { 11 }, 0));
        assertEquals(0, recursion1TestObject.array11(new int[] { 1 }, 0));
        assertEquals(0, recursion1TestObject.array11(new int[] {}, 0));
        assertEquals(2, recursion1TestObject.array11(new int[] { 11, 2, 3, 4, 11, 5 }, 0));
        assertEquals(2, recursion1TestObject.array11(new int[] { 11, 5, 11 }, 0));
    }

    @Test
    public void array220Test() {
        assertTrue(recursion1TestObject.array220(new int[] { 1, 2, 20 }, 0));
        assertTrue(recursion1TestObject.array220(new int[] { 3, 30 }, 0));
        assertFalse(recursion1TestObject.array220(new int[] { 3 }, 0));
        assertFalse(recursion1TestObject.array220(new int[] {}, 0));
        assertTrue(recursion1TestObject.array220(new int[] { 3, 3, 30, 4 }, 0));
        assertFalse(recursion1TestObject.array220(new int[] { 2, 19, 4 }, 0));
        assertFalse(recursion1TestObject.array220(new int[] { 20, 2, 21 }, 0));
        assertTrue(recursion1TestObject.array220(new int[] { 20, 2, 21, 210 }, 0));
        assertTrue(recursion1TestObject.array220(new int[] { 2, 200, 2000 }, 0));
        assertTrue(recursion1TestObject.array220(new int[] { 0, 0 }, 0));
        assertFalse(recursion1TestObject.array220(new int[] { 1, 2, 3, 4, 5, 6 }, 0));
        assertTrue(recursion1TestObject.array220(new int[] { 1, 2, 3, 4, 5, 50, 6 }, 0));
        assertFalse(recursion1TestObject.array220(new int[] { 1, 2, 3, 4, 5, 51, 6 }, 0));
        assertTrue(recursion1TestObject.array220(new int[] { 1, 2, 3, 4, 4, 50, 500, 6 }, 0));
    }

    @Test
    public void allStarTest() {
        assertEquals("h*e*l*l*o", recursion1TestObject.allStar("hello"));
        assertEquals("a*b*c", recursion1TestObject.allStar("abc"));
        assertEquals("a*b", recursion1TestObject.allStar("ab"));
        assertEquals("a", recursion1TestObject.allStar("a"));
        assertEquals("", recursion1TestObject.allStar(""));
        assertEquals("3*.*1*4", recursion1TestObject.allStar("3.14"));
        assertEquals("C*h*o*c*o*l*a*t*e", recursion1TestObject.allStar("Chocolate"));
        assertEquals("1*2*3*4", recursion1TestObject.allStar("1234"));
    }

    @Test
    public void pairStarTest() {
        assertEquals("hel*lo", recursion1TestObject.pairStar("hello"));
        assertEquals("x*xy*y", recursion1TestObject.pairStar("xxyy"));
        assertEquals("a*a*a*a", recursion1TestObject.pairStar("aaaa"));
        assertEquals("a*a*ab", recursion1TestObject.pairStar("aaab"));
        assertEquals("a*a", recursion1TestObject.pairStar("aa"));
        assertEquals("a", recursion1TestObject.pairStar("a"));
        assertEquals("", recursion1TestObject.pairStar(""));
        assertEquals("noadjacent", recursion1TestObject.pairStar("noadjacent"));
        assertEquals("ab*ba", recursion1TestObject.pairStar("abba"));
        assertEquals("ab*b*ba", recursion1TestObject.pairStar("abbba"));
    }

    @Test
    public void endXTest() {
        assertEquals("rexx", recursion1TestObject.endX("xxre"));
        assertEquals("hixxxx", recursion1TestObject.endX("xxhixx"));
        assertEquals("hihixxx", recursion1TestObject.endX("xhixhix"));
        assertEquals("hiy", recursion1TestObject.endX("hiy"));
        assertEquals("h", recursion1TestObject.endX("h"));
        assertEquals("x", recursion1TestObject.endX("x"));
        assertEquals("xx", recursion1TestObject.endX("xx"));
        assertEquals("", recursion1TestObject.endX(""));
        assertEquals("bxx", recursion1TestObject.endX("bxx"));
        assertEquals("baxx", recursion1TestObject.endX("bxax"));
        assertEquals("aaaxxx", recursion1TestObject.endX("axaxax"));
        assertEquals("hixxx", recursion1TestObject.endX("xxhxi"));
    }

    @Test
    public void countPairsTest() {
        assertEquals(1, recursion1TestObject.countPairs("axa"));
        assertEquals(2, recursion1TestObject.countPairs("axax"));
        assertEquals(1, recursion1TestObject.countPairs("axbx"));
        assertEquals(0, recursion1TestObject.countPairs("hi"));
        assertEquals(3, recursion1TestObject.countPairs("hihih"));
        assertEquals(3, recursion1TestObject.countPairs("ihihhh"));
        assertEquals(0, recursion1TestObject.countPairs("ihjxhh"));
        assertEquals(0, recursion1TestObject.countPairs(""));
        assertEquals(0, recursion1TestObject.countPairs("a"));
        assertEquals(0, recursion1TestObject.countPairs("aa"));
        assertEquals(1, recursion1TestObject.countPairs("aaa"));
    }

    @Test
    public void countAbcTest() {
        assertEquals(1, recursion1TestObject.countAbc("abc"));
        assertEquals(2, recursion1TestObject.countAbc("abcxxabc"));
        assertEquals(2, recursion1TestObject.countAbc("abaxxaba"));
        assertEquals(2, recursion1TestObject.countAbc("ababc"));
        assertEquals(0, recursion1TestObject.countAbc("abxbc"));
        assertEquals(1, recursion1TestObject.countAbc("aaabc"));
        assertEquals(0, recursion1TestObject.countAbc("hello"));
        assertEquals(0, recursion1TestObject.countAbc(""));
        assertEquals(0, recursion1TestObject.countAbc("ab"));
        assertEquals(1, recursion1TestObject.countAbc("aba"));
        assertEquals(0, recursion1TestObject.countAbc("aca"));
        assertEquals(0, recursion1TestObject.countAbc("aaa"));
    }

    @Test
    public void ount11Test() {
        assertEquals(2, recursion1TestObject.count11("11abc11"));
        assertEquals(3, recursion1TestObject.count11("abc11x11x11"));
        assertEquals(1, recursion1TestObject.count11("111"));
        assertEquals(2, recursion1TestObject.count11("1111"));
        assertEquals(0, recursion1TestObject.count11("1"));
        assertEquals(0, recursion1TestObject.count11(""));
        assertEquals(0, recursion1TestObject.count11("hi"));
        assertEquals(4, recursion1TestObject.count11("11x111x1111"));
        assertEquals(1, recursion1TestObject.count11("1x111"));
        assertEquals(0, recursion1TestObject.count11("1Hello1"));
        assertEquals(0, recursion1TestObject.count11("Hello"));
    }

    @Test
    public void stringCleanTest() {
        assertEquals("yza", recursion1TestObject.stringClean("yyzzza"));
        assertEquals("abcd", recursion1TestObject.stringClean("abbbcdd"));
        assertEquals("Helo", recursion1TestObject.stringClean("Hello"));
        assertEquals("XabcY", recursion1TestObject.stringClean("XXabcYY"));
        assertEquals("12ab45", recursion1TestObject.stringClean("112ab445"));
        assertEquals("Helo Bokeper", recursion1TestObject.stringClean("Hello Bookkeeper"));
    }

    @Test
    public void countHi2Test() {
        assertEquals(1, recursion1TestObject.countHi2("ahixhi"));
        assertEquals(2, recursion1TestObject.countHi2("ahibhi"));
        assertEquals(0, recursion1TestObject.countHi2("xhixhi"));
        assertEquals(1, recursion1TestObject.countHi2("hixhi"));
        assertEquals(2, recursion1TestObject.countHi2("hixhhi"));
        assertEquals(3, recursion1TestObject.countHi2("hihihi"));
        assertEquals(3, recursion1TestObject.countHi2("hihihix"));
        assertEquals(2, recursion1TestObject.countHi2("xhihihix"));
        assertEquals(0, recursion1TestObject.countHi2("xxhi"));
        assertEquals(1, recursion1TestObject.countHi2("hixxhi"));
        assertEquals(1, recursion1TestObject.countHi2("hi"));
        assertEquals(0, recursion1TestObject.countHi2("xxxx"));
        assertEquals(0, recursion1TestObject.countHi2("h"));
        assertEquals(0, recursion1TestObject.countHi2("x"));
        assertEquals(0, recursion1TestObject.countHi2(""));
        assertEquals(1, recursion1TestObject.countHi2("Hellohi"));
    }
}