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
}