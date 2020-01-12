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
        assertEquals(Arrays.asList(2, 2), functional2TestObject.noNeg(Arrays.asList(-3, -3, 3, 3)));
        assertEquals(Arrays.asList(), functional2TestObject.noNeg(Arrays.asList(-1, -1, -1)));
        assertEquals(Arrays.asList(), functional2TestObject.noNeg(Arrays.asList()));
        assertEquals(Arrays.asList(0, 1, 2), functional2TestObject.noNeg(Arrays.asList(0, 1, 2)));
        assertEquals(Arrays.asList(3, 1, 4), functional2TestObject.noNeg(Arrays.asList(3, -10, 1, -1, 4, -400)));
        assertEquals(Arrays.asList(3, 1, 5),
                functional2TestObject.noNeg(Arrays.asList(-1, 3, 1, -1, -10, -100, -111, 5)));
    }
}