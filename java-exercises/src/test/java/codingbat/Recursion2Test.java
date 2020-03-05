package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Test cases for Recursion2 exercises
 */
public class Recursion2Test {

    private Recursion2 recursion2TestObject;

    @Before
    public void setUp() {
        recursion2TestObject = new Recursion2();
    }

    @Test
    public void groupSumTest() {
        assertTrue(recursion2TestObject.groupSum(0, new int[] { 2, 4, 8 }, 10));
        assertTrue(recursion2TestObject.groupSum(0, new int[] { 2, 4, 8 }, 14));
        assertFalse(recursion2TestObject.groupSum(0, new int[] { 2, 4, 8 }, 9));
        assertTrue(recursion2TestObject.groupSum(0, new int[] { 2, 4, 8 }, 8));
        assertTrue(recursion2TestObject.groupSum(1, new int[] { 2, 4, 8 }, 8));
        assertFalse(recursion2TestObject.groupSum(1, new int[] { 2, 4, 8 }, 2));
        assertTrue(recursion2TestObject.groupSum(0, new int[] { 1 }, 1));
        assertFalse(recursion2TestObject.groupSum(0, new int[] { 9 }, 1));
        assertTrue(recursion2TestObject.groupSum(1, new int[] { 9 }, 0));
        assertTrue(recursion2TestObject.groupSum(0, new int[] {}, 0));
        assertTrue(recursion2TestObject.groupSum(0, new int[] { 10, 2, 2, 5 }, 17));
        assertTrue(recursion2TestObject.groupSum(0, new int[] { 10, 2, 2, 5 }, 15));
        assertTrue(recursion2TestObject.groupSum(0, new int[] { 10, 2, 2, 5 }, 9));
    }

    @Test
    public void groupSum6Test() {
        assertTrue(recursion2TestObject.groupSum6(0, new int[] { 5, 6, 2 }, 8));
        assertFalse(recursion2TestObject.groupSum6(0, new int[] { 5, 6, 2 }, 9));
        assertFalse(recursion2TestObject.groupSum6(0, new int[] { 5, 6, 2 }, 7));
        assertTrue(recursion2TestObject.groupSum6(0, new int[] { 1 }, 1));
        assertFalse(recursion2TestObject.groupSum6(0, new int[] { 9 }, 1));
        assertTrue(recursion2TestObject.groupSum6(0, new int[] {}, 0));
        assertTrue(recursion2TestObject.groupSum6(0, new int[] { 3, 2, 4, 6 }, 8));
        assertTrue(recursion2TestObject.groupSum6(0, new int[] { 6, 2, 4, 3 }, 8));
        assertFalse(recursion2TestObject.groupSum6(0, new int[] { 5, 2, 4, 6 }, 9));
        assertFalse(recursion2TestObject.groupSum6(0, new int[] { 6, 2, 4, 5 }, 9));
        assertFalse(recursion2TestObject.groupSum6(0, new int[] { 3, 2, 4, 6 }, 3));
        assertTrue(recursion2TestObject.groupSum6(0, new int[] { 1, 6, 2, 6, 4 }, 12));
        assertTrue(recursion2TestObject.groupSum6(0, new int[] { 1, 6, 2, 6, 4 }, 13));
        assertFalse(recursion2TestObject.groupSum6(0, new int[] { 1, 6, 2, 6, 4 }, 4));
        assertFalse(recursion2TestObject.groupSum6(0, new int[] { 1, 6, 2, 6, 4 }, 9));
        assertTrue(recursion2TestObject.groupSum6(0, new int[] { 1, 6, 2, 6, 5 }, 14));
        assertTrue(recursion2TestObject.groupSum6(0, new int[] { 1, 6, 2, 6, 5 }, 15));
        assertFalse(recursion2TestObject.groupSum6(0, new int[] { 1, 6, 2, 6, 5 }, 16));
    }

    @Test
    public void groupNoAdjTest() {
        assertTrue(recursion2TestObject.groupNoAdj(0, new int[] { 2, 5, 10, 4 }, 12));
        assertFalse(recursion2TestObject.groupNoAdj(0, new int[] { 2, 5, 10, 4 }, 14));
        assertFalse(recursion2TestObject.groupNoAdj(0, new int[] { 2, 5, 10, 4 }, 7));
        assertTrue(recursion2TestObject.groupNoAdj(0, new int[] { 2, 5, 10, 4, 2 }, 7));
        assertTrue(recursion2TestObject.groupNoAdj(0, new int[] { 2, 5, 10, 4 }, 9));
        assertTrue(recursion2TestObject.groupNoAdj(0, new int[] { 10, 2, 2, 3, 3 }, 15));
        assertFalse(recursion2TestObject.groupNoAdj(0, new int[] { 10, 2, 2, 3, 3 }, 7));
        assertTrue(recursion2TestObject.groupNoAdj(0, new int[] {}, 0));
        assertTrue(recursion2TestObject.groupNoAdj(0, new int[] { 1 }, 1));
        assertFalse(recursion2TestObject.groupNoAdj(0, new int[] { 9 }, 1));
        assertTrue(recursion2TestObject.groupNoAdj(0, new int[] { 9 }, 0));
        assertTrue(recursion2TestObject.groupNoAdj(0, new int[] { 5, 10, 4, 1 }, 11));
    }

    @Test
    public void groupSum5() {
        assertTrue(recursion2TestObject.groupSum5(0, new int[] { 2, 5, 10, 4 }, 19));
        assertTrue(recursion2TestObject.groupSum5(0, new int[] { 2, 5, 10, 4 }, 17));
        assertFalse(recursion2TestObject.groupSum5(0, new int[] { 2, 5, 10, 4 }, 12));
        assertFalse(recursion2TestObject.groupSum5(0, new int[] { 2, 5, 4, 10 }, 12));
        assertFalse(recursion2TestObject.groupSum5(0, new int[] { 3, 5, 1 }, 4));
        assertTrue(recursion2TestObject.groupSum5(0, new int[] { 3, 5, 1 }, 5));
        assertTrue(recursion2TestObject.groupSum5(0, new int[] { 1, 3, 5 }, 5));
        assertFalse(recursion2TestObject.groupSum5(0, new int[] { 3, 5, 1 }, 9));
        assertFalse(recursion2TestObject.groupSum5(0, new int[] { 2, 5, 10, 4 }, 7));
        assertTrue(recursion2TestObject.groupSum5(0, new int[] { 2, 5, 10, 4 }, 15));
        assertFalse(recursion2TestObject.groupSum5(0, new int[] { 2, 5, 10, 4 }, 11));
        assertTrue(recursion2TestObject.groupSum5(0, new int[] { 1 }, 1));
        assertFalse(recursion2TestObject.groupSum5(0, new int[] { 9 }, 1));
        assertTrue(recursion2TestObject.groupSum5(0, new int[] { 9 }, 0));
        assertTrue(recursion2TestObject.groupSum5(0, new int[] {}, 0));
    }
}