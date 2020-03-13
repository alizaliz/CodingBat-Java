
package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

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
}