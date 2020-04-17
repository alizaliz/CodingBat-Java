package codingbat;

import org.junit.Test;

import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Before;

/**
 * Test cases for Arrays1 exercises
 */
public class Arrays2Test {

    private Arrays2 arrays2testObject;

    @Before
    public void setUp() {
        arrays2testObject = new Arrays2();
    }

    @Test
    public void countEvensTest() {
        assertEquals(3, arrays2testObject.countEvens(new int[] { 2, 1, 2, 3, 4 }));
        assertEquals(3, arrays2testObject.countEvens(new int[] { 2, 2, 0 }));
        assertEquals(0, arrays2testObject.countEvens(new int[] { 1, 3, 5 }));
        assertEquals(0, arrays2testObject.countEvens(new int[] {}));
        assertEquals(1, arrays2testObject.countEvens(new int[] { 11, 9, 0, 1 }));
        assertEquals(2, arrays2testObject.countEvens(new int[] { 2, 11, 9, 0 }));
        assertEquals(1, arrays2testObject.countEvens(new int[] { 2 }));
        assertEquals(2, arrays2testObject.countEvens(new int[] { 2, 5, 12 }));
    }

    @Test
    public void bigdiffTest() {
        assertEquals(7, arrays2testObject.bigDiff(new int[] { 10, 3, 5, 6 }));
        assertEquals(8, arrays2testObject.bigDiff(new int[] { 7, 2, 10, 9 }));
        assertEquals(8, arrays2testObject.bigDiff(new int[] { 2, 10, 7, 2 }));
        assertEquals(8, arrays2testObject.bigDiff(new int[] { 2, 10 }));
        assertEquals(8, arrays2testObject.bigDiff(new int[] { 10, 2 }));
        assertEquals(10, arrays2testObject.bigDiff(new int[] { 10, 0 }));
        assertEquals(1, arrays2testObject.bigDiff(new int[] { 2, 3 }));
        assertEquals(0, arrays2testObject.bigDiff(new int[] { 2, 2 }));
        assertEquals(0, arrays2testObject.bigDiff(new int[] { 2 }));
        assertEquals(8, arrays2testObject.bigDiff(new int[] { 5, 1, 6, 1, 9, 9 }));
        assertEquals(3, arrays2testObject.bigDiff(new int[] { 7, 6, 8, 5 }));
        assertEquals(3, arrays2testObject.bigDiff(new int[] { 7, 7, 6, 8, 5, 5, 6 }));
    }

    @Test
    public void centeredAverageTest() {
        assertEquals(3, arrays2testObject.centeredAverage(new int[] { 1, 2, 3, 4, 100 }));
        assertEquals(5, arrays2testObject.centeredAverage(new int[] { 1, 1, 5, 5, 10, 8, 7 }));
        assertEquals(-3, arrays2testObject.centeredAverage(new int[] { -10, -4, -2, -4, -2, 0 }));
        assertEquals(4, arrays2testObject.centeredAverage(new int[] { 5, 3, 4, 6, 2 }));
        assertEquals(4, arrays2testObject.centeredAverage(new int[] { 5, 3, 4, 0, 100 }));
        assertEquals(4, arrays2testObject.centeredAverage(new int[] { 100, 0, 5, 3, 4 }));
        assertEquals(4, arrays2testObject.centeredAverage(new int[] { 4, 0, 100 }));
        assertEquals(3, arrays2testObject.centeredAverage(new int[] { 0, 2, 3, 4, 100 }));
        assertEquals(1, arrays2testObject.centeredAverage(new int[] { 1, 1, 100 }));
        assertEquals(7, arrays2testObject.centeredAverage(new int[] { 7, 7, 7 }));
        assertEquals(7, arrays2testObject.centeredAverage(new int[] { 1, 7, 8 }));
        assertEquals(50, arrays2testObject.centeredAverage(new int[] { 1, 1, 99, 99 }));
        assertEquals(50, arrays2testObject.centeredAverage(new int[] { 1000, 0, 1, 99 }));
        assertEquals(4, arrays2testObject.centeredAverage(new int[] { 4, 4, 4, 4, 5 }));
        assertEquals(4, arrays2testObject.centeredAverage(new int[] { 4, 4, 4, 1, 5 }));
        assertEquals(6, arrays2testObject.centeredAverage(new int[] { 6, 4, 8, 12, 3 }));
    }

    @Test
    public void sum13Test() {
        assertEquals(6, arrays2testObject.sum13(new int[] { 1, 2, 2, 1 }));
        assertEquals(2, arrays2testObject.sum13(new int[] { 1, 1 }));
        assertEquals(6, arrays2testObject.sum13(new int[] { 1, 2, 2, 1, 13 }));
        assertEquals(4, arrays2testObject.sum13(new int[] { 1, 2, 13, 2, 1, 13 }));
        assertEquals(3, arrays2testObject.sum13(new int[] { 13, 1, 2, 13, 2, 1, 13 }));
        assertEquals(0, arrays2testObject.sum13(new int[] {}));
        assertEquals(0, arrays2testObject.sum13(new int[] { 13 }));
        assertEquals(0, arrays2testObject.sum13(new int[] { 13, 13 }));
        assertEquals(0, arrays2testObject.sum13(new int[] { 13, 0, 13 }));
        assertEquals(0, arrays2testObject.sum13(new int[] { 13, 1, 13 }));
        assertEquals(14, arrays2testObject.sum13(new int[] { 5, 7, 2 }));
        assertEquals(5, arrays2testObject.sum13(new int[] { 5, 13, 2 }));
        assertEquals(0, arrays2testObject.sum13(new int[] { 0 }));
        assertEquals(0, arrays2testObject.sum13(new int[] { 13, 0 }));
    }

    @Test
    public void sum67Test() {
        assertEquals(5, arrays2testObject.sum67(new int[] { 1, 2, 2 }));
        assertEquals(5, arrays2testObject.sum67(new int[] { 1, 2, 2, 6, 99, 99, 7 }));
        assertEquals(4, arrays2testObject.sum67(new int[] { 1, 1, 6, 7, 2 }));
        assertEquals(2, arrays2testObject.sum67(new int[] { 1, 6, 2, 2, 7, 1, 6, 99, 99, 7 }));
        assertEquals(2, arrays2testObject.sum67(new int[] { 1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7 }));
        assertEquals(18, arrays2testObject.sum67(new int[] { 2, 7, 6, 2, 6, 7, 2, 7 }));
        assertEquals(9, arrays2testObject.sum67(new int[] { 2, 7, 6, 2, 6, 2, 7 }));
        assertEquals(8, arrays2testObject.sum67(new int[] { 1, 6, 7, 7 }));
        assertEquals(8, arrays2testObject.sum67(new int[] { 6, 7, 1, 6, 7, 7 }));
        assertEquals(0, arrays2testObject.sum67(new int[] { 6, 8, 1, 6, 7 }));
        assertEquals(0, arrays2testObject.sum67(new int[] {}));
        assertEquals(11, arrays2testObject.sum67(new int[] { 6, 7, 11 }));
        assertEquals(22, arrays2testObject.sum67(new int[] { 11, 6, 7, 11 }));
        assertEquals(11, arrays2testObject.sum67(new int[] { 2, 2, 6, 7, 7 }));
    }

    @Test
    public void has22Test() {
        assertTrue(arrays2testObject.has22(new int[] { 1, 2, 2 }));
        assertFalse(arrays2testObject.has22(new int[] { 1, 2, 1, 2 }));
        assertFalse(arrays2testObject.has22(new int[] { 2, 1, 2 }));
        assertTrue(arrays2testObject.has22(new int[] { 2, 2, 1, 2 }));
        assertFalse(arrays2testObject.has22(new int[] { 1, 3, 2 }));
        assertTrue(arrays2testObject.has22(new int[] { 1, 3, 2, 2 }));
        assertTrue(arrays2testObject.has22(new int[] { 2, 3, 2, 2 }));
        assertTrue(arrays2testObject.has22(new int[] { 4, 2, 4, 2, 2, 5 }));
        assertFalse(arrays2testObject.has22(new int[] { 1, 2 }));
        assertTrue(arrays2testObject.has22(new int[] { 2, 2 }));
        assertFalse(arrays2testObject.has22(new int[] { 2 }));
        assertFalse(arrays2testObject.has22(new int[] {}));
        assertTrue(arrays2testObject.has22(new int[] { 3, 3, 2, 2 }));
        assertFalse(arrays2testObject.has22(new int[] { 5, 2, 5, 2 }));
    }

    @Test
    public void lucky13Test() {
        assertTrue(arrays2testObject.lucky13(new int[] { 0, 2, 4 }));
        assertFalse(arrays2testObject.lucky13(new int[] { 1, 2, 3 }));
        assertFalse(arrays2testObject.lucky13(new int[] { 1, 2, 4 }));
        assertTrue(arrays2testObject.lucky13(new int[] { 2, 7, 2, 8 }));
        assertFalse(arrays2testObject.lucky13(new int[] { 2, 7, 1, 8 }));
        assertFalse(arrays2testObject.lucky13(new int[] { 3, 7, 2, 8 }));
        assertFalse(arrays2testObject.lucky13(new int[] { 2, 7, 2, 1 }));
        assertFalse(arrays2testObject.lucky13(new int[] { 1, 2 }));
        assertTrue(arrays2testObject.lucky13(new int[] { 2, 2 }));
        assertTrue(arrays2testObject.lucky13(new int[] { 2 }));
        assertFalse(arrays2testObject.lucky13(new int[] { 3 }));
        assertTrue(arrays2testObject.lucky13(new int[] {}));
    }
}