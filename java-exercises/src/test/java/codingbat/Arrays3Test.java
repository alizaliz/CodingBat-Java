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

    @Test
    public void fix45Test() {
        assertArrayEquals(new int[] { 9, 4, 5, 4, 5, 9 }, arrays3testObject.fix45(new int[] { 5, 4, 9, 4, 9, 5 }));
        assertArrayEquals(new int[] { 1, 4, 5, 1 }, arrays3testObject.fix45(new int[] { 1, 4, 1, 5 }));
        assertArrayEquals(new int[] { 1, 4, 5, 1, 1, 4, 5 },
                arrays3testObject.fix45(new int[] { 1, 4, 1, 5, 5, 4, 1 }));
        assertArrayEquals(new int[] { 4, 5, 4, 5, 9, 9, 4, 5, 9 },
                arrays3testObject.fix45(new int[] { 4, 9, 4, 9, 5, 5, 4, 9, 5 }));
        assertArrayEquals(new int[] { 1, 1, 4, 5, 4, 5 }, arrays3testObject.fix45(new int[] { 5, 5, 4, 1, 4, 1 }));
        assertArrayEquals(new int[] { 4, 5, 2, 2 }, arrays3testObject.fix45(new int[] { 4, 2, 2, 5 }));
        assertArrayEquals(new int[] { 4, 5, 4, 5, 2, 2 }, arrays3testObject.fix45(new int[] { 4, 2, 4, 2, 5, 5 }));
        assertArrayEquals(new int[] { 4, 5, 4, 5, 2 }, arrays3testObject.fix45(new int[] { 4, 2, 4, 5, 5 }));
        assertArrayEquals(new int[] { 1, 1, 1 }, arrays3testObject.fix45(new int[] { 1, 1, 1 }));
        assertArrayEquals(new int[] { 4, 5 }, arrays3testObject.fix45(new int[] { 4, 5 }));
        assertArrayEquals(new int[] { 1, 4, 5 }, arrays3testObject.fix45(new int[] { 5, 4, 1 }));
        assertArrayEquals(new int[] {}, arrays3testObject.fix45(new int[] {}));
        assertArrayEquals(new int[] { 1, 4, 5, 4, 5 }, arrays3testObject.fix45(new int[] { 5, 4, 5, 4, 1 }));
        assertArrayEquals(new int[] { 4, 5, 4, 5, 1 }, arrays3testObject.fix45(new int[] { 4, 5, 4, 1, 5 }));
        assertArrayEquals(new int[] { 3, 4, 5 }, arrays3testObject.fix45(new int[] { 3, 4, 5 }));
        assertArrayEquals(new int[] { 4, 5, 1 }, arrays3testObject.fix45(new int[] { 4, 1, 5 }));
        assertArrayEquals(new int[] { 1, 4, 5 }, arrays3testObject.fix45(new int[] { 5, 4, 1 }));
        assertArrayEquals(new int[] { 2, 4, 5, 2 }, arrays3testObject.fix45(new int[] { 2, 4, 2, 5 }));
    }

    @Test
    public void canBalanceTest() {
        assertTrue(arrays3testObject.canBalance(new int[] { 1, 1, 1, 2, 1 }));
        assertFalse(arrays3testObject.canBalance(new int[] { 2, 1, 1, 2, 1 }));
        assertTrue(arrays3testObject.canBalance(new int[] { 10, 10 }));
        assertTrue(arrays3testObject.canBalance(new int[] { 10, 0, 1, -1, 10 }));
        assertTrue(arrays3testObject.canBalance(new int[] { 1, 1, 1, 1, 4 }));
        assertFalse(arrays3testObject.canBalance(new int[] { 2, 1, 1, 1, 4 }));
        assertFalse(arrays3testObject.canBalance(new int[] { 2, 3, 4, 1, 2 }));
        assertTrue(arrays3testObject.canBalance(new int[] { 1, 2, 3, 1, 0, 2, 3 }));
        assertFalse(arrays3testObject.canBalance(new int[] { 1, 2, 3, 1, 0, 1, 3 }));
        assertFalse(arrays3testObject.canBalance(new int[] { 1 }));
        assertTrue(arrays3testObject.canBalance(new int[] { 1, 1, 1, 2, 1 }));
    }

    @Test
    public void linearInTest() {
        assertTrue(arrays3testObject.linearIn(new int[] { 1, 2, 4, 6 }, new int[] { 2, 4 }));
        assertFalse(arrays3testObject.linearIn(new int[] { 1, 2, 4, 6 }, new int[] { 2, 3, 4 }));
        assertTrue(arrays3testObject.linearIn(new int[] { 1, 2, 4, 4, 6 }, new int[] { 2, 4 }));
        assertTrue(arrays3testObject.linearIn(new int[] { 2, 2, 4, 4, 6, 6 }, new int[] { 2, 4 }));
        assertTrue(arrays3testObject.linearIn(new int[] { 2, 2, 2, 2, 2 }, new int[] { 2, 2 }));
        assertFalse(arrays3testObject.linearIn(new int[] { 2, 2, 2, 2, 2 }, new int[] { 2, 4 }));
        assertTrue(arrays3testObject.linearIn(new int[] { 2, 2, 2, 2, 4 }, new int[] { 2, 4 }));
        assertTrue(arrays3testObject.linearIn(new int[] { 1, 2, 3 }, new int[] { 2 }));
        assertFalse(arrays3testObject.linearIn(new int[] { 1, 2, 3 }, new int[] { -1 }));
        assertTrue(arrays3testObject.linearIn(new int[] { 1, 2, 3 }, new int[] {}));
        assertTrue(arrays3testObject.linearIn(new int[] { -1, 0, 3, 3, 3, 10, 12 }, new int[] { -1, 0, 3, 12 }));
        assertFalse(arrays3testObject.linearIn(new int[] { -1, 0, 3, 3, 3, 10, 12 }, new int[] { 0, 3, 12, 14 }));
        assertFalse(arrays3testObject.linearIn(new int[] { -1, 0, 3, 3, 3, 10, 12 }, new int[] { -1, 10, 11 }));
    }

    @Test
    public void squareUpTest() {
        assertArrayEquals(new int[] { 0, 0, 1, 0, 2, 1, 3, 2, 1 }, arrays3testObject.squareUp(3));
        assertArrayEquals(new int[] { 0, 1, 2, 1 }, arrays3testObject.squareUp(2));
        assertArrayEquals(new int[] { 0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1 }, arrays3testObject.squareUp(4));
        assertArrayEquals(new int[] { 1 }, arrays3testObject.squareUp(1));
        assertArrayEquals(new int[] {}, arrays3testObject.squareUp(0));
        assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 3, 2, 1, 0, 0, 4, 3, 2, 1, 0, 5, 4,
                3, 2, 1, 6, 5, 4, 3, 2, 1 }, arrays3testObject.squareUp(6));
    }

    @Test
    public void seriesUPTest() {
        assertArrayEquals(new int[] { 1, 1, 2, 1, 2, 3 }, arrays3testObject.seriesUp(3));
        assertArrayEquals(new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4 }, arrays3testObject.seriesUp(4));
        assertArrayEquals(new int[] { 1, 1, 2 }, arrays3testObject.seriesUp(2));
        assertArrayEquals(new int[] { 1 }, arrays3testObject.seriesUp(1));
        assertArrayEquals(new int[] {}, arrays3testObject.seriesUp(0));
        assertArrayEquals(new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6 },
                arrays3testObject.seriesUp(6));
    }

    @Test
    public void maxMirrorTest() {
        assertEquals(3, arrays3testObject.maxMirror(new int[] { 1, 2, 3, 8, 9, 3, 2, 1 }));
        assertEquals(3, arrays3testObject.maxMirror(new int[] { 1, 2, 1, 4 }));
        assertEquals(2, arrays3testObject.maxMirror(new int[] { 7, 1, 2, 9, 7, 2, 1 }));
        assertEquals(4, arrays3testObject.maxMirror(new int[] { 21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9 }));
        assertEquals(4, arrays3testObject.maxMirror(new int[] { 1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25 }));
        assertEquals(5, arrays3testObject.maxMirror(new int[] { 1, 2, 3, 2, 1 }));
        assertEquals(2, arrays3testObject.maxMirror(new int[] { 1, 2, 3, 3, 8 }));
        assertEquals(2, arrays3testObject.maxMirror(new int[] { 1, 2, 7, 8, 1, 7, 2 }));
        assertEquals(3, arrays3testObject.maxMirror(new int[] { 1, 1, 1 }));
        assertEquals(1, arrays3testObject.maxMirror(new int[] { 1 }));
        assertEquals(0, arrays3testObject.maxMirror(new int[] {}));
        assertEquals(3, arrays3testObject.maxMirror(new int[] { 9, 1, 1, 4, 2, 1, 1, 1 }));
        assertEquals(7, arrays3testObject.maxMirror(new int[] { 5, 9, 9, 4, 5, 4, 9, 9, 2 }));
        assertEquals(2, arrays3testObject.maxMirror(new int[] { 5, 9, 9, 6, 5, 4, 9, 9, 2 }));
        assertEquals(3, arrays3testObject.maxMirror(new int[] { 5, 9, 1, 6, 5, 4, 1, 9, 5 }));
    }

    @Test
    public void countClumpsTest() {
        assertEquals(2, arrays3testObject.countClumps(new int[] { 1, 2, 2, 3, 4, 4 }));
        assertEquals(2, arrays3testObject.countClumps(new int[] { 1, 1, 2, 1, 1 }));
        assertEquals(1, arrays3testObject.countClumps(new int[] { 1, 1, 1, 1, 1 }));
        assertEquals(0, arrays3testObject.countClumps(new int[] { 1, 2, 3 }));
        assertEquals(4, arrays3testObject.countClumps(new int[] { 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 }));
        assertEquals(4, arrays3testObject.countClumps(new int[] { 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 }));
        assertEquals(5, arrays3testObject.countClumps(new int[] { 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 }));
        assertEquals(5, arrays3testObject.countClumps(new int[] { 0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 }));
        assertEquals(0, arrays3testObject.countClumps(new int[] {}));
    }
}