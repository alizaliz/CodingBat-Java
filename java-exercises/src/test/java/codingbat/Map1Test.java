package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;

/**
 * Test cases for Map1 exercises
 */
public class Map1Test {

    private Map1 map1TestObject;

    @Before
    public void setUp() {
        map1TestObject = new Map1();
    }

    @Test
    public void mapBullyTest() {
        assertEquals(Map.of("a", "", "b", "candy"), map1TestObject.mapBully(Map.of("a", "candy", "b", "dirt")));
        assertEquals(Map.of("a", "", "b", "candy"), map1TestObject.mapBully(Map.of("a", "candy")));
        assertEquals(Map.of("a", "", "b", "candy", "c", "meh"),
                map1TestObject.mapBully(Map.of("a", "candy", "b", "carrot", "c", "meh")));
        assertEquals(Map.of("b", "carrot"), map1TestObject.mapBully(Map.of("b", "carrot")));
        assertEquals(Map.of("c", "meh"), map1TestObject.mapBully(Map.of("c", "meh")));
        assertEquals(Map.of("a", "", "b", "sparkle", "c", "meh"),
                map1TestObject.mapBully(Map.of("a", "sparkle", "c", "meh")));
    }

    @Test
    public void mapShareTest() {
        assertEquals(Map.of("a", "aaa", "b", "aaa"),
                map1TestObject.mapShare(Map.of("a", "aaa", "b", "bbb", "c", "ccc")));
        assertEquals(Map.of("b", "xyz"), map1TestObject.mapShare(Map.of("b", "xyz", "c", "ccc")));
        assertEquals(Map.of("a", "aaa", "b", "aaa", "d", "hi"),
                map1TestObject.mapShare(Map.of("a", "aaa", "c", "meh", "d", "hi")));
        assertEquals(Map.of("a", "xyz", "b", "xyz", "z", "zzz"),
                map1TestObject.mapShare(Map.of("a", "xyz", "b", "1234", "c", "yo", "z", "zzz")));
        assertEquals(Map.of("a", "xyz", "b", "1234", "c", "yo", "d", "ddd", "e", "everything"),
                map1TestObject.mapShare(Map.of("a", "xyz", "b", "1234", "c", "yo", "d", "ddd", "e", "everything")));
    }

    @Test
    public void mapABTest() {
        assertEquals(Map.of("a", "Hi", "ab", "HiThere", "b", "There"),
                map1TestObject.mapAB(Map.of("a", "Hi", "b", "There")));
        assertEquals(Map.of("a", "Hi"), map1TestObject.mapAB(Map.of("a", "Hi")));
        assertEquals(Map.of("b", "There"), map1TestObject.mapAB(Map.of("b", "There")));
        assertEquals(Map.of("c", "meh"), map1TestObject.mapAB(Map.of("c", "meh")));
        assertEquals(Map.of("a", "aaa", "ab", "nope", "b", "bbb", "c", "ccc"),
                map1TestObject.mapAB(Map.of("a", "aaa", "ab", "nope", "b", "bbb", "c", "ccc")));
        assertEquals(Map.of("ab", "nope", "b", "bbb", "c", "ccc"),
                map1TestObject.mapAB(Map.of("ab", "nope", "b", "bbb", "c", "ccc")));
    }

    @Test
    public void topping1Test() {
        assertEquals(Map.of("bread", "butter", "ice cream", "cherry"),
                map1TestObject.topping1(Map.of("ice cream", "peanuts")));
        assertEquals(Map.of("bread", "butter"), map1TestObject.topping1(Map.of()));
        assertEquals(Map.of("bread", "butter", "pancake", "syrup"),
                map1TestObject.topping1(Map.of("pancake", "syrup")));
        assertEquals(Map.of("bread", "dirt", "ice cream", "strawberries"),
                map1TestObject.topping1(Map.of("bread", "dirt", "ice cream", "strawberries")));
        assertEquals(Map.of("bread", "jam", "ice cream", "strawberries", "salad", "oil"),
                map1TestObject.topping1(Map.of("bread", "jam", "ice cream", "strawberries", "salad", "oil")));
    }

    @Test
    public void topping2Test() {
        assertEquals(Map.of("yogurt", "cherry", "ice cream", "cherry"),
                map1TestObject.topping2(Map.of("ice cream", "cherry")));
        assertEquals(Map.of("yogurt", "cherry", "spinach", "nuts", "ice cream", "cherry"),
                map1TestObject.topping2(Map.of("spinach", "dirt", "ice cream", "cherry")));
        assertEquals(Map.of("yogurt", "salt"), map1TestObject.topping2(Map.of("yogurt", "salt")));
        assertEquals(Map.of("yogurt", "salt", "bread", "butter"),
                map1TestObject.topping2(Map.of("yogurt", "salt", "bread", "butter")));
        assertEquals(Map.of(), map1TestObject.topping2(Map.of()));
        assertEquals(Map.of("yogurt", "air", "ice cream", "air", "salad", "oil"),
                map1TestObject.topping2(Map.of("ice cream", "air", "salad", "oil")));
    }

    @Test
    public void topping3Test() {
        assertEquals(Map.of("potato", "ketchup", "fries", "ketchup"),
                map1TestObject.topping3(Map.of("potato", "ketchup")));
        assertEquals(Map.of("potato", "butter", "fries", "butter"),
                map1TestObject.topping3(Map.of("potato", "butter")));
        assertEquals(Map.of("spinach", "oil", "salad", "oil", "potato", "ketchup", "fries", "ketchup"),
                map1TestObject.topping3(Map.of("salad", "oil", "potato", "ketchup")));
        assertEquals(
                Map.of("toast", "butter", "spinach", "oil", "salad", "oil", "potato", "ketchup", "fries", "ketchup"),
                map1TestObject.topping3(Map.of("toast", "butter", "salad", "oil", "potato", "ketchup")));
        assertEquals(Map.of(), map1TestObject.topping3(Map.of()));
        assertEquals(Map.of("spinach", "pepper", "salad", "pepper", "fries", "salt"),
                map1TestObject.topping3(Map.of("salad", "pepper", "fries", "salt")));
    }

    @Test
    public void mapAB2Test() {
        assertEquals(Map.of("c", "cake"), map1TestObject.mapAB2(Map.of("a", "aaa", "b", "aaa", "c", "cake")));
        assertEquals(Map.of("a", "aaa", "b", "bbb"), map1TestObject.mapAB2(Map.of("a", "aaa", "b", "bbb")));
        assertEquals(Map.of("a", "aaa", "b", "bbb", "c", "aaa"),
                map1TestObject.mapAB2(Map.of("a", "aaa", "b", "bbb", "c", "aaa")));
        assertEquals(Map.of("a", "aaa"), map1TestObject.mapAB2(Map.of("a", "aaa")));
        assertEquals(Map.of("b", "bbb"), map1TestObject.mapAB2(Map.of("b", "bbb")));
        assertEquals(Map.of("c", "ccc"), map1TestObject.mapAB2(Map.of("a", "", "b", "", "c", "ccc")));
        assertEquals(Map.of(), map1TestObject.mapAB2(Map.of()));
        assertEquals(Map.of("a", "a", "b", "b", "z", "zebra"),
                map1TestObject.mapAB2(Map.of("a", "a", "b", "b", "z", "zebra")));
    }

    @Test
    public void mapAB3Test() {
        assertEquals(Map.of("a", "aaa", "b", "aaa", "c", "cake"),
                map1TestObject.mapAB3(Map.of("a", "aaa", "c", "cake")));
        assertEquals(Map.of("a", "bbb", "b", "bbb", "c", "cake"),
                map1TestObject.mapAB3(Map.of("b", "bbb", "c", "cake")));
        assertEquals(Map.of("a", "aaa", "b", "bbb", "c", "cake"),
                map1TestObject.mapAB3(Map.of("a", "aaa", "b", "bbb", "c", "cake")));
        assertEquals(Map.of("ccc", "ccc"), map1TestObject.mapAB3(Map.of("ccc", "ccc")));
        assertEquals(Map.of("c", "a", "d", "b"), map1TestObject.mapAB3(Map.of("c", "a", "d", "b")));
        assertEquals(Map.of(), map1TestObject.mapAB3(Map.of()));
        assertEquals(Map.of("a", "", "b", ""), map1TestObject.mapAB3(Map.of("a", "")));
        assertEquals(Map.of("a", "", "b", ""), map1TestObject.mapAB3(Map.of("b", "")));
        assertEquals(Map.of("a", "", "b", ""), map1TestObject.mapAB3(Map.of("a", "", "b", "")));
        assertEquals(Map.of("aa", "aa", "a", "apple", "b", "apple", "z", "zzz"),
                map1TestObject.mapAB3(Map.of("aa", "aa", "a", "apple", "z", "zzz")));
    }

    @Test
    public void mapAB4Test() {
        assertEquals(Map.of("a", "aaa", "b", "bb", "c", "aaa"),
                map1TestObject.mapAB4(Map.of("a", "aaa", "b", "bb", "c", "cake")));
        assertEquals(Map.of("a", "aa", "b", "bbb", "c", "bbb"),
                map1TestObject.mapAB4(Map.of("a", "aa", "b", "bbb", "c", "cake")));
        assertEquals(Map.of("a", "aa", "b", "bbb", "c", "bbb"), map1TestObject.mapAB4(Map.of("a", "aa", "b", "bbb")));
        assertEquals(Map.of("a", "aaa"), map1TestObject.mapAB4(Map.of("a", "aaa")));
        assertEquals(Map.of("b", "bbb"), map1TestObject.mapAB4(Map.of("b", "bbb")));
        assertEquals(Map.of("a", "", "b", "", "c", "cake"),
                map1TestObject.mapAB4(Map.of("a", "aaa", "b", "bbb", "c", "cake")));
        assertEquals(Map.of("a", "", "b", "", "c", "cake"),
                map1TestObject.mapAB4(Map.of("a", "a", "b", "b", "c", "cake")));
        assertEquals(Map.of("a", "", "b", "b", "c", "b"),
                map1TestObject.mapAB4(Map.of("a", "", "b", "b", "c", "cake")));
        assertEquals(Map.of("a", "a", "b", "", "c", "a"),
                map1TestObject.mapAB4(Map.of("a", "a", "b", "", "c", "cake")));
        assertEquals(Map.of("c", "cat", "d", "dog"), map1TestObject.mapAB4(Map.of("c", "cat", "d", "dog")));
        assertEquals(Map.of("ccc", "ccc"), map1TestObject.mapAB4(Map.of("ccc", "ccc")));
        assertEquals(Map.of("c", "a", "d", "b"), map1TestObject.mapAB4(Map.of("c", "a", "d", "b")));
        assertEquals(Map.of(), map1TestObject.mapAB4(Map.of()));
        assertEquals(Map.of("a", "", "z", "z"), map1TestObject.mapAB4(Map.of("a", "", "z", "z")));
        assertEquals(Map.of("b", "", "z", "z"), map1TestObject.mapAB4(Map.of("b", "", "z", "z")));
    }
}