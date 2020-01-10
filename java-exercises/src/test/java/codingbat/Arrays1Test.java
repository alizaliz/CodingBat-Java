package codingbat;

import org.junit.Test;
import org.junit.runner.notification.RunListener.ThreadSafe;

import static org.junit.Assert.*;

import org.junit.Before;

public final class Arrays1Test {

    private Arrays1 arrays1testObject;

    @Before
    public void setUp() {
        arrays1testObject = new Arrays1();
    }

    @Test
    public void firstLast6Test() {
        assertTrue(arrays1testObject.firstLast6(new int[] { 1, 2, 6 }));
        assertTrue(arrays1testObject.firstLast6(new int[] { 6, 1, 2, 3 }));
        assertFalse(arrays1testObject.firstLast6(new int[] { 13, 6, 1, 2, 3 }));
        assertTrue(arrays1testObject.firstLast6(new int[] { 13, 6, 1, 2, 6 }));
        assertFalse(arrays1testObject.firstLast6(new int[] { 3, 2, 1 }));
        assertFalse(arrays1testObject.firstLast6(new int[] { 3, 6, 1 }));
        assertTrue(arrays1testObject.firstLast6(new int[] { 3, 6 }));
        assertTrue(arrays1testObject.firstLast6(new int[] { 6 }));
        assertFalse(arrays1testObject.firstLast6(new int[] { 3 }));
        assertTrue(arrays1testObject.firstLast6(new int[] { 5, 6 }));
        assertFalse(arrays1testObject.firstLast6(new int[] { 5, 5 }));
        assertTrue(arrays1testObject.firstLast6(new int[] { 1, 2, 3, 4, 6 }));
        assertFalse(arrays1testObject.firstLast6(new int[] { 1, 2, 3, 4 }));
    }

    @Test
    public void sameFirstLastTest() {
        assertFalse(arrays1testObject.sameFirstLast(new int[] { 1, 2, 3 }));
        assertTrue(arrays1testObject.sameFirstLast(new int[] { 1, 2, 3, 1 }));
        assertTrue(arrays1testObject.sameFirstLast(new int[] { 1, 2, 1 }));
        assertTrue(arrays1testObject.sameFirstLast(new int[] { 7 }));
        assertFalse(arrays1testObject.sameFirstLast(new int[] {}));
        assertTrue(arrays1testObject.sameFirstLast(new int[] { 1, 2, 3, 4, 5, 1 }));
        assertFalse(arrays1testObject.sameFirstLast(new int[] { 1, 2, 3, 4, 5, 13 }));
        assertTrue(arrays1testObject.sameFirstLast(new int[] { 13, 2, 3, 4, 5, 13 }));
        assertTrue(arrays1testObject.sameFirstLast(new int[] { 7, 7 }));
    }

    @Test
    public void makePiTest() {
        assertArrayEquals(new int[] { 3, 1, 4 }, arrays1testObject.makePi());
    }

    @Test
    public void commonEndTest() {
        assertTrue(arrays1testObject.commonEnd(new int[] { 1, 2, 3 }, new int[] { 7, 3 }));
        assertFalse(arrays1testObject.commonEnd(new int[] { 1, 2, 3 }, new int[] { 7, 3, 2 }));
        assertTrue(arrays1testObject.commonEnd(new int[] { 1, 2, 3 }, new int[] { 1, 3 }));
        assertTrue(arrays1testObject.commonEnd(new int[] { 1, 2, 3 }, new int[] { 1 }));
        assertFalse(arrays1testObject.commonEnd(new int[] { 1, 2, 3 }, new int[] { 2 }));
    }

    @Test
    public void sum3() {
        assertEquals(6, arrays1testObject.sum3(new int[] { 1, 2, 3 }));
        assertEquals(18, arrays1testObject.sum3(new int[] { 5, 11, 2 }));
        assertEquals(7, arrays1testObject.sum3(new int[] { 7, 0, 0 }));
        assertEquals(4, arrays1testObject.sum3(new int[] { 1, 2, 1 }));
        assertEquals(3, arrays1testObject.sum3(new int[] { 1, 1, 1 }));
        assertEquals(11, arrays1testObject.sum3(new int[] { 2, 7, 2 }));
    }

    @Test
    public void rotateLeft3() {
        assertArrayEquals(new int[] { 2, 3, 1 }, arrays1testObject.rotateLeft3(new int[] { 1, 2, 3 }));
        assertArrayEquals(new int[] { 11, 9, 5 }, arrays1testObject.rotateLeft3(new int[] { 5, 11, 9 }));
        assertArrayEquals(new int[] { 0, 0, 7 }, arrays1testObject.rotateLeft3(new int[] { 7, 0, 0 }));
        assertArrayEquals(new int[] { 2, 1, 1 }, arrays1testObject.rotateLeft3(new int[] { 1, 2, 1 }));
        assertArrayEquals(new int[] { 0, 1, 0 }, arrays1testObject.rotateLeft3(new int[] { 0, 0, 1 }));
    }

    @Test
    public void reverse3Test() {
        assertArrayEquals(new int[] { 3, 2, 1 }, arrays1testObject.reverse3(new int[] { 1, 2, 3 }));
        assertArrayEquals(new int[] { 9, 11, 5 }, arrays1testObject.reverse3(new int[] { 5, 11, 9 }));
        assertArrayEquals(new int[] { 0, 0, 7 }, arrays1testObject.reverse3(new int[] { 7, 0, 0 }));
        assertArrayEquals(new int[] { 2, 1, 2 }, arrays1testObject.reverse3(new int[] { 2, 1, 2 }));
        assertArrayEquals(new int[] { 1, 2, 1 }, arrays1testObject.reverse3(new int[] { 1, 2, 1 }));
        assertArrayEquals(new int[] { 3, 11, 2 }, arrays1testObject.reverse3(new int[] { 2, 11, 3 }));
        assertArrayEquals(new int[] { 5, 6, 0 }, arrays1testObject.reverse3(new int[] { 0, 6, 5 }));
        assertArrayEquals(new int[] { 3, 2, 7 }, arrays1testObject.reverse3(new int[] { 7, 2, 3 }));
    }

    @Test
    public void maxEnd3Test() {
        assertArrayEquals(new int[] { 3, 3, 3 }, arrays1testObject.maxEnd3(new int[] { 1, 2, 3 }));
        assertArrayEquals(new int[] { 11, 11, 11 }, arrays1testObject.maxEnd3(new int[] { 11, 5, 9 }));
        assertArrayEquals(new int[] { 3, 3, 3 }, arrays1testObject.maxEnd3(new int[] { 2, 11, 3 }));
        assertArrayEquals(new int[] { 11, 11, 11 }, arrays1testObject.maxEnd3(new int[] { 11, 3, 3 }));
        assertArrayEquals(new int[] { 11, 11, 11 }, arrays1testObject.maxEnd3(new int[] { 3, 11, 11 }));
        assertArrayEquals(new int[] { 2, 2, 2 }, arrays1testObject.maxEnd3(new int[] { 2, 2, 2 }));
        assertArrayEquals(new int[] { 2, 2, 2 }, arrays1testObject.maxEnd3(new int[] { 2, 11, 2 }));
        assertArrayEquals(new int[] { 1, 1, 1 }, arrays1testObject.maxEnd3(new int[] { 0, 0, 1 }));
    }

    @Test
    public void sum2Test() {
        assertEquals(3, arrays1testObject.sum2(new int[] { 1, 2, 3 }));
        assertEquals(2, arrays1testObject.sum2(new int[] { 1, 1 }));
        assertEquals(2, arrays1testObject.sum2(new int[] { 1, 1, 1, 1 }));
        assertEquals(3, arrays1testObject.sum2(new int[] { 1, 2 }));
        assertEquals(1, arrays1testObject.sum2(new int[] { 1 }));
        assertEquals(0, arrays1testObject.sum2(new int[] {}));
        assertEquals(9, arrays1testObject.sum2(new int[] { 4, 5, 6 }));
        assertEquals(4, arrays1testObject.sum2(new int[] { 4 }));
    }

    @Test
    public void middleWayTest() {
        assertArrayEquals(new int[] { 2, 5 },
                arrays1testObject.middleWay(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }));
        assertArrayEquals(new int[] { 7, 8 },
                arrays1testObject.middleWay(new int[] { 7, 7, 7 }, new int[] { 3, 8, 0 }));
        assertArrayEquals(new int[] { 2, 4 },
                arrays1testObject.middleWay(new int[] { 5, 2, 9 }, new int[] { 1, 4, 5 }));
        assertArrayEquals(new int[] { 9, 8 },
                arrays1testObject.middleWay(new int[] { 1, 9, 7 }, new int[] { 4, 8, 8 }));
        assertArrayEquals(new int[] { 2, 1 },
                arrays1testObject.middleWay(new int[] { 1, 2, 3 }, new int[] { 3, 1, 4 }));
        assertArrayEquals(new int[] { 2, 1 },
                arrays1testObject.middleWay(new int[] { 1, 2, 3 }, new int[] { 4, 1, 1 }));
    }

    @Test
    public void makeEnds() {
        assertArrayEquals(new int[] { 1, 3 }, arrays1testObject.makeEnds(new int[] { 1, 2, 3 }));
        assertArrayEquals(new int[] { 1, 4 }, arrays1testObject.makeEnds(new int[] { 1, 2, 3, 4 }));
        assertArrayEquals(new int[] { 7, 2 }, arrays1testObject.makeEnds(new int[] { 7, 4, 6, 2 }));
        assertArrayEquals(new int[] { 1, 3 }, arrays1testObject.makeEnds(new int[] { 1, 2, 2, 2, 2, 2, 2, 3 }));
        assertArrayEquals(new int[] { 7, 4 }, arrays1testObject.makeEnds(new int[] { 7, 4 }));
        assertArrayEquals(new int[] { 7, 7 }, arrays1testObject.makeEnds(new int[] { 7 }));
        assertArrayEquals(new int[] { 5, 9 }, arrays1testObject.makeEnds(new int[] { 5, 2, 9 }));
        assertArrayEquals(new int[] { 2, 1 }, arrays1testObject.makeEnds(new int[] { 2, 3, 4, 1 }));
    }

    @Test
    public void has23Test() {
        assertTrue(arrays1testObject.has23(new int[] { 2, 5 }));
        assertTrue(arrays1testObject.has23(new int[] { 4, 3 }));
        assertFalse(arrays1testObject.has23(new int[] { 4, 5 }));
        assertTrue(arrays1testObject.has23(new int[] { 2, 2 }));
        assertTrue(arrays1testObject.has23(new int[] { 3, 2 }));
        assertTrue(arrays1testObject.has23(new int[] { 3, 3 }));
        assertFalse(arrays1testObject.has23(new int[] { 7, 7 }));
        assertTrue(arrays1testObject.has23(new int[] { 3, 9 }));
        assertFalse(arrays1testObject.has23(new int[] { 9, 5 }));
    }

    @Test
    public void no23Test() {
        assertTrue(arrays1testObject.no23(new int[] { 4, 5 }));
        assertFalse(arrays1testObject.no23(new int[] { 4, 2 }));
        assertFalse(arrays1testObject.no23(new int[] { 3, 5 }));
        assertTrue(arrays1testObject.no23(new int[] { 1, 9 }));
        assertFalse(arrays1testObject.no23(new int[] { 2, 9 }));
        assertFalse(arrays1testObject.no23(new int[] { 1, 3 }));
        assertTrue(arrays1testObject.no23(new int[] { 1, 1 }));
        assertFalse(arrays1testObject.no23(new int[] { 2, 2 }));
        assertFalse(arrays1testObject.no23(new int[] { 3, 3 }));
        assertTrue(arrays1testObject.no23(new int[] { 7, 8 }));
        assertTrue(arrays1testObject.no23(new int[] { 8, 7 }));
    }

    @Test
    public void makeLastTest() {
        assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 6 }, arrays1testObject.makeLast(new int[] { 4, 5, 6 }));
        assertArrayEquals(new int[] { 0, 0, 0, 2 }, arrays1testObject.makeLast(new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 0, 3 }, arrays1testObject.makeLast(new int[] { 3 }));
        assertArrayEquals(new int[] { 0, 0 }, arrays1testObject.makeLast(new int[] { 0 }));
        assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 7 }, arrays1testObject.makeLast(new int[] { 7, 7, 7 }));
        assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 4 }, arrays1testObject.makeLast(new int[] { 3, 1, 4 }));
        assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 4 }, arrays1testObject.makeLast(new int[] { 1, 2, 3, 4 }));
        assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0 }, arrays1testObject.makeLast(new int[] { 1, 2, 3, 0 }));
        assertArrayEquals(new int[] { 0, 0, 0, 4 }, arrays1testObject.makeLast(new int[] { 2, 4 }));
    }

    @Test
    public void double23Test() {
        assertTrue(arrays1testObject.double23(new int[] { 2, 2 }));
        assertTrue(arrays1testObject.double23(new int[] { 3, 3 }));
        assertFalse(arrays1testObject.double23(new int[] { 2, 3 }));
        assertFalse(arrays1testObject.double23(new int[] { 3, 2 }));
        assertFalse(arrays1testObject.double23(new int[] { 4, 5 }));
        assertFalse(arrays1testObject.double23(new int[] { 2 }));
        assertFalse(arrays1testObject.double23(new int[] { 3 }));
        assertFalse(arrays1testObject.double23(new int[] {}));
        assertFalse(arrays1testObject.double23(new int[] { 3, 4 }));
    }

    @Test
    public void fix23Test() {
        assertArrayEquals(new int[] { 1, 2, 0 }, arrays1testObject.fix23(new int[] { 1, 2, 3 }));
        assertArrayEquals(new int[] { 2, 0, 5 }, arrays1testObject.fix23(new int[] { 2, 3, 5 }));
        assertArrayEquals(new int[] { 1, 2, 1 }, arrays1testObject.fix23(new int[] { 1, 2, 1 }));
        assertArrayEquals(new int[] { 3, 2, 1 }, arrays1testObject.fix23(new int[] { 3, 2, 1 }));
        assertArrayEquals(new int[] { 2, 2, 0 }, arrays1testObject.fix23(new int[] { 2, 2, 3 }));
        assertArrayEquals(new int[] { 2, 0, 3 }, arrays1testObject.fix23(new int[] { 2, 3, 3 }));
    }

    @Test
    public void start1Test() {
        assertEquals(2, arrays1testObject.start1(new int[] { 1, 2, 3 }, new int[] { 1, 3 }));
        assertEquals(1, arrays1testObject.start1(new int[] { 7, 2, 3 }, new int[] { 1 }));
        assertEquals(1, arrays1testObject.start1(new int[] { 1, 2 }, new int[] {}));
        assertEquals(1, arrays1testObject.start1(new int[] {}, new int[] { 1, 2 }));
        assertEquals(0, arrays1testObject.start1(new int[] { 7 }, new int[] {}));
        assertEquals(1, arrays1testObject.start1(new int[] { 7 }, new int[] { 1 }));
        assertEquals(2, arrays1testObject.start1(new int[] { 1 }, new int[] { 1 }));
        assertEquals(0, arrays1testObject.start1(new int[] { 7 }, new int[] { 8 }));
        assertEquals(0, arrays1testObject.start1(new int[] {}, new int[] {}));
        assertEquals(2, arrays1testObject.start1(new int[] { 1, 3 }, new int[] { 1 }));
    }

    @Test
    public void biggerTwoTest() {
        assertArrayEquals(new int[] { 3, 4 }, arrays1testObject.biggerTwo(new int[] { 1, 2 }, new int[] { 3, 4 }));
        assertArrayEquals(new int[] { 3, 4 }, arrays1testObject.biggerTwo(new int[] { 3, 4 }, new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 1, 2 }, arrays1testObject.biggerTwo(new int[] { 1, 1 }, new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 2, 1 }, arrays1testObject.biggerTwo(new int[] { 2, 1 }, new int[] { 1, 1 }));
        assertArrayEquals(new int[] { 2, 2 }, arrays1testObject.biggerTwo(new int[] { 2, 2 }, new int[] { 1, 3 }));
        assertArrayEquals(new int[] { 1, 3 }, arrays1testObject.biggerTwo(new int[] { 1, 3 }, new int[] { 2, 2 }));
        assertArrayEquals(new int[] { 6, 7 }, arrays1testObject.biggerTwo(new int[] { 6, 7 }, new int[] { 3, 1 }));
    }

    @Test
    public void makeMIddleTest() {
        assertArrayEquals(new int[] { 2, 3 }, arrays1testObject.makeMiddle(new int[] { 1, 2, 3, 4 }));
        assertArrayEquals(new int[] { 2, 3 }, arrays1testObject.makeMiddle(new int[] { 7, 1, 2, 3, 4, 9 }));
        assertArrayEquals(new int[] { 1, 2 }, arrays1testObject.makeMiddle(new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 2, 4 }, arrays1testObject.makeMiddle(new int[] { 5, 2, 4, 7 }));
        assertArrayEquals(new int[] { 4, 3 }, arrays1testObject.makeMiddle(new int[] { 9, 0, 4, 3, 9, 1 }));
    }

    @Test
    public void plusTwoTest() {
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, arrays1testObject.plusTwo(new int[] { 1, 2 }, new int[] { 3, 4 }));
        assertArrayEquals(new int[] { 4, 4, 2, 2 }, arrays1testObject.plusTwo(new int[] { 4, 4 }, new int[] { 2, 2 }));
        assertArrayEquals(new int[] { 9, 2, 3, 4 }, arrays1testObject.plusTwo(new int[] { 9, 2 }, new int[] { 3, 4 }));
    }

    @Test
    public void swapEndsTest() {
        assertArrayEquals(new int[] { 4, 2, 3, 1 }, arrays1testObject.swapEnds(new int[] { 1, 2, 3, 4 }));
        assertArrayEquals(new int[] { 3, 2, 1 }, arrays1testObject.swapEnds(new int[] { 1, 2, 3 }));
        assertArrayEquals(new int[] { 5, 6, 7, 9, 8 }, arrays1testObject.swapEnds(new int[] { 8, 6, 7, 9, 5 }));
        assertArrayEquals(new int[] { 9, 1, 4, 1, 5, 3 }, arrays1testObject.swapEnds(new int[] { 3, 1, 4, 1, 5, 9 }));
        assertArrayEquals(new int[] { 2, 1 }, arrays1testObject.swapEnds(new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 1 }, arrays1testObject.swapEnds(new int[] { 1 }));
    }

    @Test
    public void middleThreeTest() {
        assertArrayEquals(new int[] { 2, 3, 4 }, arrays1testObject.midThree(new int[] { 1, 2, 3, 4, 5 }));
        assertArrayEquals(new int[] { 7, 5, 3 }, arrays1testObject.midThree(new int[] { 8, 6, 7, 5, 3, 0, 9 }));
        assertArrayEquals(new int[] { 1, 2, 3 }, arrays1testObject.midThree(new int[] { 1, 2, 3 }));
    }

    @Test
    public void maxTripleTest() {
        assertEquals(3, arrays1testObject.maxTriple(new int[] { 1, 2, 3 }));
        assertEquals(5, arrays1testObject.maxTriple(new int[] { 1, 5, 3 }));
        assertEquals(5, arrays1testObject.maxTriple(new int[] { 5, 2, 3 }));
        assertEquals(3, arrays1testObject.maxTriple(new int[] { 1, 2, 3, 1, 1 }));
        assertEquals(5, arrays1testObject.maxTriple(new int[] { 1, 7, 3, 1, 5 }));
        assertEquals(5, arrays1testObject.maxTriple(new int[] { 5, 1, 3, 7, 1 }));
        assertEquals(5, arrays1testObject.maxTriple(new int[] { 5, 1, 7, 3, 7, 8, 1 }));
        assertEquals(9, arrays1testObject.maxTriple(new int[] { 5, 1, 7, 9, 7, 8, 1 }));
        assertEquals(9, arrays1testObject.maxTriple(new int[] { 5, 1, 7, 3, 7, 8, 9 }));
        assertEquals(5, arrays1testObject.maxTriple(new int[] { 2, 2, 5, 1, 1 }));
    }

    @Test
    public void frontPieceTest() {
        assertArrayEquals(new int[] { 1, 2 }, arrays1testObject.frontPiece(new int[] { 1, 2, 3 }));
        assertArrayEquals(new int[] { 1, 2 }, arrays1testObject.frontPiece(new int[] { 1, 2 }));
        assertArrayEquals(new int[] { 1 }, arrays1testObject.frontPiece(new int[] { 1 }));
        assertArrayEquals(new int[] {}, arrays1testObject.frontPiece(new int[] {}));
        assertArrayEquals(new int[] { 6, 5 }, arrays1testObject.frontPiece(new int[] { 6, 5, 0 }));
        assertArrayEquals(new int[] { 6, 5 }, arrays1testObject.frontPiece(new int[] { 6, 5 }));
        assertArrayEquals(new int[] { 3, 1 }, arrays1testObject.frontPiece(new int[] { 3, 1, 4, 1, 5 }));
        assertArrayEquals(new int[] { 6 }, arrays1testObject.frontPiece(new int[] { 6 }));
    }
}
