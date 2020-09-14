package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class String3Test {
    private String3 string3testObject;

    @Before
    public void setUp() {
        string3testObject = new String3();
    }

    @Test
    public void countYZTest() {
        assertEquals(2, string3testObject.countYZ("fez day"));
        assertEquals(2, string3testObject.countYZ("day fez"));
        assertEquals(2, string3testObject.countYZ("day fyyyz"));
        assertEquals(1, string3testObject.countYZ("day yak"));
        assertEquals(1, string3testObject.countYZ("day:yak"));
        assertEquals(2, string3testObject.countYZ("!!day--yaz!!"));
        assertEquals(0, string3testObject.countYZ("yak zak"));
        assertEquals(2, string3testObject.countYZ("DAY abc XYZ"));
        assertEquals(3, string3testObject.countYZ("aaz yyz my"));
        assertEquals(2, string3testObject.countYZ("y2bz"));
        assertEquals(0, string3testObject.countYZ("zxyx"));
    }
}