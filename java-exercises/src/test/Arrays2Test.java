package codingbat;

import org.junit.Test;

import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Before;

/**
 * Test cases for Arrays1 exercises
 */
public class Arrays2Test {

    private Arrays1 arrays2testObject;

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

}