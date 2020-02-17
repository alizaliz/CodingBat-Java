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

    @Test
    public void squirrelPlayTest() {
        assertTrue(logic1testObject.squirrelPlay(70, false));
        assertFalse(logic1testObject.squirrelPlay(95, false));
        assertTrue(logic1testObject.squirrelPlay(95, true));
        assertTrue(logic1testObject.squirrelPlay(90, false));
        assertTrue(logic1testObject.squirrelPlay(90, true));
        assertFalse(logic1testObject.squirrelPlay(50, false));
        assertFalse(logic1testObject.squirrelPlay(50, true));
        assertFalse(logic1testObject.squirrelPlay(100, false));
        assertTrue(logic1testObject.squirrelPlay(100, true));
        assertFalse(logic1testObject.squirrelPlay(105, true));
        assertFalse(logic1testObject.squirrelPlay(59, false));
        assertFalse(logic1testObject.squirrelPlay(59, true));
        assertTrue(logic1testObject.squirrelPlay(60, false));
    }

    @Test
    public void caughtSpeedingTest() {
        assertEquals(0, logic1testObject.caughtSpeeding(60, false));
        assertEquals(1, logic1testObject.caughtSpeeding(65, false));
        assertEquals(0, logic1testObject.caughtSpeeding(65, true));
        assertEquals(1, logic1testObject.caughtSpeeding(80, false));
        assertEquals(2, logic1testObject.caughtSpeeding(85, false));
        assertEquals(1, logic1testObject.caughtSpeeding(85, true));
        assertEquals(1, logic1testObject.caughtSpeeding(70, false));
        assertEquals(1, logic1testObject.caughtSpeeding(75, false));
        assertEquals(1, logic1testObject.caughtSpeeding(75, true));
        assertEquals(0, logic1testObject.caughtSpeeding(40, false));
        assertEquals(0, logic1testObject.caughtSpeeding(40, true));
        assertEquals(2, logic1testObject.caughtSpeeding(90, false));
    }

    @Test
    public void sortaSumTest() {
        assertEquals(7, logic1testObject.sortaSum(3, 4));
        assertEquals(20, logic1testObject.sortaSum(9, 4));
        assertEquals(21, logic1testObject.sortaSum(10, 11));
        assertEquals(9, logic1testObject.sortaSum(12, -3));
        assertEquals(9, logic1testObject.sortaSum(-3, 12));
        assertEquals(9, logic1testObject.sortaSum(4, 5));
        assertEquals(20, logic1testObject.sortaSum(4, 6));
        assertEquals(21, logic1testObject.sortaSum(14, 7));
        assertEquals(20, logic1testObject.sortaSum(14, 6));
    }

    @Test
    public void alarmClockTest() {
        assertEquals("7:00", logic1testObject.alarmClock(1, false));
        assertEquals("7:00", logic1testObject.alarmClock(5, false));
        assertEquals("10:00", logic1testObject.alarmClock(0, false));
        assertEquals("10:00", logic1testObject.alarmClock(6, false));
        assertEquals("off", logic1testObject.alarmClock(0, true));
        assertEquals("off", logic1testObject.alarmClock(6, true));
        assertEquals("10:00", logic1testObject.alarmClock(1, true));
        assertEquals("10:00", logic1testObject.alarmClock(3, true));
        assertEquals("10:00", logic1testObject.alarmClock(5, true));
    }
}