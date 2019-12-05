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

}