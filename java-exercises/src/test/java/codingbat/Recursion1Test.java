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

    @Test
    public void bunnyEarsTest() {
        assertEquals(0, recursion1TestObject.bunnyEars(0));
        assertEquals(2, recursion1TestObject.bunnyEars(1));
        assertEquals(4, recursion1TestObject.bunnyEars(2));
        assertEquals(6, recursion1TestObject.bunnyEars(3));
        assertEquals(8, recursion1TestObject.bunnyEars(4));
        assertEquals(10, recursion1TestObject.bunnyEars(5));
        assertEquals(24, recursion1TestObject.bunnyEars(12));
        assertEquals(100, recursion1TestObject.bunnyEars(50));
        assertEquals(468, recursion1TestObject.bunnyEars(234));
    }

    @Test
    public void fibonacciTest() {
        assertEquals(0, recursion1TestObject.fibonacci(0));
        assertEquals(1, recursion1TestObject.fibonacci(1));
        assertEquals(1, recursion1TestObject.fibonacci(2));
        assertEquals(2, recursion1TestObject.fibonacci(3));
        assertEquals(3, recursion1TestObject.fibonacci(4));
        assertEquals(5, recursion1TestObject.fibonacci(5));
        assertEquals(8, recursion1TestObject.fibonacci(6));
        assertEquals(13, recursion1TestObject.fibonacci(7));
    }

    @Test
    public void bunnyEars2Test() {
        assertEquals(0, recursion1TestObject.bunnyEars2(0));
        assertEquals(2, recursion1TestObject.bunnyEars2(1));
        assertEquals(5, recursion1TestObject.bunnyEars2(2));
        assertEquals(7, recursion1TestObject.bunnyEars2(3));
        assertEquals(10, recursion1TestObject.bunnyEars2(4));
        assertEquals(12, recursion1TestObject.bunnyEars2(5));
        assertEquals(15, recursion1TestObject.bunnyEars2(6));
        assertEquals(25, recursion1TestObject.bunnyEars2(10));
    }

    @Test
    public void triagleTest() {
        assertEquals(0, recursion1TestObject.triangle(0));
        assertEquals(1, recursion1TestObject.triangle(1));
        assertEquals(3, recursion1TestObject.triangle(2));
        assertEquals(6, recursion1TestObject.triangle(3));
        assertEquals(10, recursion1TestObject.triangle(4));
        assertEquals(15, recursion1TestObject.triangle(5));
        assertEquals(21, recursion1TestObject.triangle(6));
        assertEquals(28, recursion1TestObject.triangle(7));
    }

    @Test
    public void sumDigitsTest() {
        assertEquals(9, recursion1TestObject.sumDigits(126));
        assertEquals(13, recursion1TestObject.sumDigits(49));
        assertEquals(3, recursion1TestObject.sumDigits(12));
        assertEquals(1, recursion1TestObject.sumDigits(10));
        assertEquals(1, recursion1TestObject.sumDigits(1));
        assertEquals(0, recursion1TestObject.sumDigits(0));
        assertEquals(10, recursion1TestObject.sumDigits(730));
        assertEquals(4, recursion1TestObject.sumDigits(1111));
        assertEquals(5, recursion1TestObject.sumDigits(11111));
        assertEquals(3, recursion1TestObject.sumDigits(10110));
        assertEquals(10, recursion1TestObject.sumDigits(235));
    }

    @Test
    public void count7Test() {
        assertEquals(2, recursion1TestObject.count7(717));
        assertEquals(1, recursion1TestObject.count7(7));
        assertEquals(0, recursion1TestObject.count7(123));
        assertEquals(2, recursion1TestObject.count7(77));
        assertEquals(1, recursion1TestObject.count7(7123));
        assertEquals(3, recursion1TestObject.count7(771237));
        assertEquals(4, recursion1TestObject.count7(771737));
        assertEquals(2, recursion1TestObject.count7(47571));
        assertEquals(6, recursion1TestObject.count7(777777));
        assertEquals(4, recursion1TestObject.count7(70701277));
        assertEquals(5, recursion1TestObject.count7(777576197));
        assertEquals(0, recursion1TestObject.count7(99999));
        assertEquals(1, recursion1TestObject.count7(99799));
    }

    @Test
    public void cont8Test() {
        assertEquals(1, recursion1TestObject.count8(8));
        assertEquals(2, recursion1TestObject.count8(818));
        assertEquals(4, recursion1TestObject.count8(8818));
        assertEquals(4, recursion1TestObject.count8(8088));
        assertEquals(0, recursion1TestObject.count8(123));
        assertEquals(2, recursion1TestObject.count8(81238));
        assertEquals(6, recursion1TestObject.count8(88788));
        assertEquals(1, recursion1TestObject.count8(8234));
        assertEquals(1, recursion1TestObject.count8(2348));
        assertEquals(3, recursion1TestObject.count8(23884));
        assertEquals(0, recursion1TestObject.count8(0));
        assertEquals(5, recursion1TestObject.count8(1818188));
        assertEquals(5, recursion1TestObject.count8(8818181));
        assertEquals(1, recursion1TestObject.count8(1080));
        assertEquals(3, recursion1TestObject.count8(188));
        assertEquals(9, recursion1TestObject.count8(88888));
        assertEquals(2, recursion1TestObject.count8(9898));
        assertEquals(1, recursion1TestObject.count8(78));
    }

    @Test
    public void powerNTest() {
        assertEquals(3, recursion1TestObject.powerN(3, 1));
        assertEquals(9, recursion1TestObject.powerN(3, 2));
        assertEquals(27, recursion1TestObject.powerN(3, 3));
        assertEquals(2, recursion1TestObject.powerN(2, 1));
        assertEquals(4, recursion1TestObject.powerN(2, 2));
        assertEquals(8, recursion1TestObject.powerN(2, 3));
        assertEquals(16, recursion1TestObject.powerN(2, 4));
        assertEquals(32, recursion1TestObject.powerN(2, 5));
        assertEquals(10, recursion1TestObject.powerN(10, 1));
        assertEquals(100, recursion1TestObject.powerN(10, 2));
        assertEquals(1000, recursion1TestObject.powerN(10, 3));
    }
}