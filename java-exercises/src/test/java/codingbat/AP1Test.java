
package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;

/**
 * Test cases for AP-1 exercises
 */
public class AP1Test {
    private AP1 ap1TestObject;

    @Before
    public void setUp() {
        ap1TestObject = new AP1();
    }

    @Test
    public void scoresIncreasingTest() {
        assertTrue(ap1TestObject.scoresIncreasing(new int[] { 1, 3, 4 }));
        assertFalse(ap1TestObject.scoresIncreasing(new int[] { 1, 3, 2 }));
        assertTrue(ap1TestObject.scoresIncreasing(new int[] { 1, 1, 4 }));
        assertTrue(ap1TestObject.scoresIncreasing(new int[] { 1, 1, 2, 4, 4, 7 }));
        assertFalse(ap1TestObject.scoresIncreasing(new int[] { 1, 1, 2, 4, 3, 7 }));
        assertTrue(ap1TestObject.scoresIncreasing(new int[] { -5, 4, 11 }));
    }

    @Test
    public void scores100Test() {
        assertTrue(ap1TestObject.scores100(new int[] { 1, 100, 100 }));
        assertFalse(ap1TestObject.scores100(new int[] { 1, 100, 99, 100 }));
        assertTrue(ap1TestObject.scores100(new int[] { 100, 1, 100, 100 }));
        assertFalse(ap1TestObject.scores100(new int[] { 100, 1, 100, 1 }));
        assertFalse(ap1TestObject.scores100(new int[] { 1, 2, 3, 4, 5 }));
        assertFalse(ap1TestObject.scores100(new int[] { 1, 2, 100, 4, 5 }));
    }

    @Test
    public void scoreClumpTest() {
        assertTrue(ap1TestObject.scoresClump(new int[] { 3, 4, 5 }));
        assertFalse(ap1TestObject.scoresClump(new int[] { 3, 4, 6 }));
        assertTrue(ap1TestObject.scoresClump(new int[] { 1, 3, 5, 5 }));
        assertTrue(ap1TestObject.scoresClump(new int[] { 2, 4, 5, 6 }));
        assertFalse(ap1TestObject.scoresClump(new int[] { 2, 4, 5, 7 }));
        assertTrue(ap1TestObject.scoresClump(new int[] { 2, 4, 4, 7 }));
        assertFalse(ap1TestObject.scoresClump(new int[] { 3, 3, 6, 7, 9 }));
        assertTrue(ap1TestObject.scoresClump(new int[] { 3, 3, 7, 7, 9 }));
        assertFalse(ap1TestObject.scoresClump(new int[] { 4, 5, 8 }));
    }

    @Test
    public void scoresAverageTest() {
        assertEquals(4, ap1TestObject.scoresAverage(new int[] { 2, 2, 4, 4 }));
        assertEquals(4, ap1TestObject.scoresAverage(new int[] { 4, 4, 4, 2, 2, 2 }));
        assertEquals(4, ap1TestObject.scoresAverage(new int[] { 3, 4, 5, 1, 2, 3 }));
        assertEquals(6, ap1TestObject.scoresAverage(new int[] { 5, 6 }));
        assertEquals(5, ap1TestObject.scoresAverage(new int[] { 5, 4 }));
        assertEquals(5, ap1TestObject.scoresAverage(new int[] { 5, 4, 5, 6, 2, 1, 2, 3 }));
    }

    @Test
    public void wordsCountTest() {
        assertEquals(2, ap1TestObject.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 1));
        assertEquals(1, ap1TestObject.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 3));
        assertEquals(0, ap1TestObject.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 4));
        assertEquals(2, ap1TestObject.wordsCount(new String[] { "xx", "yyy", "x", "yy", "z" }, 1));
        assertEquals(2, ap1TestObject.wordsCount(new String[] { "xx", "yyy", "x", "yy", "z" }, 2));
        assertEquals(1, ap1TestObject.wordsCount(new String[] { "xx", "yyy", "x", "yy", "z" }, 3));
    }

    @Test
    public void wordsFrontTest() {
        assertArrayEquals(new String[] { "a" }, ap1TestObject.wordsFront(new String[] { "a", "b", "c", "d" }, 1));
        assertArrayEquals(new String[] { "a", "b" }, ap1TestObject.wordsFront(new String[] { "a", "b", "c", "d" }, 2));
        assertArrayEquals(new String[] { "a", "b", "c" },
                ap1TestObject.wordsFront(new String[] { "a", "b", "c", "d" }, 3));
        assertArrayEquals(new String[] { "a", "b", "c", "d" },
                ap1TestObject.wordsFront(new String[] { "a", "b", "c", "d" }, 4));
        assertArrayEquals(new String[] { "Hi" }, ap1TestObject.wordsFront(new String[] { "Hi", "There" }, 1));
        assertArrayEquals(new String[] { "Hi", "There" }, ap1TestObject.wordsFront(new String[] { "Hi", "There" }, 2));
    }

    @Test
    public void wordsWithoutListTest() {
        assertEquals(Arrays.asList("bb", "ccc"),
                ap1TestObject.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 1));
        assertEquals(Arrays.asList("a", "bb", "b"),
                ap1TestObject.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 3));
        assertEquals(Arrays.asList("a", "bb", "b", "ccc"),
                ap1TestObject.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 4));
        assertEquals(Arrays.asList("xx", "yyy", "yy"),
                ap1TestObject.wordsWithoutList(new String[] { "xx", "yyy", "x", "yy", "z" }, 1));
        assertEquals(Arrays.asList("yyy", "x", "z"),
                ap1TestObject.wordsWithoutList(new String[] { "xx", "yyy", "x", "yy", "z" }, 2));
    }

    @Test
    public void hasOneTest() {
        assertTrue(ap1TestObject.hasOne(10));
        assertFalse(ap1TestObject.hasOne(22));
        assertFalse(ap1TestObject.hasOne(220));
        assertTrue(ap1TestObject.hasOne(212));
        assertTrue(ap1TestObject.hasOne(1));
        assertFalse(ap1TestObject.hasOne(9));
        assertTrue(ap1TestObject.hasOne(211112));
        assertTrue(ap1TestObject.hasOne(121121));
        assertFalse(ap1TestObject.hasOne(222222));
        assertTrue(ap1TestObject.hasOne(56156));
        assertFalse(ap1TestObject.hasOne(56556));
    }

    @Test
    public void divideSelfTest() {
        assertTrue(ap1TestObject.dividesSelf(128));
        assertTrue(ap1TestObject.dividesSelf(12));
        assertFalse(ap1TestObject.dividesSelf(120));
        assertTrue(ap1TestObject.dividesSelf(122));
        assertFalse(ap1TestObject.dividesSelf(13));
        assertFalse(ap1TestObject.dividesSelf(32));
        assertTrue(ap1TestObject.dividesSelf(22));
        assertFalse(ap1TestObject.dividesSelf(42));
        assertTrue(ap1TestObject.dividesSelf(212));
        assertFalse(ap1TestObject.dividesSelf(213));
        assertTrue(ap1TestObject.dividesSelf(162));
    }

    @Test
    public void copyEvensTest() {
        assertArrayEquals(new int[] { 2, 4 }, ap1TestObject.copyEvens(new int[] { 3, 2, 4, 5, 8 }, 2));
        assertArrayEquals(new int[] { 2, 4, 8 }, ap1TestObject.copyEvens(new int[] { 3, 2, 4, 5, 8 }, 3));
        assertArrayEquals(new int[] { 6, 2, 4 }, ap1TestObject.copyEvens(new int[] { 6, 1, 2, 4, 5, 8 }, 3));
        assertArrayEquals(new int[] { 6, 2, 4, 8 }, ap1TestObject.copyEvens(new int[] { 6, 1, 2, 4, 5, 8 }, 4));
        assertArrayEquals(new int[] { 4 }, ap1TestObject.copyEvens(new int[] { 3, 1, 4, 1, 5 }, 1));
        assertArrayEquals(new int[] { 2 }, ap1TestObject.copyEvens(new int[] { 2 }, 1));
        assertArrayEquals(new int[] { 6, 2 }, ap1TestObject.copyEvens(new int[] { 6, 2, 4, 8 }, 2));
        assertArrayEquals(new int[] { 6, 2, 4 }, ap1TestObject.copyEvens(new int[] { 6, 2, 4, 8 }, 3));
        assertArrayEquals(new int[] { 6, 2, 4, 8 }, ap1TestObject.copyEvens(new int[] { 6, 2, 4, 8 }, 4));
        assertArrayEquals(new int[] { 8 }, ap1TestObject.copyEvens(new int[] { 1, 8, 4 }, 1));
        assertArrayEquals(new int[] { 8, 4 }, ap1TestObject.copyEvens(new int[] { 1, 8, 4 }, 2));
        assertArrayEquals(new int[] { 2, 8 }, ap1TestObject.copyEvens(new int[] { 2, 8, 4 }, 2));
    }

    @Test
    public void copyEndy() {
        assertArrayEquals(new int[] { 9, 90 }, ap1TestObject.copyEndy(new int[] { 9, 11, 90, 22, 6 }, 2));
        assertArrayEquals(new int[] { 9, 90, 6 }, ap1TestObject.copyEndy(new int[] { 9, 11, 90, 22, 6 }, 3));
        assertArrayEquals(new int[] { 1, 1 }, ap1TestObject.copyEndy(new int[] { 12, 1, 1, 13, 0, 20 }, 2));
        assertArrayEquals(new int[] { 1, 1, 0 }, ap1TestObject.copyEndy(new int[] { 12, 1, 1, 13, 0, 20 }, 3));
        assertArrayEquals(new int[] { 0 }, ap1TestObject.copyEndy(new int[] { 0 }, 1));
        assertArrayEquals(new int[] { 10, 90 }, ap1TestObject.copyEndy(new int[] { 10, 11, 90 }, 2));
        assertArrayEquals(new int[] { 90, 100 }, ap1TestObject.copyEndy(new int[] { 90, 22, 100 }, 2));
        assertArrayEquals(new int[] { 10 }, ap1TestObject.copyEndy(new int[] { 12, 11, 10, 89, 101, 4 }, 1));
        assertArrayEquals(new int[] { 2, 2 }, ap1TestObject.copyEndy(new int[] { 13, 2, 2, 0 }, 2));
        assertArrayEquals(new int[] { 2, 2, 0 }, ap1TestObject.copyEndy(new int[] { 13, 2, 2, 0 }, 3));
        assertArrayEquals(new int[] { 2, 2 }, ap1TestObject.copyEndy(new int[] { 13, 2, 13, 2, 0, 30 }, 2));
        assertArrayEquals(new int[] { 2, 2, 0 }, ap1TestObject.copyEndy(new int[] { 13, 2, 13, 2, 0, 30 }, 3));
    }

    @Test
    public void matchUPTest() {
        assertEquals(1, ap1TestObject.matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "aaa", "xx", "bb" }));
        assertEquals(2, ap1TestObject.matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "aaa", "b", "bb" }));
        assertEquals(1, ap1TestObject.matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "", "", "ccc" }));
        assertEquals(1, ap1TestObject.matchUp(new String[] { "", "", "ccc" }, new String[] { "aa", "bb", "cc" }));
        assertEquals(0, ap1TestObject.matchUp(new String[] { "", "", "" }, new String[] { "", "bb", "cc" }));
        assertEquals(0, ap1TestObject.matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "", "", "" }));
        assertEquals(1, ap1TestObject.matchUp(new String[] { "aa", "", "ccc" }, new String[] { "", "bb", "cc" }));
        assertEquals(0, ap1TestObject.matchUp(new String[] { "x", "y", "z" }, new String[] { "y", "z", "x" }));
        assertEquals(1, ap1TestObject.matchUp(new String[] { "", "y", "z" }, new String[] { "", "y", "x" }));
        assertEquals(3, ap1TestObject.matchUp(new String[] { "x", "y", "z" }, new String[] { "xx", "yyy", "zzz" }));
        assertEquals(2, ap1TestObject.matchUp(new String[] { "x", "y", "z" }, new String[] { "xx", "yyy", "" }));
        assertEquals(3,
                ap1TestObject.matchUp(new String[] { "b", "x", "y", "z" }, new String[] { "a", "xx", "yyy", "zzz" }));
        assertEquals(1, ap1TestObject.matchUp(new String[] { "aaa", "bb", "c" }, new String[] { "aaa", "xx", "bb" }));
    }

    @Test
    public void scoreUpTest() {
        assertEquals(6,
                ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "a", "c", "b", "c" }));
        assertEquals(11,
                ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "a", "a", "b", "c" }));
        assertEquals(16,
                ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "a", "a", "b", "b" }));
        assertEquals(3,
                ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "?", "c", "b", "?" }));
        assertEquals(-1,
                ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "?", "c", "?", "?" }));
        assertEquals(7,
                ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "c", "?", "b", "b" }));
        assertEquals(3,
                ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "c", "?", "b", "?" }));
        assertEquals(2, ap1TestObject.scoreUp(new String[] { "a", "b", "c" }, new String[] { "a", "c", "b" }));
        assertEquals(4, ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b", "c", "c" },
                new String[] { "a", "c", "a", "c", "a", "c" }));
        assertEquals(6, ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b", "c", "c" },
                new String[] { "a", "c", "?", "?", "a", "c" }));
        assertEquals(11, ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b", "c", "c" },
                new String[] { "a", "c", "?", "?", "c", "c" }));
        assertEquals(12, ap1TestObject.scoreUp(new String[] { "a", "b", "c" }, new String[] { "a", "b", "c" }));
    }
}