package codingbat;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Test cases for Arrays2 exercises
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

    @Test
    public void sum28Test() {
        assertTrue(arrays2testObject.sum28(new int[] { 2, 3, 2, 2, 4, 2 }));
        assertFalse(arrays2testObject.sum28(new int[] { 2, 3, 2, 2, 4, 2, 2 }));
        assertFalse(arrays2testObject.sum28(new int[] { 1, 2, 3, 4 }));
        assertTrue(arrays2testObject.sum28(new int[] { 2, 2, 2, 2 }));
        assertTrue(arrays2testObject.sum28(new int[] { 1, 2, 2, 2, 2, 4 }));
        assertFalse(arrays2testObject.sum28(new int[] {}));
        assertFalse(arrays2testObject.sum28(new int[] { 2 }));
        assertFalse(arrays2testObject.sum28(new int[] { 8 }));
        assertFalse(arrays2testObject.sum28(new int[] { 2, 2, 2 }));
        assertFalse(arrays2testObject.sum28(new int[] { 2, 2, 2, 2, 2 }));
        assertTrue(arrays2testObject.sum28(new int[] { 1, 2, 2, 1, 2, 2 }));
        assertTrue(arrays2testObject.sum28(new int[] { 5, 2, 2, 2, 4, 2 }));
    }

    @Test
    public void more14Test() {
        assertTrue(arrays2testObject.more14(new int[] { 1, 4, 1 }));
        assertFalse(arrays2testObject.more14(new int[] { 1, 4, 1, 4 }));
        assertTrue(arrays2testObject.more14(new int[] { 1, 1 }));
        assertTrue(arrays2testObject.more14(new int[] { 1, 6, 6 }));
        assertTrue(arrays2testObject.more14(new int[] { 1 }));
        assertFalse(arrays2testObject.more14(new int[] { 1, 4 }));
        assertTrue(arrays2testObject.more14(new int[] { 6, 1, 1 }));
        assertFalse(arrays2testObject.more14(new int[] { 1, 6, 4 }));
        assertTrue(arrays2testObject.more14(new int[] { 1, 1, 4, 4, 1 }));
        assertTrue(arrays2testObject.more14(new int[] { 1, 1, 6, 4, 4, 1 }));
        assertFalse(arrays2testObject.more14(new int[] {}));
        assertFalse(arrays2testObject.more14(new int[] { 4, 1, 4, 6 }));
        assertFalse(arrays2testObject.more14(new int[] { 4, 1, 4, 6, 1 }));
        assertTrue(arrays2testObject.more14(new int[] { 1, 4, 1, 4, 1, 6 }));
    }

    @Test
    public void fizzArrayTest() {
        assertArrayEquals(new int[] { 0, 1, 2, 3 }, arrays2testObject.fizzArray(4));
        assertArrayEquals(new int[] { 0 }, arrays2testObject.fizzArray(1));
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, arrays2testObject.fizzArray(10));
        assertArrayEquals(new int[] {}, arrays2testObject.fizzArray(0));
        assertArrayEquals(new int[] { 0, 1 }, arrays2testObject.fizzArray(2));
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, arrays2testObject.fizzArray(7));
    }

    @Test
    public void only14Test() {
        assertTrue(arrays2testObject.only14(new int[] { 1, 4, 1, 4 }));
        assertFalse(arrays2testObject.only14(new int[] { 1, 4, 2, 4 }));
        assertTrue(arrays2testObject.only14(new int[] { 1, 1 }));
        assertTrue(arrays2testObject.only14(new int[] { 4, 1 }));
        assertFalse(arrays2testObject.only14(new int[] { 2 }));
        assertTrue(arrays2testObject.only14(new int[] {}));
        assertFalse(arrays2testObject.only14(new int[] { 1, 4, 1, 3 }));
        assertFalse(arrays2testObject.only14(new int[] { 3, 1, 3 }));
        assertTrue(arrays2testObject.only14(new int[] { 1 }));
        assertTrue(arrays2testObject.only14(new int[] { 4 }));
        assertFalse(arrays2testObject.only14(new int[] { 3, 4 }));
        assertFalse(arrays2testObject.only14(new int[] { 1, 3, 4 }));
        assertTrue(arrays2testObject.only14(new int[] { 1, 1, 1 }));
        assertFalse(arrays2testObject.only14(new int[] { 1, 1, 1, 5 }));
        assertTrue(arrays2testObject.only14(new int[] { 4, 1, 4, 1 }));
    }

    @Test
    public void fizzArray2() {
        assertArrayEquals(new String[] { "0", "1", "2", "3" }, arrays2testObject.fizzArray2(4));
        assertArrayEquals(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" },
                arrays2testObject.fizzArray2(10));
        assertArrayEquals(new String[] { "0", "1" }, arrays2testObject.fizzArray2(2));
        assertArrayEquals(new String[] { "0" }, arrays2testObject.fizzArray2(1));
        assertArrayEquals(new String[] {}, arrays2testObject.fizzArray2(0));
        assertArrayEquals(new String[] { "0", "1", "2", "3", "4", "5", "6" }, arrays2testObject.fizzArray2(7));
        assertArrayEquals(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" },
                arrays2testObject.fizzArray2(9));
        assertArrayEquals(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" },
                arrays2testObject.fizzArray2(11));
    }

    @Test
    public void no14Test() {
        assertTrue(arrays2testObject.no14(new int[] { 1, 2, 3 }));
        assertFalse(arrays2testObject.no14(new int[] { 1, 2, 3, 4 }));
        assertTrue(arrays2testObject.no14(new int[] { 2, 3, 4 }));
        assertFalse(arrays2testObject.no14(new int[] { 1, 1, 4, 4 }));
        assertTrue(arrays2testObject.no14(new int[] { 2, 2, 4, 4 }));
        assertFalse(arrays2testObject.no14(new int[] { 2, 3, 4, 1 }));
        assertTrue(arrays2testObject.no14(new int[] { 2, 1, 1 }));
        assertFalse(arrays2testObject.no14(new int[] { 1, 4 }));
        assertTrue(arrays2testObject.no14(new int[] { 2 }));
        assertTrue(arrays2testObject.no14(new int[] { 2, 1 }));
        assertTrue(arrays2testObject.no14(new int[] { 1 }));
        assertTrue(arrays2testObject.no14(new int[] { 4 }));
        assertTrue(arrays2testObject.no14(new int[] {}));
        assertTrue(arrays2testObject.no14(new int[] { 1, 1, 1, 1 }));
        assertFalse(arrays2testObject.no14(new int[] { 9, 4, 4, 1 }));
        assertFalse(arrays2testObject.no14(new int[] { 4, 2, 3, 1 }));
        assertTrue(arrays2testObject.no14(new int[] { 4, 2, 3, 5 }));
        assertTrue(arrays2testObject.no14(new int[] { 4, 4, 2 }));
        assertFalse(arrays2testObject.no14(new int[] { 1, 4, 4 }));
    }

    @Test
    public void iSEverywhereTest() {
        assertTrue(arrays2testObject.isEverywhere(new int[] { 1, 2, 1, 3 }, 1));
        assertFalse(arrays2testObject.isEverywhere(new int[] { 1, 2, 1, 3 }, 2));
        assertFalse(arrays2testObject.isEverywhere(new int[] { 1, 2, 1, 3, 4 }, 1));
        assertTrue(arrays2testObject.isEverywhere(new int[] { 2, 1, 2, 1 }, 1));
        assertTrue(arrays2testObject.isEverywhere(new int[] { 2, 1, 2, 1 }, 2));
        assertFalse(arrays2testObject.isEverywhere(new int[] { 2, 1, 2, 3, 1 }, 2));
        assertTrue(arrays2testObject.isEverywhere(new int[] { 3, 1 }, 3));
        assertFalse(arrays2testObject.isEverywhere(new int[] { 3, 1 }, 2));
        assertTrue(arrays2testObject.isEverywhere(new int[] { 3 }, 1));
        assertTrue(arrays2testObject.isEverywhere(new int[] {}, 1));
        assertTrue(arrays2testObject.isEverywhere(new int[] { 1, 2, 1, 2, 3, 2, 5 }, 2));
        assertFalse(arrays2testObject.isEverywhere(new int[] { 1, 2, 1, 1, 1, 2 }, 2));
        assertFalse(arrays2testObject.isEverywhere(new int[] { 2, 1, 2, 1, 1, 2 }, 2));
        assertFalse(arrays2testObject.isEverywhere(new int[] { 2, 1, 2, 2, 2, 1, 1, 2 }, 2));
        assertTrue(arrays2testObject.isEverywhere(new int[] { 2, 1, 2, 2, 2, 1, 2, 1 }, 2));
        assertTrue(arrays2testObject.isEverywhere(new int[] { 2, 1, 2, 1, 2 }, 2));
    }

    @Test
    public void either24Test() {
        assertTrue(arrays2testObject.either24(new int[] { 1, 2, 2 }));
        assertTrue(arrays2testObject.either24(new int[] { 4, 4, 1 }));
        assertFalse(arrays2testObject.either24(new int[] { 4, 4, 1, 2, 2 }));
        assertFalse(arrays2testObject.either24(new int[] { 1, 2, 3, 4 }));
        assertFalse(arrays2testObject.either24(new int[] { 3, 5, 9 }));
        assertTrue(arrays2testObject.either24(new int[] { 1, 2, 3, 4, 4 }));
        assertTrue(arrays2testObject.either24(new int[] { 2, 2, 3, 4 }));
        assertTrue(arrays2testObject.either24(new int[] { 1, 2, 3, 2, 2, 4 }));
        assertFalse(arrays2testObject.either24(new int[] { 1, 2, 3, 2, 2, 4, 4 }));
        assertFalse(arrays2testObject.either24(new int[] { 1, 2 }));
        assertTrue(arrays2testObject.either24(new int[] { 2, 2 }));
        assertTrue(arrays2testObject.either24(new int[] { 4, 4 }));
        assertFalse(arrays2testObject.either24(new int[] { 2 }));
        assertFalse(arrays2testObject.either24(new int[] {}));
    }

    @Test
    public void matchUpTest() {
        assertEquals(2, arrays2testObject.matchUp(new int[] { 1, 2, 3 }, new int[] { 2, 3, 10 }));
        assertEquals(3, arrays2testObject.matchUp(new int[] { 1, 2, 3 }, new int[] { 2, 3, 5 }));
        assertEquals(2, arrays2testObject.matchUp(new int[] { 1, 2, 3 }, new int[] { 2, 3, 3 }));
        assertEquals(1, arrays2testObject.matchUp(new int[] { 5, 3 }, new int[] { 5, 5 }));
        assertEquals(2, arrays2testObject.matchUp(new int[] { 5, 3 }, new int[] { 4, 4 }));
        assertEquals(1, arrays2testObject.matchUp(new int[] { 5, 3 }, new int[] { 3, 3 }));
        assertEquals(1, arrays2testObject.matchUp(new int[] { 5, 3 }, new int[] { 2, 2 }));
        assertEquals(1, arrays2testObject.matchUp(new int[] { 5, 3 }, new int[] { 1, 1 }));
        assertEquals(0, arrays2testObject.matchUp(new int[] { 5, 3 }, new int[] { 0, 0 }));
        assertEquals(0, arrays2testObject.matchUp(new int[] { 4 }, new int[] { 4 }));
        assertEquals(1, arrays2testObject.matchUp(new int[] { 4 }, new int[] { 5 }));
    }

    @Test
    public void has77Test() {
        assertTrue(arrays2testObject.has77(new int[] { 1, 7, 7 }));
        assertTrue(arrays2testObject.has77(new int[] { 1, 7, 1, 7 }));
        assertFalse(arrays2testObject.has77(new int[] { 1, 7, 1, 1, 7 }));
        assertTrue(arrays2testObject.has77(new int[] { 7, 7, 1, 1, 7 }));
        assertFalse(arrays2testObject.has77(new int[] { 2, 7, 2, 2, 7, 2 }));
        assertTrue(arrays2testObject.has77(new int[] { 2, 7, 2, 2, 7, 7 }));
        assertTrue(arrays2testObject.has77(new int[] { 7, 2, 7, 2, 2, 7 }));
        assertFalse(arrays2testObject.has77(new int[] { 7, 2, 6, 2, 2, 7 }));
        assertTrue(arrays2testObject.has77(new int[] { 7, 7, 7 }));
        assertTrue(arrays2testObject.has77(new int[] { 7, 1, 7 }));
        assertFalse(arrays2testObject.has77(new int[] { 7, 1, 1 }));
        assertFalse(arrays2testObject.has77(new int[] { 1, 2 }));
        assertFalse(arrays2testObject.has77(new int[] { 1, 7 }));
        assertFalse(arrays2testObject.has77(new int[] { 7 }));
    }

    @Test
    public void has12Test() {
        assertTrue(arrays2testObject.has12(new int[] { 1, 3, 2 }));
        assertTrue(arrays2testObject.has12(new int[] { 3, 1, 2 }));
        assertTrue(arrays2testObject.has12(new int[] { 3, 1, 4, 5, 2 }));
        assertFalse(arrays2testObject.has12(new int[] { 3, 1, 4, 5, 6 }));
        assertTrue(arrays2testObject.has12(new int[] { 3, 1, 4, 1, 6, 2 }));
        assertTrue(arrays2testObject.has12(new int[] { 2, 1, 4, 1, 6, 2 }));
        assertFalse(arrays2testObject.has12(new int[] { 2, 1, 4, 1, 6 }));
        assertFalse(arrays2testObject.has12(new int[] { 1 }));
        assertFalse(arrays2testObject.has12(new int[] { 2, 1, 3 }));
        assertTrue(arrays2testObject.has12(new int[] { 2, 1, 3, 2 }));
        assertFalse(arrays2testObject.has12(new int[] { 2 }));
        assertFalse(arrays2testObject.has12(new int[] { 3, 2 }));
        assertTrue(arrays2testObject.has12(new int[] { 3, 1, 3, 2 }));
        assertFalse(arrays2testObject.has12(new int[] { 3, 5, 9 }));
        assertFalse(arrays2testObject.has12(new int[] { 3, 5, 1 }));
        assertFalse(arrays2testObject.has12(new int[] { 3, 2, 1 }));
        assertTrue(arrays2testObject.has12(new int[] { 1, 2 }));
    }

    @Test
    public void modThreeTest() {
        assertTrue(arrays2testObject.modThree(new int[] { 2, 1, 3, 5 }));
        assertFalse(arrays2testObject.modThree(new int[] { 2, 1, 2, 5 }));
        assertTrue(arrays2testObject.modThree(new int[] { 2, 4, 2, 5 }));
        assertFalse(arrays2testObject.modThree(new int[] { 1, 2, 1, 2, 1 }));
        assertTrue(arrays2testObject.modThree(new int[] { 9, 9, 9 }));
        assertFalse(arrays2testObject.modThree(new int[] { 1, 2, 1 }));
        assertFalse(arrays2testObject.modThree(new int[] { 1, 2 }));
        assertFalse(arrays2testObject.modThree(new int[] { 1 }));
        assertFalse(arrays2testObject.modThree(new int[] {}));
        assertFalse(arrays2testObject.modThree(new int[] { 9, 7, 2, 9 }));
        assertFalse(arrays2testObject.modThree(new int[] { 9, 7, 2, 9, 2, 2 }));
        assertTrue(arrays2testObject.modThree(new int[] { 9, 7, 2, 9, 2, 2, 6 }));
    }

    @Test
    public void haveThreeTest() {
        assertTrue(arrays2testObject.haveThree(new int[] { 3, 1, 3, 1, 3 }));
        assertFalse(arrays2testObject.haveThree(new int[] { 3, 1, 3, 3 }));
        assertFalse(arrays2testObject.haveThree(new int[] { 3, 4, 3, 3, 4 }));
        assertFalse(arrays2testObject.haveThree(new int[] { 1, 3, 1, 3, 1, 2 }));
        assertTrue(arrays2testObject.haveThree(new int[] { 1, 3, 1, 3, 1, 3 }));
        assertFalse(arrays2testObject.haveThree(new int[] { 1, 3, 3, 1, 3 }));
        assertFalse(arrays2testObject.haveThree(new int[] { 1, 3, 1, 3, 1, 3, 4, 3 }));
        assertTrue(arrays2testObject.haveThree(new int[] { 3, 4, 3, 4, 3, 4, 4 }));
        assertFalse(arrays2testObject.haveThree(new int[] { 3, 3, 3 }));
        assertFalse(arrays2testObject.haveThree(new int[] { 1, 3 }));
        assertFalse(arrays2testObject.haveThree(new int[] { 3 }));
        assertFalse(arrays2testObject.haveThree(new int[] { 1 }));
    }

    @Test
    public void twoTwoTest() {
        assertTrue(arrays2testObject.twoTwo(new int[] { 4, 2, 2, 3 }));
        assertTrue(arrays2testObject.twoTwo(new int[] { 2, 2, 4 }));
        assertFalse(arrays2testObject.twoTwo(new int[] { 2, 2, 4, 2 }));
        assertTrue(arrays2testObject.twoTwo(new int[] { 1, 3, 4 }));
        assertTrue(arrays2testObject.twoTwo(new int[] { 1, 2, 2, 3, 4 }));
        assertFalse(arrays2testObject.twoTwo(new int[] { 1, 2, 3, 4 }));
        assertTrue(arrays2testObject.twoTwo(new int[] { 2, 2 }));
        assertTrue(arrays2testObject.twoTwo(new int[] { 2, 2, 7 }));
        assertFalse(arrays2testObject.twoTwo(new int[] { 2, 2, 7, 2, 1 }));
        assertTrue(arrays2testObject.twoTwo(new int[] { 4, 2, 2, 2 }));
        assertTrue(arrays2testObject.twoTwo(new int[] { 2, 2, 2 }));
        assertFalse(arrays2testObject.twoTwo(new int[] { 1, 2 }));
        assertFalse(arrays2testObject.twoTwo(new int[] { 2 }));
        assertTrue(arrays2testObject.twoTwo(new int[] { 1 }));
        assertTrue(arrays2testObject.twoTwo(new int[] {}));
        assertTrue(arrays2testObject.twoTwo(new int[] { 5, 2, 2, 3 }));
        assertFalse(arrays2testObject.twoTwo(new int[] { 2, 2, 5, 2 }));
    }

    @Test
    public void sameEndsTest() {
        assertFalse(arrays2testObject.sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 1));
        assertTrue(arrays2testObject.sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 2));
        assertFalse(arrays2testObject.sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 3));
        assertTrue(arrays2testObject.sameEnds(new int[] { 1, 2, 5, 2, 1 }, 1));
        assertFalse(arrays2testObject.sameEnds(new int[] { 1, 2, 5, 2, 1 }, 2));
        assertTrue(arrays2testObject.sameEnds(new int[] { 1, 2, 5, 2, 1 }, 0));
        assertTrue(arrays2testObject.sameEnds(new int[] { 1, 2, 5, 2, 1 }, 5));
        assertTrue(arrays2testObject.sameEnds(new int[] { 1, 1, 1 }, 0));
        assertTrue(arrays2testObject.sameEnds(new int[] { 1, 1, 1 }, 1));
        assertTrue(arrays2testObject.sameEnds(new int[] { 1, 1, 1 }, 2));
        assertTrue(arrays2testObject.sameEnds(new int[] { 1, 1, 1 }, 3));
        assertTrue(arrays2testObject.sameEnds(new int[] { 1 }, 1));
        assertTrue(arrays2testObject.sameEnds(new int[] {}, 0));
        assertFalse(arrays2testObject.sameEnds(new int[] { 4, 2, 4, 5 }, 1));
    }

    @Test
    public void tripleUpTest() {
        assertTrue(arrays2testObject.tripleUp(new int[] { 1, 4, 5, 6, 2 }));
        assertTrue(arrays2testObject.tripleUp(new int[] { 1, 2, 3 }));
        assertFalse(arrays2testObject.tripleUp(new int[] { 1, 2, 4 }));
        assertTrue(arrays2testObject.tripleUp(new int[] { 1, 2, 4, 5, 7, 6, 5, 6, 7, 6 }));
        assertFalse(arrays2testObject.tripleUp(new int[] { 1, 2, 4, 5, 7, 6, 5, 7, 7, 6 }));
        assertFalse(arrays2testObject.tripleUp(new int[] { 1, 2 }));
        assertFalse(arrays2testObject.tripleUp(new int[] { 1 }));
        assertFalse(arrays2testObject.tripleUp(new int[] {}));
        assertTrue(arrays2testObject.tripleUp(new int[] { 10, 9, 8, -100, -99, -98, 100 }));
        assertFalse(arrays2testObject.tripleUp(new int[] { 10, 9, 8, -100, -99, 99, 100 }));
        assertTrue(arrays2testObject.tripleUp(new int[] { -100, -99, -99, 100, 101, 102 }));
        assertFalse(arrays2testObject.tripleUp(new int[] { 2, 3, 5, 6, 8, 9, 2, 3 }));
    }

    @Test
    public void fizzArray3Test() {
        assertArrayEquals(new int[] { 5, 6, 7, 8, 9 }, arrays2testObject.fizzArray3(5, 10));
        assertArrayEquals(new int[] { 11, 12, 13, 14, 15, 16, 17 }, arrays2testObject.fizzArray3(11, 18));
        assertArrayEquals(new int[] { 1, 2 }, arrays2testObject.fizzArray3(1, 3));
        assertArrayEquals(new int[] { 1 }, arrays2testObject.fizzArray3(1, 2));
        assertArrayEquals(new int[] {}, arrays2testObject.fizzArray3(1, 1));
        assertArrayEquals(new int[] { 1000, 1001, 1002, 1003, 1004 }, arrays2testObject.fizzArray3(1000, 1005));
    }

    @Test
    public void shiftLeftTest() {
        assertArrayEquals(new int[] { 2, 5, 3, 6 }, arrays2testObject.shiftLeft(new int[] { 6, 2, 5, 3 }));
        assertArrayEquals(new int[] { 2, 1 }, arrays2testObject.shiftLeft(new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 1 }, arrays2testObject.shiftLeft(new int[] { 1 }));
        assertArrayEquals(new int[] {}, arrays2testObject.shiftLeft(new int[] {}));
        assertArrayEquals(new int[] { 1, 2, 2, 4, 1 }, arrays2testObject.shiftLeft(new int[] { 1, 1, 2, 2, 4 }));
        assertArrayEquals(new int[] { 1, 1, 1 }, arrays2testObject.shiftLeft(new int[] { 1, 1, 1 }));
        assertArrayEquals(new int[] { 2, 3, 1 }, arrays2testObject.shiftLeft(new int[] { 1, 2, 3 }));
    }

    @Test
    public void tenRunTest() {
        assertArrayEquals(new int[] { 2, 10, 10, 10, 20, 20 },
                arrays2testObject.tenRun(new int[] { 2, 10, 3, 4, 20, 5 }));
        assertArrayEquals(new int[] { 10, 10, 20, 20 }, arrays2testObject.tenRun(new int[] { 10, 1, 20, 2 }));
        assertArrayEquals(new int[] { 10, 10, 10, 20 }, arrays2testObject.tenRun(new int[] { 10, 1, 9, 20 }));
        assertArrayEquals(new int[] { 1, 2, 50, 50 }, arrays2testObject.tenRun(new int[] { 1, 2, 50, 1 }));
        assertArrayEquals(new int[] { 1, 20, 50, 50 }, arrays2testObject.tenRun(new int[] { 1, 20, 50, 1 }));
        assertArrayEquals(new int[] { 10, 10 }, arrays2testObject.tenRun(new int[] { 10, 10 }));
        assertArrayEquals(new int[] { 10, 10 }, arrays2testObject.tenRun(new int[] { 10, 2 }));
        assertArrayEquals(new int[] { 0, 0 }, arrays2testObject.tenRun(new int[] { 0, 2 }));
        assertArrayEquals(new int[] { 1, 2 }, arrays2testObject.tenRun(new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 1 }, arrays2testObject.tenRun(new int[] { 1 }));
        assertArrayEquals(new int[] {}, arrays2testObject.tenRun(new int[] {}));
    }

    @Test
    public void pre4Test() {
        assertArrayEquals(new int[] { 1, 2 }, arrays2testObject.pre4(new int[] { 1, 2, 4, 1 }));
        assertArrayEquals(new int[] { 3, 1 }, arrays2testObject.pre4(new int[] { 3, 1, 4 }));
        assertArrayEquals(new int[] { 1 }, arrays2testObject.pre4(new int[] { 1, 4, 4 }));
        assertArrayEquals(new int[] { 1 }, arrays2testObject.pre4(new int[] { 1, 4, 4, 2 }));
        assertArrayEquals(new int[] { 1, 3 }, arrays2testObject.pre4(new int[] { 1, 3, 4, 2, 4 }));
        assertArrayEquals(new int[] {}, arrays2testObject.pre4(new int[] { 4, 4 }));
        assertArrayEquals(new int[] { 3, 3 }, arrays2testObject.pre4(new int[] { 3, 3, 4 }));
        assertArrayEquals(new int[] { 1, 2, 1 }, arrays2testObject.pre4(new int[] { 1, 2, 1, 4 }));
        assertArrayEquals(new int[] { 2, 1 }, arrays2testObject.pre4(new int[] { 2, 1, 4, 2 }));
        assertArrayEquals(new int[] { 2, 1, 2, 1 }, arrays2testObject.pre4(new int[] { 2, 1, 2, 1, 4, 2 }));
    }

    @Test
    public void post4Test() {
        assertArrayEquals(new int[] { 1, 2 }, arrays2testObject.post4(new int[] { 2, 4, 1, 2 }));
        assertArrayEquals(new int[] { 2 }, arrays2testObject.post4(new int[] { 4, 1, 4, 2 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, arrays2testObject.post4(new int[] { 4, 4, 1, 2, 3 }));
        assertArrayEquals(new int[] { 2 }, arrays2testObject.post4(new int[] { 4, 2 }));
        assertArrayEquals(new int[] { 3 }, arrays2testObject.post4(new int[] { 4, 4, 3 }));
        assertArrayEquals(new int[] {}, arrays2testObject.post4(new int[] { 4, 4 }));
        assertArrayEquals(new int[] {}, arrays2testObject.post4(new int[] { 4 }));
        assertArrayEquals(new int[] { 3, 2 }, arrays2testObject.post4(new int[] { 2, 4, 1, 4, 3, 2 }));
        assertArrayEquals(new int[] { 2, 2, 2 }, arrays2testObject.post4(new int[] { 4, 1, 4, 2, 2, 2 }));
        assertArrayEquals(new int[] { 3, 2 }, arrays2testObject.post4(new int[] { 3, 4, 3, 2 }));
    }

    @Test
    public void notAloneTest() {
        assertArrayEquals(new int[] { 1, 3, 3 }, arrays2testObject.notAlone(new int[] { 1, 2, 3 }, 2));
        assertArrayEquals(new int[] { 1, 3, 3, 5, 5, 2 },
                arrays2testObject.notAlone(new int[] { 1, 2, 3, 2, 5, 2 }, 2));
        assertArrayEquals(new int[] { 3, 4 }, arrays2testObject.notAlone(new int[] { 3, 4 }, 3));
        assertArrayEquals(new int[] { 3, 3 }, arrays2testObject.notAlone(new int[] { 3, 3 }, 3));
        assertArrayEquals(new int[] { 1, 3, 3, 2 }, arrays2testObject.notAlone(new int[] { 1, 3, 1, 2 }, 1));
        assertArrayEquals(new int[] { 3 }, arrays2testObject.notAlone(new int[] { 3 }, 3));
        assertArrayEquals(new int[] {}, arrays2testObject.notAlone(new int[] {}, 3));
        assertArrayEquals(new int[] { 7, 7, 6 }, arrays2testObject.notAlone(new int[] { 7, 1, 6 }, 1));
        assertArrayEquals(new int[] { 1, 1, 1 }, arrays2testObject.notAlone(new int[] { 1, 1, 1 }, 1));
        assertArrayEquals(new int[] { 1, 1, 1, 2 }, arrays2testObject.notAlone(new int[] { 1, 1, 1, 2 }, 1));
    }

    @Test
    public void zeroFrontTest() {
        assertArrayEquals(new int[] { 0, 0, 1, 1 }, arrays2testObject.zeroFront(new int[] { 1, 0, 0, 1 }));
        assertArrayEquals(new int[] { 0, 0, 1, 1, 1 }, arrays2testObject.zeroFront(new int[] { 0, 1, 1, 0, 1 }));
        assertArrayEquals(new int[] { 0, 1 }, arrays2testObject.zeroFront(new int[] { 1, 0 }));
        assertArrayEquals(new int[] { 0, 1 }, arrays2testObject.zeroFront(new int[] { 0, 1 }));
        assertArrayEquals(new int[] { 0, 1, 1, 1 }, arrays2testObject.zeroFront(new int[] { 1, 1, 1, 0 }));
        assertArrayEquals(new int[] { 2, 2, 2, 2 }, arrays2testObject.zeroFront(new int[] { 2, 2, 2, 2 }));
        assertArrayEquals(new int[] { 0, 0, 0, 1 }, arrays2testObject.zeroFront(new int[] { 0, 0, 1, 0 }));
        assertArrayEquals(new int[] { 0, 0, 0, -1, -1 }, arrays2testObject.zeroFront(new int[] { -1, 0, 0, -1, 0 }));
        assertArrayEquals(new int[] { 0, 0, -3, -3 }, arrays2testObject.zeroFront(new int[] { 0, -3, 0, -3 }));
        assertArrayEquals(new int[] {}, arrays2testObject.zeroFront(new int[] {}));
        assertArrayEquals(new int[] { 0, 0, 9, 9, 9, 9 }, arrays2testObject.zeroFront(new int[] { 9, 9, 0, 9, 0, 9 }));
    }

    @Test
    public void withoutTenTest() {
        assertArrayEquals(new int[] { 1, 2, 0, 0 }, arrays2testObject.withoutTen(new int[] { 1, 10, 10, 2 }));
        assertArrayEquals(new int[] { 2, 0, 0 }, arrays2testObject.withoutTen(new int[] { 10, 2, 10 }));
        assertArrayEquals(new int[] { 1, 99, 0 }, arrays2testObject.withoutTen(new int[] { 1, 99, 10 }));
        assertArrayEquals(new int[] { 13, 14, 0, 0 }, arrays2testObject.withoutTen(new int[] { 10, 13, 10, 14 }));
        assertArrayEquals(new int[] { 13, 14, 0, 0, 0 },
                arrays2testObject.withoutTen(new int[] { 10, 13, 10, 14, 10 }));
        assertArrayEquals(new int[] { 3, 0, 0 }, arrays2testObject.withoutTen(new int[] { 10, 10, 3 }));
        assertArrayEquals(new int[] { 1 }, arrays2testObject.withoutTen(new int[] { 1 }));
        assertArrayEquals(new int[] { 13, 1 }, arrays2testObject.withoutTen(new int[] { 13, 1 }));
        assertArrayEquals(new int[] { 0 }, arrays2testObject.withoutTen(new int[] { 10 }));
        assertArrayEquals(new int[] {}, arrays2testObject.withoutTen(new int[] {}));
    }

    @Test
    public void zeroMaxTest() {
        assertArrayEquals(new int[] { 5, 5, 3, 3 }, arrays2testObject.zeroMax(new int[] { 0, 5, 0, 3 }));
        assertArrayEquals(new int[] { 3, 4, 3, 3 }, arrays2testObject.zeroMax(new int[] { 0, 4, 0, 3 }));
        assertArrayEquals(new int[] { 1, 1, 0 }, arrays2testObject.zeroMax(new int[] { 0, 1, 0 }));
        assertArrayEquals(new int[] { 5, 1, 5 }, arrays2testObject.zeroMax(new int[] { 0, 1, 5 }));
        assertArrayEquals(new int[] { 0, 2, 0 }, arrays2testObject.zeroMax(new int[] { 0, 2, 0 }));
        assertArrayEquals(new int[] { 1 }, arrays2testObject.zeroMax(new int[] { 1 }));
        assertArrayEquals(new int[] { 0 }, arrays2testObject.zeroMax(new int[] { 0 }));
        assertArrayEquals(new int[] {}, arrays2testObject.zeroMax(new int[] {}));
        assertArrayEquals(new int[] { 7, 3, 4, 3, 0, 2 }, arrays2testObject.zeroMax(new int[] { 7, 0, 4, 3, 0, 2 }));
        assertArrayEquals(new int[] { 7, 3, 4, 3, 1, 1 }, arrays2testObject.zeroMax(new int[] { 7, 0, 4, 3, 0, 1 }));
        assertArrayEquals(new int[] { 7, 3, 4, 3, 0, 0 }, arrays2testObject.zeroMax(new int[] { 7, 0, 4, 3, 0, 0 }));
        assertArrayEquals(new int[] { 7, 7, 1, 7, 7, 7 }, arrays2testObject.zeroMax(new int[] { 7, 0, 1, 0, 0, 7 }));
    }

    @Test
    public void evenOddTest() {
        assertArrayEquals(new int[] { 0, 0, 0, 1, 1, 1, 1 },
                arrays2testObject.evenOdd(new int[] { 1, 0, 1, 0, 0, 1, 1 }));
        assertArrayEquals(new int[] { 2, 3, 3 }, arrays2testObject.evenOdd(new int[] { 3, 3, 2 }));
        assertArrayEquals(new int[] { 2, 2, 2 }, arrays2testObject.evenOdd(new int[] { 2, 2, 2 }));
        assertArrayEquals(new int[] { 2, 2, 3 }, arrays2testObject.evenOdd(new int[] { 3, 2, 2 }));
        assertArrayEquals(new int[] { 0, 0, 1, 1, 1 }, arrays2testObject.evenOdd(new int[] { 1, 1, 0, 1, 0 }));
        assertArrayEquals(new int[] { 1 }, arrays2testObject.evenOdd(new int[] { 1 }));
        assertArrayEquals(new int[] { 2, 1 }, arrays2testObject.evenOdd(new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 2, 1 }, arrays2testObject.evenOdd(new int[] { 2, 1 }));
        assertArrayEquals(new int[] {}, arrays2testObject.evenOdd(new int[] {}));
    }

    @Test
    public void fizzBuzzTest() {
        assertArrayEquals(new String[] { "1", "2", "Fizz", "4", "Buzz" }, arrays2testObject.fizzBuzz(1, 6));
        assertArrayEquals(new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7" },
                arrays2testObject.fizzBuzz(1, 8));
        assertArrayEquals(new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz" },
                arrays2testObject.fizzBuzz(1, 11));
        assertArrayEquals(new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
                "13", "14", "FizzBuzz" }, arrays2testObject.fizzBuzz(1, 16));
        assertArrayEquals(new String[] { "1", "2", "Fizz" }, arrays2testObject.fizzBuzz(1, 4));
        assertArrayEquals(new String[] { "1" }, arrays2testObject.fizzBuzz(1, 2));
        assertArrayEquals(new String[] { "Buzz", "Fizz", "52", "53", "Fizz", "Buzz" },
                arrays2testObject.fizzBuzz(50, 56));
        assertArrayEquals(new String[] { "FizzBuzz", "16" }, arrays2testObject.fizzBuzz(15, 17));
        assertArrayEquals(new String[] { "FizzBuzz", "31", "32", "Fizz", "34", "Buzz" },
                arrays2testObject.fizzBuzz(30, 36));
        assertArrayEquals(new String[] { "Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz" },
                arrays2testObject.fizzBuzz(1000, 1006));
        assertArrayEquals(new String[] { "Fizz", "Buzz", "101" }, arrays2testObject.fizzBuzz(99, 102));
        assertArrayEquals(new String[] { "14", "FizzBuzz", "16", "17", "Fizz", "19" },
                arrays2testObject.fizzBuzz(14, 20));
    }
}