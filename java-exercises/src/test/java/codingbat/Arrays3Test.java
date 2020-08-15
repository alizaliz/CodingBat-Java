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

    @Test
    public void fix34Test() {
        assertArrayEquals(new int[] { 1, 3, 4, 1 }, arrays3testObject.fix34(new int[] { 1, 3, 1, 4 }));
        assertArrayEquals(new int[] { 1, 3, 4, 1, 1, 3, 4 },
                arrays3testObject.fix34(new int[] { 1, 3, 1, 4, 4, 3, 1 }));
        assertArrayEquals(new int[] { 3, 4, 2, 2 }, arrays3testObject.fix34(new int[] { 3, 2, 2, 4 }));
        assertArrayEquals(new int[] { 3, 4, 3, 4, 2, 2 }, arrays3testObject.fix34(new int[] { 3, 2, 3, 2, 4, 4 }));
        assertArrayEquals(new int[] { 2, 3, 4, 3, 4, 2, 2 },
                arrays3testObject.fix34(new int[] { 2, 3, 2, 3, 2, 4, 4 }));
        assertArrayEquals(new int[] { 5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4 },
                arrays3testObject.fix34(new int[] { 5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5 }));
        assertArrayEquals(new int[] { 3, 4, 1 }, arrays3testObject.fix34(new int[] { 3, 1, 4 }));
        assertArrayEquals(new int[] { 3, 4, 1 }, arrays3testObject.fix34(new int[] { 3, 4, 1 }));
        assertArrayEquals(new int[] { 1, 1, 1 }, arrays3testObject.fix34(new int[] { 1, 1, 1 }));
        assertArrayEquals(new int[] { 1 }, arrays3testObject.fix34(new int[] { 1 }));
        assertArrayEquals(new int[] {}, arrays3testObject.fix34(new int[] {}));
        assertArrayEquals(new int[] { 7, 3, 4, 7, 7 }, arrays3testObject.fix34(new int[] { 7, 3, 7, 7, 4 }));
        assertArrayEquals(new int[] { 3, 4, 1, 3, 4, 1 }, arrays3testObject.fix34(new int[] { 3, 1, 4, 3, 1, 4 }));
        assertArrayEquals(new int[] { 3, 4, 1, 3, 4, 1 }, arrays3testObject.fix34(new int[] { 3, 1, 1, 3, 4, 4 }));
    }
}