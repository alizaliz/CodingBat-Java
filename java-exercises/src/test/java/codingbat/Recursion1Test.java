package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Test cases for Recursion1 exercises
 */
public class Recursion1Test {

    private Recursion1 recursion1TestObject;

    @Before
    public void setUp() {
        recursion1TestObject = new Recursion1();
    }

    @Test
    public void factoralTest() {
        assertEquals(1, recursion1TestObject.factorial(1));
        assertEquals(2, recursion1TestObject.factorial(2));
        assertEquals(6, recursion1TestObject.factorial(3));
        assertEquals(24, recursion1TestObject.factorial(4));
        assertEquals(120, recursion1TestObject.factorial(5));
        assertEquals(720, recursion1TestObject.factorial(6));
        assertEquals(5040, recursion1TestObject.factorial(7));
        assertEquals(40320, recursion1TestObject.factorial(8));
        assertEquals(479001600, recursion1TestObject.factorial(12));
    }

}