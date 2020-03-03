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
}