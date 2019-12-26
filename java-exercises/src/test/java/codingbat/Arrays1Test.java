package codingbat;

import org.junit.Test;
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
    public void makePiTest(){
        assertArrayEquals(new int[] {3,1,4}, arrays1testObject.makePi());
    }
}