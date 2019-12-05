package codingbat;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * Test cases for String1 exercises
 */
public class Functional1Test {

    private Functional1 functional1TestObject;

    @Before
    public void setUp() {
        functional1TestObject = new Functional1();
    }

    @Test
    public void doublingTest(){
        assertEquals(Arrays.asList(2, 4, 6),functional1TestObject.doubling(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(12, 16, 12, 16, -2),functional1TestObject.doubling(Arrays.asList(6, 8, 6, 8, -1)));
        assertEquals(Arrays.asList(),functional1TestObject.doubling(Arrays.asList()));
        assertEquals(Arrays.asList(10),functional1TestObject.doubling(Arrays.asList(5)));
        assertEquals(Arrays.asList(10, 20),functional1TestObject.doubling(Arrays.asList(5, 10)));
        assertEquals(Arrays.asList(16, -10, 14, 6, 218),functional1TestObject.doubling(Arrays.asList(8, -5, 7, 3, 109)));
        assertEquals(Arrays.asList(12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4),functional1TestObject.doubling(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)));
        assertEquals(Arrays.asList(6, 2, 8, 2, 10, 18),functional1TestObject.doubling(Arrays.asList(3, 1, 4, 1, 5, 9)));
    }

    @Test
    public void squareTest(){
        assertEquals(Arrays.asList(1, 4, 9),functional1TestObject.square(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(36, 64, 36, 64, 1),functional1TestObject.square(Arrays.asList(6, 8, -6, -8, 1)));
        assertEquals(Arrays.asList(),functional1TestObject.square(Arrays.asList()));
        assertEquals(Arrays.asList(144),functional1TestObject.square(Arrays.asList(12)));
        assertEquals(Arrays.asList(25, 100),functional1TestObject.square(Arrays.asList(5, 10)));
        assertEquals(Arrays.asList(36, 9, 144, 529, 16, 1, 361, 121, 4, 9, 4),functional1TestObject.square(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)));
    }

    @Test
    public void addStarTest(){
        assertEquals(Arrays.asList("a*", "bb*", "ccc*"),functional1TestObject.addStar(Arrays.asList("a", "bb", "ccc")));
        assertEquals(Arrays.asList("hello*", "there*"),functional1TestObject.addStar(Arrays.asList("hello", "there")));
        assertEquals(Arrays.asList("**"),functional1TestObject.addStar(Arrays.asList("*")));
        assertEquals(Arrays.asList(),functional1TestObject.addStar(Arrays.asList()));
        assertEquals(Arrays.asList("kittens*", "and*", "chocolate*", "and*"),functional1TestObject.addStar(Arrays.asList("kittens", "and", "chocolate", "and")));
        assertEquals(Arrays.asList("empty*", "string*", "*"),functional1TestObject.addStar(Arrays.asList("empty", "string", "")));
    }

    @Test
    public void copies3Test(){
        assertEquals(Arrays.asList("aaa", "bbbbbb", "ccccccccc"),functional1TestObject.copies3(Arrays.asList("a", "bb", "ccc")));
        assertEquals(Arrays.asList("242424", "aaa", ""),functional1TestObject.copies3(Arrays.asList("24", "a", "")));
        assertEquals(Arrays.asList("hellohellohello", "theretherethere"),functional1TestObject.copies3(Arrays.asList("hello", "there")));
        assertEquals(Arrays.asList("nonono"),functional1TestObject.copies3(Arrays.asList("no")));
        assertEquals(Arrays.asList(),functional1TestObject.copies3(Arrays.asList()));
        assertEquals(Arrays.asList("thisthisthis", "andandand", "thatthatthat", "andandand"),functional1TestObject.copies3(Arrays.asList("this", "and", "that", "and")));
    }

    @Test
    public void moreYTest(){
        assertEquals(Arrays.asList("yay", "yby", "ycy"),functional1TestObject.moreY(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("yhelloy", "ytherey"),functional1TestObject.moreY(Arrays.asList("hello", "there")));
        assertEquals(Arrays.asList("yyayy"),functional1TestObject.moreY(Arrays.asList("yay")));
        assertEquals(Arrays.asList("yy", "yay", "yxxy"),functional1TestObject.moreY(Arrays.asList("", "a", "xx")));
        assertEquals(Arrays.asList(),functional1TestObject.moreY(Arrays.asList()));
        assertEquals(Arrays.asList("yxxy", "yyyy", "yzzy"),functional1TestObject.moreY(Arrays.asList("xx", "yy", "zz")));
    }

    @Test
    public void math1Test(){
        assertEquals(Arrays.asList(20, 30, 40),functional1TestObject.math1(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(70, 90, 70, 90, 20),functional1TestObject.math1(Arrays.asList(6, 8, 6, 8, 1)));
        assertEquals(Arrays.asList(110),functional1TestObject.math1(Arrays.asList(10)));
        assertEquals(Arrays.asList(),functional1TestObject.math1(Arrays.asList()));
        assertEquals(Arrays.asList(60, 110),functional1TestObject.math1(Arrays.asList(5, 10)));
        assertEquals(Arrays.asList(0, -10, -20, -10, 0),functional1TestObject.math1(Arrays.asList(-1, -2, -3, -2, -1)));
        assertEquals(Arrays.asList(70, -20, 130, 240, 50, 20, 200, 120, 30, 40, 30),functional1TestObject.math1(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)));
    }

    @Test
    public void rightDigitTest(){
        assertEquals(Arrays.asList(1, 2, 3),functional1TestObject.rightDigit(Arrays.asList(1, 22, 93)));
        assertEquals(Arrays.asList(6, 8, 6, 8, 1),functional1TestObject.rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
        assertEquals(Arrays.asList(0, 0),functional1TestObject.rightDigit(Arrays.asList(10, 0)));
        assertEquals(Arrays.asList(),functional1TestObject.rightDigit(Arrays.asList()));
        assertEquals(Arrays.asList(5, 0),functional1TestObject.rightDigit(Arrays.asList(5, 10)));
        assertEquals(Arrays.asList(5, 0, 0, 0, 0),functional1TestObject.rightDigit(Arrays.asList(5, 50, 500, 5000, 5000)));
        assertEquals(Arrays.asList(6, 3, 2, 3, 4, 1, 9, 9, 2, 3, 2),functional1TestObject.rightDigit(Arrays.asList(6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2)));
    }

    @Test
    public void lowerTest(){
        assertEquals(Arrays.asList("hello", "hi"),functional1TestObject.lower(Arrays.asList("Hello", "Hi")));
        assertEquals(Arrays.asList("aaa", "bbb", "ccc"),functional1TestObject.lower(Arrays.asList("AAA", "BBB", "ccc")));
        assertEquals(Arrays.asList("kitten", "chocolate"),functional1TestObject.lower(Arrays.asList("KitteN", "ChocolaTE")));
        assertEquals(Arrays.asList(),functional1TestObject.lower(Arrays.asList()));
        assertEquals(Arrays.asList("empty", ""),functional1TestObject.lower(Arrays.asList("EMPTY", "")));
        assertEquals(Arrays.asList("aax", "byb", "ycc", "zzz"),functional1TestObject.lower(Arrays.asList("aaX", "bYb", "Ycc", "ZZZ")));
    }

    @Test
    public void noXTest(){
        assertEquals(Arrays.asList("a", "bb", "c"),functional1TestObject.noX(Arrays.asList("ax", "bb", "cx")));
        assertEquals(Arrays.asList("a", "bb", "c"),functional1TestObject.noX(Arrays.asList("xxax", "xbxbx", "xxcx")));
        assertEquals(Arrays.asList(""),functional1TestObject.noX(Arrays.asList("x")));
        assertEquals(Arrays.asList(""),functional1TestObject.noX(Arrays.asList("")));
        assertEquals(Arrays.asList(),functional1TestObject.noX(Arrays.asList()));
        assertEquals(Arrays.asList("the", "tai"),functional1TestObject.noX(Arrays.asList("the", "taxi")));
        assertEquals(Arrays.asList("the", "tai"),functional1TestObject.noX(Arrays.asList("the", "xxtxaxixxx")));
        assertEquals(Arrays.asList("this", "is", "the", ""),functional1TestObject.noX(Arrays.asList("this", "is", "the", "x")));
    }

}