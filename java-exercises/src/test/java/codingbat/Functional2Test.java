package codingbat;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * Test cases for Functional1 exercises
 */
public class Functional2Test {

    private Functional2 functional2TestObject;

    @Before
    public void setUp() {
        functional2TestObject = new Functional2();
    }

    @Test
    public void noNegTest() {
        assertEquals(Arrays.asList(1), functional2TestObject.noNeg(Arrays.asList(1, -2)));
        assertEquals(Arrays.asList(3, 3), functional2TestObject.noNeg(Arrays.asList(-3, -3, 3, 3)));
        assertEquals(Arrays.asList(), functional2TestObject.noNeg(Arrays.asList(-1, -1, -1)));
        assertEquals(Arrays.asList(), functional2TestObject.noNeg(Arrays.asList()));
        assertEquals(Arrays.asList(0, 1, 2), functional2TestObject.noNeg(Arrays.asList(0, 1, 2)));
        assertEquals(Arrays.asList(3, 1, 4), functional2TestObject.noNeg(Arrays.asList(3, -10, 1, -1, 4, -400)));
        assertEquals(Arrays.asList(3, 1, 5),
                functional2TestObject.noNeg(Arrays.asList(-1, 3, 1, -1, -10, -100, -111, 5)));
    }

    @Test
    public void no9Test() {
        assertEquals(Arrays.asList(1, 2), functional2TestObject.no9(Arrays.asList(1, 2, 19)));
        assertEquals(Arrays.asList(3), functional2TestObject.no9(Arrays.asList(9, 19, 29, 3)));
        assertEquals(Arrays.asList(1, 2, 3), functional2TestObject.no9(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(45, 90, 28, 13, 0),
                functional2TestObject.no9(Arrays.asList(45, 99, 90, 28, 13, 999, 0)));
        assertEquals(Arrays.asList(), functional2TestObject.no9(Arrays.asList()));
        assertEquals(Arrays.asList(), functional2TestObject.no9(Arrays.asList(9)));
        assertEquals(Arrays.asList(0, 0), functional2TestObject.no9(Arrays.asList(0, 9, 0)));
    }

    @Test
    public void noTeenTest() {
        assertEquals(Arrays.asList(12, 20), functional2TestObject.noTeen(Arrays.asList(12, 13, 19, 20)));
        assertEquals(Arrays.asList(1, 1), functional2TestObject.noTeen(Arrays.asList(1, 14, 1)));
        assertEquals(Arrays.asList(), functional2TestObject.noTeen(Arrays.asList(15)));
        assertEquals(Arrays.asList(-15), functional2TestObject.noTeen(Arrays.asList(-15)));
        assertEquals(Arrays.asList(), functional2TestObject.noTeen(Arrays.asList()));
        assertEquals(Arrays.asList(0, 1, 2, -3), functional2TestObject.noTeen(Arrays.asList(0, 1, 2, -3)));
        assertEquals(Arrays.asList(21), functional2TestObject.noTeen(Arrays.asList(15, 17, 19, 21, 19)));
        assertEquals(Arrays.asList(-16, 2, 3, 25), functional2TestObject.noTeen(Arrays.asList(-16, 2, 15, 3, 16, 25)));
    }
}