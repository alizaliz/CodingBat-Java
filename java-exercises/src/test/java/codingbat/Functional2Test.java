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

    @Test
    public void noZTest() {
        assertEquals(Arrays.asList("aaa", "bbb"), functional2TestObject.noZ(Arrays.asList("aaa", "bbb", "aza")));
        assertEquals(Arrays.asList("hi"), functional2TestObject.noZ(Arrays.asList("hziz", "hzello", "hi")));
        assertEquals(Arrays.asList("hello", "are"),
                functional2TestObject.noZ(Arrays.asList("hello", "howz", "are", "youz")));
        assertEquals(Arrays.asList(), functional2TestObject.noZ(Arrays.asList()));
        assertEquals(Arrays.asList(""), functional2TestObject.noZ(Arrays.asList("")));
        assertEquals(Arrays.asList("x", "y"), functional2TestObject.noZ(Arrays.asList("x", "y", "z")));
    }

    @Test
    public void noLongTest() {
        assertEquals(Arrays.asList("not", "too"),
                functional2TestObject.noLong(Arrays.asList("this", "not", "too", "long")));
        assertEquals(Arrays.asList("a", "bbb"), functional2TestObject.noLong(Arrays.asList("a", "bbb", "cccc")));
        assertEquals(Arrays.asList(), functional2TestObject.noLong(Arrays.asList("cccc", "cccc", "cccc")));
        assertEquals(Arrays.asList(), functional2TestObject.noLong(Arrays.asList()));
        assertEquals(Arrays.asList(""), functional2TestObject.noLong(Arrays.asList("")));
        assertEquals(Arrays.asList(""), functional2TestObject.noLong(Arrays.asList("empty", "", "empty")));
        assertEquals(Arrays.asList("a"), functional2TestObject.noLong(Arrays.asList("a")));
        assertEquals(Arrays.asList("bbb", "***", "333"),
                functional2TestObject.noLong(Arrays.asList("aaaa", "bbb", "***", "333")));
    }

    @Test
    public void no34Test() {
        assertEquals(Arrays.asList("a", "bb"), functional2TestObject.no34(Arrays.asList("a", "bb", "ccc")));
        assertEquals(Arrays.asList("a", "bb"), functional2TestObject.no34(Arrays.asList("a", "bb", "ccc", "dddd")));
        assertEquals(Arrays.asList("apple"), functional2TestObject.no34(Arrays.asList("ccc", "dddd", "apple")));
        assertEquals(Arrays.asList(), functional2TestObject.no34(Arrays.asList("this", "not", "too", "long")));
        assertEquals(Arrays.asList("a", "xx"), functional2TestObject.no34(Arrays.asList("a", "bbb", "cccc", "xx")));
        assertEquals(Arrays.asList("xxxxxxx"), functional2TestObject.no34(Arrays.asList("dddd", "ddd", "xxxxxxx")));
        assertEquals(Arrays.asList(), functional2TestObject.no34(Arrays.asList()));
        assertEquals(Arrays.asList(""), functional2TestObject.no34(Arrays.asList("")));
        assertEquals(Arrays.asList("empty", "", "empty"),
                functional2TestObject.no34(Arrays.asList("empty", "", "empty")));
        assertEquals(Arrays.asList("a"), functional2TestObject.no34(Arrays.asList("a")));
        assertEquals(Arrays.asList("*****"), functional2TestObject.no34(Arrays.asList("aaaa", "bbb", "*****", "333")));
    }

    @Test
    public void noYYTest(){
        assertEquals(Arrays.asList("ay", "by", "cy"), functional2TestObject.noYY(Arrays.asList("a", "b", "c")));	
        assertEquals(Arrays.asList("ay", "by"), functional2TestObject.noYY(Arrays.asList("a", "b", "cy")));
        assertEquals(Arrays.asList("xxy", "yay", "zzy"), functional2TestObject.noYY(Arrays.asList("xx", "ya", "zz")));
        assertEquals(Arrays.asList("xxy", "zzy"), functional2TestObject.noYY(Arrays.asList("xx", "yay", "zz")));
        assertEquals(Arrays.asList("zzzy"), functional2TestObject.noYY(Arrays.asList("yyx", "y", "zzz")));
        assertEquals(Arrays.asList("helloy", "therey"), functional2TestObject.noYY(Arrays.asList("hello", "there")));	
        assertEquals(Arrays.asList("yay"), functional2TestObject.noYY(Arrays.asList("ya")));
        assertEquals(Arrays.asList(), functional2TestObject.noYY(Arrays.asList()));
        assertEquals(Arrays.asList("y"), functional2TestObject.noYY(Arrays.asList("")));
        assertEquals(Arrays.asList("xxy", "zzy"), functional2TestObject.noYY(Arrays.asList("xx", "yy", "zz")));
    }
}