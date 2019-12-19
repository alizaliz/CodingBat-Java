package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

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
    public void LoneSumTest() {
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

}