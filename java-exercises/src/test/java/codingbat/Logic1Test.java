package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Test cases for Logic1 exercises
 */
public final class Logic1Test {

    private Logic1 logic1testObject;

    @Before
    public void setUp() {
        logic1testObject = new Logic1();
    }

    @Test
    public void cigarPartyTest() {
        assertFalse(logic1testObject.cigarParty(30, false));
        assertTrue(logic1testObject.cigarParty(50, false));
        assertTrue(logic1testObject.cigarParty(70, true));
        assertFalse(logic1testObject.cigarParty(30, true));
        assertTrue(logic1testObject.cigarParty(50, true));
        assertTrue(logic1testObject.cigarParty(60, false));
        assertFalse(logic1testObject.cigarParty(61, false));
        assertTrue(logic1testObject.cigarParty(40, false));
        assertFalse(logic1testObject.cigarParty(39, false));
        assertTrue(logic1testObject.cigarParty(40, true));
        assertFalse(logic1testObject.cigarParty(39, true));
    }

    @Test
    public void dateFashionTest() {
        assertEquals(2, logic1testObject.dateFashion(5, 10));
        assertEquals(0, logic1testObject.dateFashion(5, 2));
        assertEquals(1, logic1testObject.dateFashion(5, 5));
        assertEquals(1, logic1testObject.dateFashion(3, 3));
        assertEquals(0, logic1testObject.dateFashion(10, 2));
        assertEquals(0, logic1testObject.dateFashion(2, 9));
        assertEquals(2, logic1testObject.dateFashion(9, 9));
        assertEquals(2, logic1testObject.dateFashion(10, 5));
        assertEquals(0, logic1testObject.dateFashion(2, 2));
        assertEquals(1, logic1testObject.dateFashion(3, 7));
        assertEquals(0, logic1testObject.dateFashion(2, 7));
        assertEquals(0, logic1testObject.dateFashion(6, 2));
    }

}