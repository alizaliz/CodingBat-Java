package codingbat;

import org.junit.Test;

import static org.junit.Assert.*;


import org.junit.Before;

/**
 * Test cases for Arrays1 exercises
 */

public class Arrays3Test {

    private Arrays3 arrays3testObject;

    @Before
    public void setUp() {
        arrays3testObject = new Arrays3();
    }

    @Test
    public void maxSpanTest() {
        assertEquals(4, arrays3testObject.maxSpan(new int[] { 1, 2, 1, 1, 3 }));
        assertEquals(6, arrays3testObject.maxSpan(new int[] { 1, 4, 2, 1, 4, 1, 4 }));
        assertEquals(6, arrays3testObject.maxSpan(new int[] { 1, 4, 2, 1, 4, 4, 4 }));
        assertEquals(3, arrays3testObject.maxSpan(new int[] { 3, 3, 3 }));
        assertEquals(3, arrays3testObject.maxSpan(new int[] { 3, 9, 3 }));
        assertEquals(2, arrays3testObject.maxSpan(new int[] { 3, 9, 9 }));
        assertEquals(1, arrays3testObject.maxSpan(new int[] { 3, 9 }));
        assertEquals(2, arrays3testObject.maxSpan(new int[] { 3, 3 }));
        assertEquals(0, arrays3testObject.maxSpan(new int[] {}));
        assertEquals(1, arrays3testObject.maxSpan(new int[] { 1 }));
    }
}