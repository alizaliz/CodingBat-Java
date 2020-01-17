package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Test cases for Logic2 exercises
 */
public final class Logic2Test {

    private Logic2 logic2testObject;

    @Before
    public void setUp() {
        logic2testObject = new Logic2();
    }

    @Test
    public void makeBricksTest() {
        assertTrue(logic2testObject.makeBricks(3, 1, 8));
        assertFalse(logic2testObject.makeBricks(3, 1, 9));
        assertTrue(logic2testObject.makeBricks(3, 2, 10));
        assertTrue(logic2testObject.makeBricks(3, 2, 8));
        assertFalse(logic2testObject.makeBricks(3, 2, 9));
        assertTrue(logic2testObject.makeBricks(6, 1, 11));
        assertFalse(logic2testObject.makeBricks(6, 0, 11));
        assertTrue(logic2testObject.makeBricks(1, 4, 11));
        assertTrue(logic2testObject.makeBricks(0, 3, 10));
        assertFalse(logic2testObject.makeBricks(1, 4, 12));
        assertTrue(logic2testObject.makeBricks(3, 1, 7));
        assertFalse(logic2testObject.makeBricks(1, 1, 7));
        assertTrue(logic2testObject.makeBricks(2, 1, 7));
        assertTrue(logic2testObject.makeBricks(7, 1, 11));
        assertTrue(logic2testObject.makeBricks(7, 1, 8));
        assertFalse(logic2testObject.makeBricks(7, 1, 13));
        assertTrue(logic2testObject.makeBricks(43, 1, 46));
        assertFalse(logic2testObject.makeBricks(40, 1, 46));
        assertTrue(logic2testObject.makeBricks(40, 2, 47));
        assertTrue(logic2testObject.makeBricks(40, 2, 50));
        assertFalse(logic2testObject.makeBricks(40, 2, 52));
        assertFalse(logic2testObject.makeBricks(22, 2, 33));
        assertTrue(logic2testObject.makeBricks(0, 2, 10));
        assertTrue(logic2testObject.makeBricks(1000000, 1000, 1000100));
        assertFalse(logic2testObject.makeBricks(2, 1000000, 100003));
        assertTrue(logic2testObject.makeBricks(20, 0, 19));
        assertFalse(logic2testObject.makeBricks(20, 0, 21));
        assertFalse(logic2testObject.makeBricks(20, 4, 51));
        assertTrue(logic2testObject.makeBricks(20, 4, 39));
    }

    @Test
    public void loneSumTest() {
        assertEquals(6, logic2testObject.loneSum(1, 2, 3));
        assertEquals(2, logic2testObject.loneSum(3, 2, 3));
        assertEquals(0, logic2testObject.loneSum(3, 3, 3));
        assertEquals(9, logic2testObject.loneSum(9, 2, 2));
        assertEquals(9, logic2testObject.loneSum(2, 2, 9));
        assertEquals(9, logic2testObject.loneSum(2, 9, 2));
        assertEquals(14, logic2testObject.loneSum(2, 9, 3));
        assertEquals(9, logic2testObject.loneSum(4, 2, 3));
        assertEquals(3, logic2testObject.loneSum(1, 3, 1));
    }

    @Test
    public void luckySumTest() {
        assertEquals(6, logic2testObject.luckySum(1, 2, 3));
        assertEquals(3, logic2testObject.luckySum(1, 2, 13));
        assertEquals(1, logic2testObject.luckySum(1, 13, 3));
        assertEquals(1, logic2testObject.luckySum(1, 13, 13));
        assertEquals(13, logic2testObject.luckySum(6, 5, 2));
        assertEquals(0, logic2testObject.luckySum(13, 2, 3));
        assertEquals(0, logic2testObject.luckySum(13, 2, 13));
        assertEquals(0, logic2testObject.luckySum(13, 13, 2));
        assertEquals(13, logic2testObject.luckySum(9, 4, 13));
        assertEquals(8, logic2testObject.luckySum(8, 13, 2));
        assertEquals(10, logic2testObject.luckySum(7, 2, 1));
        assertEquals(6, logic2testObject.luckySum(3, 3, 13));
    }

    @Test
    public void noTeenSumTest() {
        assertEquals(6, logic2testObject.noTeenSum(1, 2, 3));
        assertEquals(3, logic2testObject.noTeenSum(2, 13, 1));
        assertEquals(3, logic2testObject.noTeenSum(2, 1, 14));
        assertEquals(18, logic2testObject.noTeenSum(2, 1, 15));
        assertEquals(19, logic2testObject.noTeenSum(2, 1, 16));
        assertEquals(3, logic2testObject.noTeenSum(2, 1, 17));
        assertEquals(3, logic2testObject.noTeenSum(17, 1, 2));
        assertEquals(19, logic2testObject.noTeenSum(2, 15, 2));
        assertEquals(16, logic2testObject.noTeenSum(16, 17, 18));
        assertEquals(0, logic2testObject.noTeenSum(17, 18, 19));
        assertEquals(32, logic2testObject.noTeenSum(15, 16, 1));
        assertEquals(30, logic2testObject.noTeenSum(15, 15, 19));
        assertEquals(31, logic2testObject.noTeenSum(15, 19, 16));
        assertEquals(5, logic2testObject.noTeenSum(5, 17, 18));
        assertEquals(16, logic2testObject.noTeenSum(17, 18, 16));
        assertEquals(0, logic2testObject.noTeenSum(17, 19, 18));
    }

    @Test
    public void roundSumTest() {
        assertEquals(60, logic2testObject.roundSum(16, 17, 18));
        assertEquals(30, logic2testObject.roundSum(12, 13, 14));
        assertEquals(10, logic2testObject.roundSum(6, 4, 4));
        assertEquals(20, logic2testObject.roundSum(4, 6, 5));
        assertEquals(10, logic2testObject.roundSum(4, 4, 6));
        assertEquals(10, logic2testObject.roundSum(9, 4, 4));
        assertEquals(0, logic2testObject.roundSum(0, 0, 1));
        assertEquals(10, logic2testObject.roundSum(0, 9, 0));
        assertEquals(40, logic2testObject.roundSum(10, 10, 19));
        assertEquals(90, logic2testObject.roundSum(20, 30, 40));
        assertEquals(100, logic2testObject.roundSum(45, 21, 30));
        assertEquals(60, logic2testObject.roundSum(23, 11, 26));
        assertEquals(70, logic2testObject.roundSum(23, 24, 25));
        assertEquals(80, logic2testObject.roundSum(25, 24, 25));
        assertEquals(70, logic2testObject.roundSum(23, 24, 29));
        assertEquals(70, logic2testObject.roundSum(11, 24, 36));
        assertEquals(90, logic2testObject.roundSum(24, 36, 32));
        assertEquals(50, logic2testObject.roundSum(14, 12, 26));
        assertEquals(40, logic2testObject.roundSum(12, 10, 24));
    }

    @Test
    public void closeFarTest() {
        assertTrue(logic2testObject.closeFar(1, 2, 10));
        assertFalse(logic2testObject.closeFar(1, 2, 3));
        assertTrue(logic2testObject.closeFar(4, 1, 3));
        assertFalse(logic2testObject.closeFar(4, 5, 3));
        assertFalse(logic2testObject.closeFar(4, 3, 5));
        assertTrue(logic2testObject.closeFar(-1, 10, 0));
        assertTrue(logic2testObject.closeFar(0, -1, 10));
        assertTrue(logic2testObject.closeFar(10, 10, 8));
        assertFalse(logic2testObject.closeFar(10, 8, 9));
        assertFalse(logic2testObject.closeFar(8, 9, 10));
        assertFalse(logic2testObject.closeFar(8, 9, 7));
        assertTrue(logic2testObject.closeFar(8, 6, 9));
    }

    @Test
    public void blackjackyTest() {
        assertEquals(21, logic2testObject.blackjack(19, 21));
        assertEquals(21, logic2testObject.blackjack(21, 19));
        assertEquals(19, logic2testObject.blackjack(19, 22));
        assertEquals(19, logic2testObject.blackjack(22, 19));
        assertEquals(0, logic2testObject.blackjack(22, 50));
        assertEquals(0, logic2testObject.blackjack(22, 22));
        assertEquals(1, logic2testObject.blackjack(33, 1));
        assertEquals(2, logic2testObject.blackjack(1, 2));
        assertEquals(0, logic2testObject.blackjack(34, 33));
        assertEquals(19, logic2testObject.blackjack(17, 19));
        assertEquals(18, logic2testObject.blackjack(18, 17));
        assertEquals(16, logic2testObject.blackjack(16, 23));
        assertEquals(4, logic2testObject.blackjack(3, 4));
        assertEquals(3, logic2testObject.blackjack(3, 2));
        assertEquals(21, logic2testObject.blackjack(21, 20));
    }

    @Test
    public void evenlySpace() {
        assertTrue(logic2testObject.evenlySpaced(2, 4, 6));
        assertTrue(logic2testObject.evenlySpaced(4, 6, 2));
        assertFalse(logic2testObject.evenlySpaced(4, 6, 3));
        assertTrue(logic2testObject.evenlySpaced(6, 2, 4));
        assertFalse(logic2testObject.evenlySpaced(6, 2, 8));
        assertTrue(logic2testObject.evenlySpaced(2, 2, 2));
        assertFalse(logic2testObject.evenlySpaced(2, 2, 3));
        assertTrue(logic2testObject.evenlySpaced(9, 10, 11));
        assertTrue(logic2testObject.evenlySpaced(10, 9, 11));
        assertFalse(logic2testObject.evenlySpaced(10, 9, 9));
        assertFalse(logic2testObject.evenlySpaced(2, 4, 4));
        assertFalse(logic2testObject.evenlySpaced(2, 2, 4));
        assertFalse(logic2testObject.evenlySpaced(3, 6, 12));
        assertFalse(logic2testObject.evenlySpaced(12, 3, 6));
    }

    @Test
    public void makeChocolateTest() {
        assertEquals(4, logic2testObject.makeChocolate(4, 1, 9));
        assertEquals(-1, logic2testObject.makeChocolate(4, 1, 10));
        assertEquals(2, logic2testObject.makeChocolate(4, 1, 7));
        assertEquals(2, logic2testObject.makeChocolate(6, 2, 7));
        assertEquals(0, logic2testObject.makeChocolate(4, 1, 5));
        assertEquals(4, logic2testObject.makeChocolate(4, 1, 4));
        assertEquals(4, logic2testObject.makeChocolate(5, 4, 9));
        assertEquals(3, logic2testObject.makeChocolate(9, 3, 18));
        assertEquals(-1, logic2testObject.makeChocolate(3, 1, 9));
        assertEquals(-1, logic2testObject.makeChocolate(1, 2, 7));
        assertEquals(1, logic2testObject.makeChocolate(1, 2, 6));
        assertEquals(0, logic2testObject.makeChocolate(1, 2, 5));
        assertEquals(5, logic2testObject.makeChocolate(6, 1, 10));
        assertEquals(6, logic2testObject.makeChocolate(6, 1, 11));
        assertEquals(-1, logic2testObject.makeChocolate(6, 1, 12));
        assertEquals(-1, logic2testObject.makeChocolate(6, 1, 13));
        assertEquals(0, logic2testObject.makeChocolate(6, 2, 10));
        assertEquals(1, logic2testObject.makeChocolate(6, 2, 11));
        assertEquals(2, logic2testObject.makeChocolate(6, 2, 12));
        assertEquals(50, logic2testObject.makeChocolate(60, 100, 550));
        assertEquals(6, logic2testObject.makeChocolate(1000, 1000000, 5000006));
        assertEquals(7, logic2testObject.makeChocolate(7, 1, 12));
        assertEquals(-1, logic2testObject.makeChocolate(7, 1, 13));
        assertEquals(3, logic2testObject.makeChocolate(7, 2, 13));
    }
}