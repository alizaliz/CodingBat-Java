
package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Test cases for AP-1 exercises
 */
public class AP1Test {
    private AP1 ap1TestObject;

    @Before
    public void setUp() {
        ap1TestObject = new AP1();
    }

    @Test
    public void scoresIncreasingTest() {
        assertTrue(ap1TestObject.scoresIncreasing(new int[] { 1, 3, 4 }));
        assertFalse(ap1TestObject.scoresIncreasing(new int[] { 1, 3, 2 }));
        assertTrue(ap1TestObject.scoresIncreasing(new int[] { 1, 1, 4 }));
        assertTrue(ap1TestObject.scoresIncreasing(new int[] { 1, 1, 2, 4, 4, 7 }));
        assertFalse(ap1TestObject.scoresIncreasing(new int[] { 1, 1, 2, 4, 3, 7 }));
        assertTrue(ap1TestObject.scoresIncreasing(new int[] { -5, 4, 11 }));
    }
}