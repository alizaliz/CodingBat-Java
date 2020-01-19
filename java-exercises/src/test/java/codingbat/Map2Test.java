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
}