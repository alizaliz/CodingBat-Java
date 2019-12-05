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
    public void setUp(){
        map1TestObject = new Map1();
    }

    @Test
    public void mapBullyTest(){
        assertEquals( Map.of("a", "", "b", "candy") , map1TestObject.mapBully(Map.of("a","candy", "b", "dirt")));
        assertEquals( Map.of("a", "", "b", "candy") , map1TestObject.mapBully(Map.of("a","candy")));
        assertEquals( Map.of("a", "", "b", "candy", "c", "meh") , map1TestObject.mapBully(Map.of("a", "candy", "b", "carrot", "c", "meh")));
        assertEquals( Map.of("b", "carrot") , map1TestObject.mapBully(Map.of("b", "carrot")));
        assertEquals( Map.of("c", "meh") , map1TestObject.mapBully(Map.of("c", "meh")));
        assertEquals( Map.of("a", "", "b", "sparkle", "c", "meh") , map1TestObject.mapBully(Map.of("a", "sparkle", "c", "meh")));
    }

    @Test
    public void mapShareTest(){
        assertEquals( Map.of("a", "aaa", "b", "aaa") , map1TestObject.mapShare(Map.of("a", "aaa", "b", "bbb", "c", "ccc")));
        assertEquals( Map.of("b", "xyz") , map1TestObject.mapShare(Map.of("b", "xyz", "c", "ccc")));
        assertEquals( Map.of("a", "aaa", "b", "aaa", "d", "hi") , map1TestObject.mapShare(Map.of("a", "aaa", "c", "meh", "d", "hi")));
        assertEquals( Map.of("a", "xyz", "b", "xyz", "z", "zzz") , map1TestObject.mapShare(Map.of("a", "xyz", "b", "1234", "c", "yo", "z", "zzz")));
        assertEquals( Map.of("a", "xyz", "b", "1234", "c", "yo", "d", "ddd", "e", "everything") , map1TestObject.mapShare(Map.of("a", "xyz", "b", "1234", "c", "yo", "d", "ddd", "e", "everything")));
    }

}