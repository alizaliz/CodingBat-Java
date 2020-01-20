package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;

/**
 * Test cases for Map2 exercises
 */
public class Map2Test {

    private Map2 map2TestObject;

    @Before
    public void setUp() {
        map2TestObject = new Map2();
    }

    @Test
    public void word0Test() {
        assertEquals(Map.of("a", 0, "b", 0), map2TestObject.word0(new String[] { "a", "b", "a", "b" }));
        assertEquals(Map.of("a", 0, "b", 0, "c", 0), map2TestObject.word0(new String[] { "a", "b", "a", "c", "b" }));
        assertEquals(Map.of("a", 0, "b", 0, "c", 0), map2TestObject.word0(new String[] { "c", "b", "a" }));
        assertEquals(Map.of("c", 0), map2TestObject.word0(new String[] { "c", "c", "c", "c" }));
        assertEquals(Map.of(), map2TestObject.word0(new String[] {}));
    }

    @Test
    public void wordLenTest() {
        assertEquals(Map.of("bb", 2, "a", 1), map2TestObject.wordLen(new String[] { "a", "bb", "a", "bb" }));
        assertEquals(Map.of("that", 4, "and", 3, "this", 4),
                map2TestObject.wordLen(new String[] { "this", "and", "that", "and" }));
        assertEquals(Map.of("code", 4, "bug", 3),
                map2TestObject.wordLen(new String[] { "code", "code", "code", "bug" }));
        assertEquals(Map.of(), map2TestObject.wordLen(new String[] {}));
        assertEquals(Map.of("z", 1), map2TestObject.wordLen(new String[] { "z" }));
    }

    @Test
    public void pairsTest() {
        assertEquals(Map.of("b", "g", "c", "e"), map2TestObject.pairs(new String[] { "code", "bug" }));
        assertEquals(Map.of("m", "n"), map2TestObject.pairs(new String[] { "man", "moon", "main" }));
        assertEquals(Map.of("g", "d", "m", "n", "n", "t"),
                map2TestObject.pairs(new String[] { "man", "moon", "good", "night" }));
        assertEquals(Map.of(), map2TestObject.pairs(new String[] {}));
        assertEquals(Map.of("a", "a", "b", "b"), map2TestObject.pairs(new String[] { "a", "b" }));
        assertEquals(Map.of("a", "d", "c", "s"), map2TestObject.pairs(new String[] { "are", "codes", "and", "cods" }));
        assertEquals(Map.of("a", "e", "b", "a", "c", "e", "t", "a"),
                map2TestObject.pairs(new String[] { "apple", "banana", "tea", "coffee" }));
    }
}