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

    @Test
    public void love6Test() {
        assertTrue(logic1testObject.love6(6, 4));
        assertFalse(logic1testObject.love6(4, 5));
        assertTrue(logic1testObject.love6(1, 5));
        assertTrue(logic1testObject.love6(1, 6));
        assertFalse(logic1testObject.love6(1, 8));
        assertTrue(logic1testObject.love6(1, 7));
        assertFalse(logic1testObject.love6(7, 5));
        assertTrue(logic1testObject.love6(8, 2));
        assertTrue(logic1testObject.love6(6, 6));
        assertFalse(logic1testObject.love6(-6, 2));
        assertTrue(logic1testObject.love6(-4, -10));
        assertFalse(logic1testObject.love6(-7, 1));
        assertTrue(logic1testObject.love6(7, -1));
        assertTrue(logic1testObject.love6(-6, 12));
        assertFalse(logic1testObject.love6(-2, -4));
        assertTrue(logic1testObject.love6(7, 1));
        assertFalse(logic1testObject.love6(0, 9));
        assertFalse(logic1testObject.love6(8, 3));
        assertTrue(logic1testObject.love6(3, 3));
        assertFalse(logic1testObject.love6(3, 4));
    }

    @Test
    public void in1To10Test() {
        assertTrue(logic1testObject.in1To10(5, false));
        assertFalse(logic1testObject.in1To10(11, false));
        assertTrue(logic1testObject.in1To10(11, true));
        assertTrue(logic1testObject.in1To10(10, false));
        assertTrue(logic1testObject.in1To10(10, true));
        assertTrue(logic1testObject.in1To10(9, false));
        assertFalse(logic1testObject.in1To10(9, true));
        assertTrue(logic1testObject.in1To10(1, false));
        assertTrue(logic1testObject.in1To10(1, true));
        assertFalse(logic1testObject.in1To10(0, false));
        assertTrue(logic1testObject.in1To10(0, true));
        assertFalse(logic1testObject.in1To10(-1, false));
        assertTrue(logic1testObject.in1To10(-1, true));
        assertFalse(logic1testObject.in1To10(99, false));
        assertTrue(logic1testObject.in1To10(-99, true));
    }

    @Test
    public void specialElevenTest() {
        assertTrue(logic1testObject.specialEleven(22));
        assertTrue(logic1testObject.specialEleven(23));
        assertFalse(logic1testObject.specialEleven(24));
        assertFalse(logic1testObject.specialEleven(21));
        assertTrue(logic1testObject.specialEleven(11));
        assertTrue(logic1testObject.specialEleven(12));
        assertFalse(logic1testObject.specialEleven(10));
        assertFalse(logic1testObject.specialEleven(9));
        assertFalse(logic1testObject.specialEleven(8));
        assertTrue(logic1testObject.specialEleven(0));
        assertTrue(logic1testObject.specialEleven(1));
        assertFalse(logic1testObject.specialEleven(2));
        assertTrue(logic1testObject.specialEleven(121));
        assertTrue(logic1testObject.specialEleven(122));
        assertFalse(logic1testObject.specialEleven(123));
        assertFalse(logic1testObject.specialEleven(46));
        assertFalse(logic1testObject.specialEleven(49));
        assertFalse(logic1testObject.specialEleven(52));
        assertFalse(logic1testObject.specialEleven(54));
        assertTrue(logic1testObject.specialEleven(55));
    }

    @Test
    public void more20Test() {
        assertFalse(logic1testObject.more20(20));
        assertTrue(logic1testObject.more20(21));
        assertTrue(logic1testObject.more20(22));
        assertFalse(logic1testObject.more20(23));
        assertFalse(logic1testObject.more20(25));
        assertFalse(logic1testObject.more20(30));
        assertFalse(logic1testObject.more20(31));
        assertFalse(logic1testObject.more20(59));
        assertFalse(logic1testObject.more20(60));
        assertTrue(logic1testObject.more20(61));
        assertTrue(logic1testObject.more20(62));
        assertFalse(logic1testObject.more20(1020));
        assertTrue(logic1testObject.more20(1021));
        assertFalse(logic1testObject.more20(1000));
        assertTrue(logic1testObject.more20(1001));
        assertFalse(logic1testObject.more20(50));
        assertFalse(logic1testObject.more20(55));
        assertFalse(logic1testObject.more20(40));
        assertTrue(logic1testObject.more20(41));
        assertFalse(logic1testObject.more20(39));
        assertTrue(logic1testObject.more20(42));
    }

    @Test
    public void old35Test() {
        assertTrue(logic1testObject.old35(3));
        assertTrue(logic1testObject.old35(10));
        assertFalse(logic1testObject.old35(15));
        assertTrue(logic1testObject.old35(5));
        assertTrue(logic1testObject.old35(9));
        assertFalse(logic1testObject.old35(8));
        assertFalse(logic1testObject.old35(7));
        assertTrue(logic1testObject.old35(6));
        assertFalse(logic1testObject.old35(17));
        assertTrue(logic1testObject.old35(18));
        assertFalse(logic1testObject.old35(29));
        assertTrue(logic1testObject.old35(20));
        assertTrue(logic1testObject.old35(21));
        assertFalse(logic1testObject.old35(22));
        assertFalse(logic1testObject.old35(45));
        assertTrue(logic1testObject.old35(99));
    }

    @Test
    public void less20Test() {
        assertTrue(logic1testObject.less20(18));
        assertTrue(logic1testObject.less20(19));
        assertFalse(logic1testObject.less20(20));
        assertFalse(logic1testObject.less20(8));
        assertFalse(logic1testObject.less20(17));
        assertFalse(logic1testObject.less20(23));
        assertFalse(logic1testObject.less20(25));
        assertFalse(logic1testObject.less20(30));
        assertFalse(logic1testObject.less20(31));
        assertTrue(logic1testObject.less20(58));
        assertTrue(logic1testObject.less20(59));
        assertFalse(logic1testObject.less20(60));
        assertFalse(logic1testObject.less20(61));
        assertFalse(logic1testObject.less20(62));
        assertFalse(logic1testObject.less20(1017));
        assertTrue(logic1testObject.less20(1018));
        assertTrue(logic1testObject.less20(1019));
        assertFalse(logic1testObject.less20(1020));
        assertFalse(logic1testObject.less20(1021));
        assertFalse(logic1testObject.less20(1022));
        assertFalse(logic1testObject.less20(1023));
        assertFalse(logic1testObject.less20(37));
    }

    @Test
    public void near10Test() {
        assertTrue(logic1testObject.nearTen(12));
        assertFalse(logic1testObject.nearTen(17));
        assertTrue(logic1testObject.nearTen(19));
        assertTrue(logic1testObject.nearTen(31));
        assertFalse(logic1testObject.nearTen(6));
        assertTrue(logic1testObject.nearTen(10));
        assertTrue(logic1testObject.nearTen(11));
        assertTrue(logic1testObject.nearTen(21));
        assertTrue(logic1testObject.nearTen(22));
        assertFalse(logic1testObject.nearTen(23));
        assertFalse(logic1testObject.nearTen(54));
        assertFalse(logic1testObject.nearTen(155));
        assertTrue(logic1testObject.nearTen(158));
        assertFalse(logic1testObject.nearTen(3));
        assertTrue(logic1testObject.nearTen(1));
    }

    @Test
    public void teenSumTest() {
        assertEquals(7, logic1testObject.teenSum(3, 4));
        assertEquals(19, logic1testObject.teenSum(10, 13));
        assertEquals(19, logic1testObject.teenSum(13, 2));
        assertEquals(19, logic1testObject.teenSum(3, 19));
        assertEquals(19, logic1testObject.teenSum(13, 13));
        assertEquals(20, logic1testObject.teenSum(10, 10));
        assertEquals(19, logic1testObject.teenSum(6, 14));
        assertEquals(19, logic1testObject.teenSum(15, 2));
        assertEquals(19, logic1testObject.teenSum(19, 19));
        assertEquals(19, logic1testObject.teenSum(19, 20));
        assertEquals(19, logic1testObject.teenSum(2, 18));
        assertEquals(16, logic1testObject.teenSum(12, 4));
        assertEquals(22, logic1testObject.teenSum(2, 20));
        assertEquals(19, logic1testObject.teenSum(2, 17));
        assertEquals(19, logic1testObject.teenSum(2, 16));
        assertEquals(13, logic1testObject.teenSum(6, 7));
    }

    @Test
    public void answerCellTest() {
        assertTrue(logic1testObject.answerCell(false, false, false));
        assertFalse(logic1testObject.answerCell(false, false, true));
        assertFalse(logic1testObject.answerCell(false, false, true));
        assertFalse(logic1testObject.answerCell(true, false, false));
        assertTrue(logic1testObject.answerCell(true, true, false));
        assertTrue(logic1testObject.answerCell(false, true, false));
        assertFalse(logic1testObject.answerCell(true, true, true));
    }

    @Test
    public void teaPartyTest() {
        assertEquals(1, logic1testObject.teaParty(6, 8));
        assertEquals(0, logic1testObject.teaParty(3, 8));
        assertEquals(2, logic1testObject.teaParty(20, 6));
        assertEquals(2, logic1testObject.teaParty(12, 6));
        assertEquals(1, logic1testObject.teaParty(11, 6));
        assertEquals(0, logic1testObject.teaParty(11, 4));
        assertEquals(0, logic1testObject.teaParty(4, 5));
        assertEquals(1, logic1testObject.teaParty(5, 5));
        assertEquals(1, logic1testObject.teaParty(6, 6));
        assertEquals(2, logic1testObject.teaParty(5, 10));
        assertEquals(1, logic1testObject.teaParty(5, 9));
        assertEquals(0, logic1testObject.teaParty(10, 4));
        assertEquals(2, logic1testObject.teaParty(10, 20));
    }

    @Test
    public void fizzStringTest() {
        assertEquals("Fizz", logic1testObject.fizzString("fig"));
        assertEquals("Buzz", logic1testObject.fizzString("dib"));
        assertEquals("FizzBuzz", logic1testObject.fizzString("fib"));
        assertEquals("abc", logic1testObject.fizzString("abc"));
        assertEquals("Fizz", logic1testObject.fizzString("fooo"));
        assertEquals("booo", logic1testObject.fizzString("booo"));
        assertEquals("Buzz", logic1testObject.fizzString("ooob"));
        assertEquals("FizzBuzz", logic1testObject.fizzString("fooob"));
        assertEquals("Fizz", logic1testObject.fizzString("f"));
        assertEquals("Buzz", logic1testObject.fizzString("b"));
        assertEquals("Buzz", logic1testObject.fizzString("abcb"));
        assertEquals("Hello", logic1testObject.fizzString("Hello"));
        assertEquals("Buzz", logic1testObject.fizzString("Hellob"));
        assertEquals("af", logic1testObject.fizzString("af"));
        assertEquals("bf", logic1testObject.fizzString("bf"));
        assertEquals("FizzBuzz", logic1testObject.fizzString("fb"));
    }

    @Test
    public void fizzString2Test() {
        assertEquals("1!", logic1testObject.fizzString2(1));
        assertEquals("2!", logic1testObject.fizzString2(2));
        assertEquals("Fizz!", logic1testObject.fizzString2(3));
        assertEquals("4!", logic1testObject.fizzString2(4));
        assertEquals("Buzz!", logic1testObject.fizzString2(5));
        assertEquals("Fizz!", logic1testObject.fizzString2(6));
        assertEquals("7!", logic1testObject.fizzString2(7));
        assertEquals("8!", logic1testObject.fizzString2(8));
        assertEquals("Fizz!", logic1testObject.fizzString2(9));
        assertEquals("FizzBuzz!", logic1testObject.fizzString2(15));
        assertEquals("16!", logic1testObject.fizzString2(16));
        assertEquals("Fizz!", logic1testObject.fizzString2(18));
        assertEquals("19!", logic1testObject.fizzString2(19));
        assertEquals("Fizz!", logic1testObject.fizzString2(21));
        assertEquals("44!", logic1testObject.fizzString2(44));
        assertEquals("FizzBuzz!", logic1testObject.fizzString2(45));
        assertEquals("Buzz!", logic1testObject.fizzString2(100));
    }

    @Test
    public void twoAdOneTest() {
        assertTrue(logic1testObject.twoAsOne(1, 2, 3));
        assertTrue(logic1testObject.twoAsOne(3, 1, 2));
        assertFalse(logic1testObject.twoAsOne(3, 2, 2));
        assertTrue(logic1testObject.twoAsOne(2, 3, 1));
        assertTrue(logic1testObject.twoAsOne(5, 3, -2));
        assertFalse(logic1testObject.twoAsOne(5, 3, -3));
        assertTrue(logic1testObject.twoAsOne(2, 5, 3));
        assertFalse(logic1testObject.twoAsOne(9, 5, 5));
        assertTrue(logic1testObject.twoAsOne(9, 4, 5));
        assertTrue(logic1testObject.twoAsOne(5, 4, 9));
        assertTrue(logic1testObject.twoAsOne(3, 3, 0));
        assertFalse(logic1testObject.twoAsOne(3, 3, 2));
    }

    @Test
    public void inOrderTest() {
        assertTrue(logic1testObject.inOrder(1, 2, 4, false));
        assertFalse(logic1testObject.inOrder(1, 2, 1, false));
        assertTrue(logic1testObject.inOrder(1, 1, 2, true));
        assertFalse(logic1testObject.inOrder(3, 2, 4, false));
        assertTrue(logic1testObject.inOrder(2, 3, 4, false));
        assertTrue(logic1testObject.inOrder(3, 2, 4, true));
        assertFalse(logic1testObject.inOrder(4, 2, 2, true));
        assertFalse(logic1testObject.inOrder(4, 5, 2, true));
        assertTrue(logic1testObject.inOrder(2, 4, 6, true));
        assertTrue(logic1testObject.inOrder(7, 9, 10, false));
        assertFalse(logic1testObject.inOrder(7, 5, 6, true));
        assertFalse(logic1testObject.inOrder(7, 5, 4, true));
    }

    @Test
    public void inOrderEqualTest() {
        assertTrue(logic1testObject.inOrderEqual(2, 5, 11, false));
        assertFalse(logic1testObject.inOrderEqual(5, 7, 6, false));
        assertTrue(logic1testObject.inOrderEqual(5, 5, 7, true));
        assertFalse(logic1testObject.inOrderEqual(5, 5, 7, false));
        assertFalse(logic1testObject.inOrderEqual(2, 5, 4, false));
        assertFalse(logic1testObject.inOrderEqual(3, 4, 3, false));
        assertFalse(logic1testObject.inOrderEqual(3, 4, 4, false));
        assertFalse(logic1testObject.inOrderEqual(3, 4, 3, true));
        assertTrue(logic1testObject.inOrderEqual(3, 4, 4, true));
        assertTrue(logic1testObject.inOrderEqual(1, 5, 5, true));
        assertTrue(logic1testObject.inOrderEqual(5, 5, 5, true));
        assertFalse(logic1testObject.inOrderEqual(2, 2, 1, true));
        assertFalse(logic1testObject.inOrderEqual(9, 2, 2, true));
        assertFalse(logic1testObject.inOrderEqual(0, 1, 0, true));
    }

    @Test
    public void lastDigitTest() {
        assertTrue(logic1testObject.lastDigit(23, 19, 13));
        assertFalse(logic1testObject.lastDigit(23, 19, 12));
        assertTrue(logic1testObject.lastDigit(23, 19, 3));
        assertTrue(logic1testObject.lastDigit(23, 19, 39));
        assertFalse(logic1testObject.lastDigit(1, 2, 3));
        assertTrue(logic1testObject.lastDigit(1, 1, 2));
        assertTrue(logic1testObject.lastDigit(1, 2, 2));
        assertFalse(logic1testObject.lastDigit(14, 25, 43));
        assertTrue(logic1testObject.lastDigit(14, 25, 45));
        assertFalse(logic1testObject.lastDigit(248, 106, 1002));
        assertTrue(logic1testObject.lastDigit(248, 106, 1008));
        assertTrue(logic1testObject.lastDigit(10, 11, 20));
        assertTrue(logic1testObject.lastDigit(0, 11, 0));
    }

    @Test
    public void lessby10() {
        assertTrue(logic1testObject.lessBy10(1, 7, 11));
        assertFalse(logic1testObject.lessBy10(1, 7, 10));
        assertTrue(logic1testObject.lessBy10(11, 1, 7));
        assertFalse(logic1testObject.lessBy10(10, 7, 1));
        assertTrue(logic1testObject.lessBy10(-10, 2, 2));
        assertFalse(logic1testObject.lessBy10(2, 11, 11));
        assertTrue(logic1testObject.lessBy10(3, 3, 30));
        assertFalse(logic1testObject.lessBy10(3, 3, 3));
        assertTrue(logic1testObject.lessBy10(10, 1, 11));
        assertTrue(logic1testObject.lessBy10(10, 11, 1));
        assertFalse(logic1testObject.lessBy10(10, 11, 2));
        assertTrue(logic1testObject.lessBy10(3, 30, 3));
        assertTrue(logic1testObject.lessBy10(2, 2, -8));
        assertTrue(logic1testObject.lessBy10(2, 8, 12));
    }

    @Test
    public void withoutDoublesTest() {
        assertEquals(5, logic1testObject.withoutDoubles(2, 3, true));
        assertEquals(7, logic1testObject.withoutDoubles(3, 3, true));
        assertEquals(6, logic1testObject.withoutDoubles(3, 3, false));
        assertEquals(5, logic1testObject.withoutDoubles(2, 3, false));
        assertEquals(9, logic1testObject.withoutDoubles(5, 4, true));
        assertEquals(9, logic1testObject.withoutDoubles(5, 4, false));
        assertEquals(11, logic1testObject.withoutDoubles(5, 5, true));
        assertEquals(10, logic1testObject.withoutDoubles(5, 5, false));
        assertEquals(7, logic1testObject.withoutDoubles(6, 6, true));
        assertEquals(12, logic1testObject.withoutDoubles(6, 6, false));
        assertEquals(7, logic1testObject.withoutDoubles(1, 6, true));
        assertEquals(7, logic1testObject.withoutDoubles(6, 1, false));
    }

    @Test
    public void maxMod5Test() {
        assertEquals(3, logic1testObject.maxMod5(2, 3));
        assertEquals(6, logic1testObject.maxMod5(6, 2));
        assertEquals(3, logic1testObject.maxMod5(3, 2));
        assertEquals(12, logic1testObject.maxMod5(8, 12));
        assertEquals(7, logic1testObject.maxMod5(7, 12));
        assertEquals(6, logic1testObject.maxMod5(11, 6));
        assertEquals(2, logic1testObject.maxMod5(2, 7));
        assertEquals(0, logic1testObject.maxMod5(7, 7));
        assertEquals(9, logic1testObject.maxMod5(9, 1));
        assertEquals(9, logic1testObject.maxMod5(9, 14));
        assertEquals(2, logic1testObject.maxMod5(1, 2));
    }

    @Test
    public void redTicketTest() {
        assertEquals(10, logic1testObject.redTicket(2, 2, 2));
        assertEquals(0, logic1testObject.redTicket(2, 2, 1));
        assertEquals(5, logic1testObject.redTicket(0, 0, 0));
        assertEquals(1, logic1testObject.redTicket(2, 0, 0));
        assertEquals(5, logic1testObject.redTicket(1, 1, 1));
        assertEquals(0, logic1testObject.redTicket(1, 2, 1));
        assertEquals(1, logic1testObject.redTicket(1, 2, 0));
        assertEquals(1, logic1testObject.redTicket(0, 2, 2));
        assertEquals(1, logic1testObject.redTicket(1, 2, 2));
        assertEquals(0, logic1testObject.redTicket(0, 2, 0));
        assertEquals(0, logic1testObject.redTicket(1, 1, 2));
    }

    @Test
    public void reenTicketTest() {
        assertEquals(0, logic1testObject.greenTicket(1, 2, 3));
        assertEquals(20, logic1testObject.greenTicket(2, 2, 2));
        assertEquals(10, logic1testObject.greenTicket(1, 1, 2));
        assertEquals(10, logic1testObject.greenTicket(2, 1, 1));
        assertEquals(10, logic1testObject.greenTicket(1, 2, 1));
        assertEquals(0, logic1testObject.greenTicket(3, 2, 1));
        assertEquals(20, logic1testObject.greenTicket(0, 0, 0));
        assertEquals(10, logic1testObject.greenTicket(2, 0, 0));
        assertEquals(0, logic1testObject.greenTicket(0, 9, 10));
        assertEquals(10, logic1testObject.greenTicket(0, 10, 0));
        assertEquals(20, logic1testObject.greenTicket(9, 9, 9));
        assertEquals(10, logic1testObject.greenTicket(9, 0, 9));
    }

    @Test
    public void blueTicketTest() {
        assertEquals(10, logic1testObject.blueTicket(9, 1, 0));
        assertEquals(0, logic1testObject.blueTicket(9, 2, 0));
        assertEquals(10, logic1testObject.blueTicket(6, 1, 4));
        assertEquals(0, logic1testObject.blueTicket(6, 1, 5));
        assertEquals(10, logic1testObject.blueTicket(10, 0, 0));
        assertEquals(5, logic1testObject.blueTicket(15, 0, 5));
        assertEquals(10, logic1testObject.blueTicket(5, 15, 5));
        assertEquals(5, logic1testObject.blueTicket(4, 11, 1));
        assertEquals(5, logic1testObject.blueTicket(13, 2, 3));
        assertEquals(0, logic1testObject.blueTicket(8, 4, 3));
        assertEquals(10, logic1testObject.blueTicket(8, 4, 2));
        assertEquals(0, logic1testObject.blueTicket(8, 4, 1));
    }

    @Test
    public void shareDigitTest() {
        assertTrue(logic1testObject.shareDigit(12, 23));
        assertFalse(logic1testObject.shareDigit(12, 43));
        assertFalse(logic1testObject.shareDigit(12, 44));
        assertTrue(logic1testObject.shareDigit(23, 12));
        assertTrue(logic1testObject.shareDigit(23, 39));
        assertFalse(logic1testObject.shareDigit(23, 19));
        assertTrue(logic1testObject.shareDigit(30, 90));
        assertFalse(logic1testObject.shareDigit(30, 91));
        assertTrue(logic1testObject.shareDigit(55, 55));
        assertFalse(logic1testObject.shareDigit(55, 44));
    }

    @Test
    public void sumLimitTest() {
        assertEquals(5, logic1testObject.sumLimit(2, 3));
        assertEquals(8, logic1testObject.sumLimit(8, 3));
        assertEquals(9, logic1testObject.sumLimit(8, 1));
        assertEquals(50, logic1testObject.sumLimit(11, 39));
        assertEquals(11, logic1testObject.sumLimit(11, 99));
        assertEquals(0, logic1testObject.sumLimit(0, 0));
        assertEquals(99, logic1testObject.sumLimit(99, 0));
        assertEquals(99, logic1testObject.sumLimit(99, 1));
        assertEquals(124, logic1testObject.sumLimit(123, 1));
        assertEquals(1, logic1testObject.sumLimit(1, 123));
        assertEquals(83, logic1testObject.sumLimit(23, 60));
        assertEquals(23, logic1testObject.sumLimit(23, 80));
        assertEquals(9001, logic1testObject.sumLimit(9000, 1));
        assertEquals(90000001, logic1testObject.sumLimit(90000000, 1));
        assertEquals(9000, logic1testObject.sumLimit(9000, 1000));
    }
}