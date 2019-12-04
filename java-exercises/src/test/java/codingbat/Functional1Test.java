package codingbat;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * Test cases for String1 exercises
 */
public class Functional1Test {

    @Test
    public void doublingTest(){
        Functional1 testObject = new Functional1();
        assertEquals(Arrays.asList(2, 4, 6),testObject.doubling(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(12, 16, 12, 16, -2),testObject.doubling(Arrays.asList(6, 8, 6, 8, -1)));
        assertEquals(Arrays.asList(),testObject.doubling(Arrays.asList()));
        assertEquals(Arrays.asList(10),testObject.doubling(Arrays.asList(5)));
        assertEquals(Arrays.asList(10, 20),testObject.doubling(Arrays.asList(5, 10)));
        assertEquals(Arrays.asList(16, -10, 14, 6, 218),testObject.doubling(Arrays.asList(8, -5, 7, 3, 109)));
        assertEquals(Arrays.asList(12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4),testObject.doubling(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)));
        assertEquals(Arrays.asList(6, 2, 8, 2, 10, 18),testObject.doubling(Arrays.asList(3, 1, 4, 1, 5, 9)));
    }

    @Test
    public void squareTest(){
        Functional1 testObject = new Functional1();
        assertEquals(Arrays.asList(1, 4, 9),testObject.square(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(36, 64, 36, 64, 1),testObject.square(Arrays.asList(6, 8, -6, -8, 1)));
        assertEquals(Arrays.asList(),testObject.square(Arrays.asList()));
        assertEquals(Arrays.asList(144),testObject.square(Arrays.asList(12)));
        assertEquals(Arrays.asList(25, 100),testObject.square(Arrays.asList(5, 10)));
        assertEquals(Arrays.asList(36, 9, 144, 529, 16, 1, 361, 121, 4, 9, 4),testObject.square(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)));
    }

    @Test
    public void addStarTest(){
        Functional1 testObject = new Functional1();
        assertEquals(Arrays.asList("a*", "bb*", "ccc*"),testObject.addStar(Arrays.asList("a", "bb", "ccc")));
        assertEquals(Arrays.asList("hello*", "there*"),testObject.addStar(Arrays.asList("hello", "there")));
        assertEquals(Arrays.asList("**"),testObject.addStar(Arrays.asList("*")));
        assertEquals(Arrays.asList(),testObject.addStar(Arrays.asList()));
        assertEquals(Arrays.asList("kittens*", "and*", "chocolate*", "and*"),testObject.addStar(Arrays.asList("kittens", "and", "chocolate", "and")));
        assertEquals(Arrays.asList("empty*", "string*", "*"),testObject.addStar(Arrays.asList("empty", "string", "")));
    }

    @Test
    public void copies3Test(){
        Functional1 testObject = new Functional1();
        assertEquals(Arrays.asList("aaa", "bbbbbb", "ccccccccc"),testObject.copies3(Arrays.asList("a", "bb", "ccc")));
        assertEquals(Arrays.asList("242424", "aaa", ""),testObject.copies3(Arrays.asList("24", "a", "")));
        assertEquals(Arrays.asList("hellohellohello", "theretherethere"),testObject.copies3(Arrays.asList("hello", "there")));
        assertEquals(Arrays.asList("nonono"),testObject.copies3(Arrays.asList("no")));
        assertEquals(Arrays.asList(),testObject.copies3(Arrays.asList()));
        assertEquals(Arrays.asList("thisthisthis", "andandand", "thatthatthat", "andandand"),testObject.copies3(Arrays.asList("this", "and", "that", "and")));
    }

    @Test
    public void moreYTest(){
        Functional1 testObject = new Functional1();
        assertEquals(Arrays.asList("yay", "yby", "ycy"),testObject.moreY(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("yhelloy", "ytherey"),testObject.moreY(Arrays.asList("hello", "there")));
        assertEquals(Arrays.asList("yyayy"),testObject.moreY(Arrays.asList("yay")));
        assertEquals(Arrays.asList("yy", "yay", "yxxy"),testObject.moreY(Arrays.asList("", "a", "xx")));
        assertEquals(Arrays.asList(),testObject.moreY(Arrays.asList()));
        assertEquals(Arrays.asList("yxxy", "yyyy", "yzzy"),testObject.moreY(Arrays.asList("xx", "yy", "zz")));
    }

    @Test
    public void math1Test(){
        Functional1 testObject = new Functional1();
        assertEquals(Arrays.asList(20, 30, 40),testObject.math1(Arrays.asList(1, 2, 3)));
        assertEquals(Arrays.asList(70, 90, 70, 90, 20),testObject.math1(Arrays.asList(6, 8, 6, 8, 1)));
        assertEquals(Arrays.asList(110),testObject.math1(Arrays.asList(10)));
        assertEquals(Arrays.asList(),testObject.math1(Arrays.asList()));
        assertEquals(Arrays.asList(60, 110),testObject.math1(Arrays.asList(5, 10)));
        assertEquals(Arrays.asList(0, -10, -20, -10, 0),testObject.math1(Arrays.asList(-1, -2, -3, -2, -1)));
        assertEquals(Arrays.asList(70, -20, 130, 240, 50, 20, 200, 120, 30, 40, 30),testObject.math1(Arrays.asList(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2)));
    }

    @Test
    public void rightDigitTest(){
        Functional1 testObject = new Functional1();
        assertEquals(Arrays.asList(1, 2, 3),testObject.rightDigit(Arrays.asList(1, 22, 93)));
        assertEquals(Arrays.asList(6, 8, 6, 8, 1),testObject.rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
        assertEquals(Arrays.asList(0, 0),testObject.rightDigit(Arrays.asList(10, 0)));
        assertEquals(Arrays.asList(),testObject.rightDigit(Arrays.asList()));
        assertEquals(Arrays.asList(5, 0),testObject.rightDigit(Arrays.asList(5, 10)));
        assertEquals(Arrays.asList(5, 0, 0, 0, 0),testObject.rightDigit(Arrays.asList(5, 50, 500, 5000, 5000)));
        assertEquals(Arrays.asList(6, 3, 2, 3, 4, 1, 9, 9, 2, 3, 2),testObject.rightDigit(Arrays.asList(6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2)));
    }

    @Test
    public void lowerTest(){
        Functional1 testObject = new Functional1();
        assertEquals(Arrays.asList("hello", "hi"),testObject.lower(Arrays.asList("Hello", "Hi")));
        assertEquals(Arrays.asList("aaa", "bbb", "ccc"),testObject.lower(Arrays.asList("AAA", "BBB", "ccc")));
        assertEquals(Arrays.asList("kitten", "chocolate"),testObject.lower(Arrays.asList("KitteN", "ChocolaTE")));
        assertEquals(Arrays.asList(),testObject.lower(Arrays.asList()));
        assertEquals(Arrays.asList("empty", ""),testObject.lower(Arrays.asList("EMPTY", "")));
        assertEquals(Arrays.asList("aax", "byb", "ycc", "zzz"),testObject.lower(Arrays.asList("aaX", "bYb", "Ycc", "ZZZ")));
    }

    @Test
    public void noXTest(){
        Functional1 testObject = new Functional1();
        assertEquals(Arrays.asList("a", "bb", "c"),testObject.noX(Arrays.asList("ax", "bb", "cx")));
        assertEquals(Arrays.asList("a", "bb", "c"),testObject.noX(Arrays.asList("xxax", "xbxbx", "xxcx")));
        assertEquals(Arrays.asList(""),testObject.noX(Arrays.asList("x")));
        assertEquals(Arrays.asList(""),testObject.noX(Arrays.asList("")));
        assertEquals(Arrays.asList(),testObject.noX(Arrays.asList()));
        assertEquals(Arrays.asList("the", "tai"),testObject.noX(Arrays.asList("the", "taxi")));
        assertEquals(Arrays.asList("the", "tai"),testObject.noX(Arrays.asList("the", "xxtxaxixxx")));
        assertEquals(Arrays.asList("this", "is", "the", ""),testObject.noX(Arrays.asList("this", "is", "the", "x")));
    }

}