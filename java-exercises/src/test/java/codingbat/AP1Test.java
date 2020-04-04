
package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;

/**
 * Test cases for AP-1 exercises
 */
public class AP1Test {
        private AP1 ap1TestObject;

        @Before
        public void setUp() {
                ap1TestObject = new AP1();
        }

        @Test
        public void scoresIncreasingTest() {
                assertTrue(ap1TestObject.scoresIncreasing(new int[] { 1, 3, 4 }));
                assertFalse(ap1TestObject.scoresIncreasing(new int[] { 1, 3, 2 }));
                assertTrue(ap1TestObject.scoresIncreasing(new int[] { 1, 1, 4 }));
                assertTrue(ap1TestObject.scoresIncreasing(new int[] { 1, 1, 2, 4, 4, 7 }));
                assertFalse(ap1TestObject.scoresIncreasing(new int[] { 1, 1, 2, 4, 3, 7 }));
                assertTrue(ap1TestObject.scoresIncreasing(new int[] { -5, 4, 11 }));
        }

        @Test
        public void scores100Test() {
                assertTrue(ap1TestObject.scores100(new int[] { 1, 100, 100 }));
                assertFalse(ap1TestObject.scores100(new int[] { 1, 100, 99, 100 }));
                assertTrue(ap1TestObject.scores100(new int[] { 100, 1, 100, 100 }));
                assertFalse(ap1TestObject.scores100(new int[] { 100, 1, 100, 1 }));
                assertFalse(ap1TestObject.scores100(new int[] { 1, 2, 3, 4, 5 }));
                assertFalse(ap1TestObject.scores100(new int[] { 1, 2, 100, 4, 5 }));
        }

        @Test
        public void scoreClumpTest() {
                assertTrue(ap1TestObject.scoresClump(new int[] { 3, 4, 5 }));
                assertFalse(ap1TestObject.scoresClump(new int[] { 3, 4, 6 }));
                assertTrue(ap1TestObject.scoresClump(new int[] { 1, 3, 5, 5 }));
                assertTrue(ap1TestObject.scoresClump(new int[] { 2, 4, 5, 6 }));
                assertFalse(ap1TestObject.scoresClump(new int[] { 2, 4, 5, 7 }));
                assertTrue(ap1TestObject.scoresClump(new int[] { 2, 4, 4, 7 }));
                assertFalse(ap1TestObject.scoresClump(new int[] { 3, 3, 6, 7, 9 }));
                assertTrue(ap1TestObject.scoresClump(new int[] { 3, 3, 7, 7, 9 }));
                assertFalse(ap1TestObject.scoresClump(new int[] { 4, 5, 8 }));
        }

        @Test
        public void scoresAverageTest() {
                assertEquals(4, ap1TestObject.scoresAverage(new int[] { 2, 2, 4, 4 }));
                assertEquals(4, ap1TestObject.scoresAverage(new int[] { 4, 4, 4, 2, 2, 2 }));
                assertEquals(4, ap1TestObject.scoresAverage(new int[] { 3, 4, 5, 1, 2, 3 }));
                assertEquals(6, ap1TestObject.scoresAverage(new int[] { 5, 6 }));
                assertEquals(5, ap1TestObject.scoresAverage(new int[] { 5, 4 }));
                assertEquals(5, ap1TestObject.scoresAverage(new int[] { 5, 4, 5, 6, 2, 1, 2, 3 }));
        }

        @Test
        public void wordsCountTest() {
                assertEquals(2, ap1TestObject.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 1));
                assertEquals(1, ap1TestObject.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 3));
                assertEquals(0, ap1TestObject.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 4));
                assertEquals(2, ap1TestObject.wordsCount(new String[] { "xx", "yyy", "x", "yy", "z" }, 1));
                assertEquals(2, ap1TestObject.wordsCount(new String[] { "xx", "yyy", "x", "yy", "z" }, 2));
                assertEquals(1, ap1TestObject.wordsCount(new String[] { "xx", "yyy", "x", "yy", "z" }, 3));
        }

        @Test
        public void wordsFrontTest() {
                assertArrayEquals(new String[] { "a" },
                                ap1TestObject.wordsFront(new String[] { "a", "b", "c", "d" }, 1));
                assertArrayEquals(new String[] { "a", "b" },
                                ap1TestObject.wordsFront(new String[] { "a", "b", "c", "d" }, 2));
                assertArrayEquals(new String[] { "a", "b", "c" },
                                ap1TestObject.wordsFront(new String[] { "a", "b", "c", "d" }, 3));
                assertArrayEquals(new String[] { "a", "b", "c", "d" },
                                ap1TestObject.wordsFront(new String[] { "a", "b", "c", "d" }, 4));
                assertArrayEquals(new String[] { "Hi" }, ap1TestObject.wordsFront(new String[] { "Hi", "There" }, 1));
                assertArrayEquals(new String[] { "Hi", "There" },
                                ap1TestObject.wordsFront(new String[] { "Hi", "There" }, 2));
        }

        @Test
        public void wordsWithoutListTest() {
                assertEquals(Arrays.asList("bb", "ccc"),
                                ap1TestObject.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 1));
                assertEquals(Arrays.asList("a", "bb", "b"),
                                ap1TestObject.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 3));
                assertEquals(Arrays.asList("a", "bb", "b", "ccc"),
                                ap1TestObject.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 4));
                assertEquals(Arrays.asList("xx", "yyy", "yy"),
                                ap1TestObject.wordsWithoutList(new String[] { "xx", "yyy", "x", "yy", "z" }, 1));
                assertEquals(Arrays.asList("yyy", "x", "z"),
                                ap1TestObject.wordsWithoutList(new String[] { "xx", "yyy", "x", "yy", "z" }, 2));
        }

        @Test
        public void hasOneTest() {
                assertTrue(ap1TestObject.hasOne(10));
                assertFalse(ap1TestObject.hasOne(22));
                assertFalse(ap1TestObject.hasOne(220));
                assertTrue(ap1TestObject.hasOne(212));
                assertTrue(ap1TestObject.hasOne(1));
                assertFalse(ap1TestObject.hasOne(9));
                assertTrue(ap1TestObject.hasOne(211112));
                assertTrue(ap1TestObject.hasOne(121121));
                assertFalse(ap1TestObject.hasOne(222222));
                assertTrue(ap1TestObject.hasOne(56156));
                assertFalse(ap1TestObject.hasOne(56556));
        }

        @Test
        public void divideSelfTest() {
                assertTrue(ap1TestObject.dividesSelf(128));
                assertTrue(ap1TestObject.dividesSelf(12));
                assertFalse(ap1TestObject.dividesSelf(120));
                assertTrue(ap1TestObject.dividesSelf(122));
                assertFalse(ap1TestObject.dividesSelf(13));
                assertFalse(ap1TestObject.dividesSelf(32));
                assertTrue(ap1TestObject.dividesSelf(22));
                assertFalse(ap1TestObject.dividesSelf(42));
                assertTrue(ap1TestObject.dividesSelf(212));
                assertFalse(ap1TestObject.dividesSelf(213));
                assertTrue(ap1TestObject.dividesSelf(162));
        }

        @Test
        public void copyEvensTest() {
                assertArrayEquals(new int[] { 2, 4 }, ap1TestObject.copyEvens(new int[] { 3, 2, 4, 5, 8 }, 2));
                assertArrayEquals(new int[] { 2, 4, 8 }, ap1TestObject.copyEvens(new int[] { 3, 2, 4, 5, 8 }, 3));
                assertArrayEquals(new int[] { 6, 2, 4 }, ap1TestObject.copyEvens(new int[] { 6, 1, 2, 4, 5, 8 }, 3));
                assertArrayEquals(new int[] { 6, 2, 4, 8 }, ap1TestObject.copyEvens(new int[] { 6, 1, 2, 4, 5, 8 }, 4));
                assertArrayEquals(new int[] { 4 }, ap1TestObject.copyEvens(new int[] { 3, 1, 4, 1, 5 }, 1));
                assertArrayEquals(new int[] { 2 }, ap1TestObject.copyEvens(new int[] { 2 }, 1));
                assertArrayEquals(new int[] { 6, 2 }, ap1TestObject.copyEvens(new int[] { 6, 2, 4, 8 }, 2));
                assertArrayEquals(new int[] { 6, 2, 4 }, ap1TestObject.copyEvens(new int[] { 6, 2, 4, 8 }, 3));
                assertArrayEquals(new int[] { 6, 2, 4, 8 }, ap1TestObject.copyEvens(new int[] { 6, 2, 4, 8 }, 4));
                assertArrayEquals(new int[] { 8 }, ap1TestObject.copyEvens(new int[] { 1, 8, 4 }, 1));
                assertArrayEquals(new int[] { 8, 4 }, ap1TestObject.copyEvens(new int[] { 1, 8, 4 }, 2));
                assertArrayEquals(new int[] { 2, 8 }, ap1TestObject.copyEvens(new int[] { 2, 8, 4 }, 2));
        }

        @Test
        public void copyEndy() {
                assertArrayEquals(new int[] { 9, 90 }, ap1TestObject.copyEndy(new int[] { 9, 11, 90, 22, 6 }, 2));
                assertArrayEquals(new int[] { 9, 90, 6 }, ap1TestObject.copyEndy(new int[] { 9, 11, 90, 22, 6 }, 3));
                assertArrayEquals(new int[] { 1, 1 }, ap1TestObject.copyEndy(new int[] { 12, 1, 1, 13, 0, 20 }, 2));
                assertArrayEquals(new int[] { 1, 1, 0 }, ap1TestObject.copyEndy(new int[] { 12, 1, 1, 13, 0, 20 }, 3));
                assertArrayEquals(new int[] { 0 }, ap1TestObject.copyEndy(new int[] { 0 }, 1));
                assertArrayEquals(new int[] { 10, 90 }, ap1TestObject.copyEndy(new int[] { 10, 11, 90 }, 2));
                assertArrayEquals(new int[] { 90, 100 }, ap1TestObject.copyEndy(new int[] { 90, 22, 100 }, 2));
                assertArrayEquals(new int[] { 10 }, ap1TestObject.copyEndy(new int[] { 12, 11, 10, 89, 101, 4 }, 1));
                assertArrayEquals(new int[] { 2, 2 }, ap1TestObject.copyEndy(new int[] { 13, 2, 2, 0 }, 2));
                assertArrayEquals(new int[] { 2, 2, 0 }, ap1TestObject.copyEndy(new int[] { 13, 2, 2, 0 }, 3));
                assertArrayEquals(new int[] { 2, 2 }, ap1TestObject.copyEndy(new int[] { 13, 2, 13, 2, 0, 30 }, 2));
                assertArrayEquals(new int[] { 2, 2, 0 }, ap1TestObject.copyEndy(new int[] { 13, 2, 13, 2, 0, 30 }, 3));
        }

        @Test
        public void matchUPTest() {
                assertEquals(1, ap1TestObject.matchUp(new String[] { "aa", "bb", "cc" },
                                new String[] { "aaa", "xx", "bb" }));
                assertEquals(2, ap1TestObject.matchUp(new String[] { "aa", "bb", "cc" },
                                new String[] { "aaa", "b", "bb" }));
                assertEquals(1, ap1TestObject.matchUp(new String[] { "aa", "bb", "cc" },
                                new String[] { "", "", "ccc" }));
                assertEquals(1, ap1TestObject.matchUp(new String[] { "", "", "ccc" },
                                new String[] { "aa", "bb", "cc" }));
                assertEquals(0, ap1TestObject.matchUp(new String[] { "", "", "" }, new String[] { "", "bb", "cc" }));
                assertEquals(0, ap1TestObject.matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "", "", "" }));
                assertEquals(1, ap1TestObject.matchUp(new String[] { "aa", "", "ccc" },
                                new String[] { "", "bb", "cc" }));
                assertEquals(0, ap1TestObject.matchUp(new String[] { "x", "y", "z" }, new String[] { "y", "z", "x" }));
                assertEquals(1, ap1TestObject.matchUp(new String[] { "", "y", "z" }, new String[] { "", "y", "x" }));
                assertEquals(3, ap1TestObject.matchUp(new String[] { "x", "y", "z" },
                                new String[] { "xx", "yyy", "zzz" }));
                assertEquals(2, ap1TestObject.matchUp(new String[] { "x", "y", "z" },
                                new String[] { "xx", "yyy", "" }));
                assertEquals(3, ap1TestObject.matchUp(new String[] { "b", "x", "y", "z" },
                                new String[] { "a", "xx", "yyy", "zzz" }));
                assertEquals(1, ap1TestObject.matchUp(new String[] { "aaa", "bb", "c" },
                                new String[] { "aaa", "xx", "bb" }));
        }

        @Test
        public void scoreUpTest() {
                assertEquals(6, ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b" },
                                new String[] { "a", "c", "b", "c" }));
                assertEquals(11, ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b" },
                                new String[] { "a", "a", "b", "c" }));
                assertEquals(16, ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b" },
                                new String[] { "a", "a", "b", "b" }));
                assertEquals(3, ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b" },
                                new String[] { "?", "c", "b", "?" }));
                assertEquals(-1, ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b" },
                                new String[] { "?", "c", "?", "?" }));
                assertEquals(7, ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b" },
                                new String[] { "c", "?", "b", "b" }));
                assertEquals(3, ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b" },
                                new String[] { "c", "?", "b", "?" }));
                assertEquals(2, ap1TestObject.scoreUp(new String[] { "a", "b", "c" }, new String[] { "a", "c", "b" }));
                assertEquals(4, ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b", "c", "c" },
                                new String[] { "a", "c", "a", "c", "a", "c" }));
                assertEquals(6, ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b", "c", "c" },
                                new String[] { "a", "c", "?", "?", "a", "c" }));
                assertEquals(11, ap1TestObject.scoreUp(new String[] { "a", "a", "b", "b", "c", "c" },
                                new String[] { "a", "c", "?", "?", "c", "c" }));
                assertEquals(12, ap1TestObject.scoreUp(new String[] { "a", "b", "c" }, new String[] { "a", "b", "c" }));
        }

        @Test
        public void wordsWithoutTest() {
                assertArrayEquals(new String[] { "b", "c" },
                                ap1TestObject.wordsWithout(new String[] { "a", "b", "c", "a" }, "a"));
                assertArrayEquals(new String[] { "a", "c", "a" },
                                ap1TestObject.wordsWithout(new String[] { "a", "b", "c", "a" }, "b"));
                assertArrayEquals(new String[] { "a", "b", "a" },
                                ap1TestObject.wordsWithout(new String[] { "a", "b", "c", "a" }, "c"));
                assertArrayEquals(new String[] { "c", "a", "a" },
                                ap1TestObject.wordsWithout(new String[] { "b", "c", "a", "a" }, "b"));
                assertArrayEquals(new String[] { "xx", "yyy", "yy" },
                                ap1TestObject.wordsWithout(new String[] { "xx", "yyy", "x", "yy", "x" }, "x"));
                assertArrayEquals(new String[] { "xx", "yyy", "x", "x" },
                                ap1TestObject.wordsWithout(new String[] { "xx", "yyy", "x", "yy", "x" }, "yy"));
                assertArrayEquals(new String[] { "ab", "ac" },
                                ap1TestObject.wordsWithout(new String[] { "aa", "ab", "ac", "aa" }, "aa"));
        }

        @Test
        public void scoresSpecialTest() {
                assertEquals(40, ap1TestObject.scoresSpecial(new int[] { 12, 10, 4 }, new int[] { 2, 20, 30 }));
                assertEquals(40, ap1TestObject.scoresSpecial(new int[] { 20, 10, 4 }, new int[] { 2, 20, 10 }));
                assertEquals(20, ap1TestObject.scoresSpecial(new int[] { 12, 11, 4 }, new int[] { 2, 20, 31 }));
                assertEquals(50, ap1TestObject.scoresSpecial(new int[] { 1, 20, 2, 50 }, new int[] { 3, 4, 5 }));
                assertEquals(50, ap1TestObject.scoresSpecial(new int[] { 3, 4, 5 }, new int[] { 1, 50, 2, 20 }));
                assertEquals(50, ap1TestObject.scoresSpecial(new int[] { 10, 4, 20, 30 }, new int[] { 20 }));
                assertEquals(50, ap1TestObject.scoresSpecial(new int[] { 10, 4, 20, 30 }, new int[] { 20 }));
                assertEquals(50, ap1TestObject.scoresSpecial(new int[] { 10, 4, 20, 30 }, new int[] { 3, 20, 99 }));
                assertEquals(60, ap1TestObject.scoresSpecial(new int[] { 10, 4, 20, 30 }, new int[] { 30, 20, 99 }));
                assertEquals(0, ap1TestObject.scoresSpecial(new int[] {}, new int[] { 2 }));
                assertEquals(20, ap1TestObject.scoresSpecial(new int[] {}, new int[] { 20 }));
                assertEquals(40, ap1TestObject.scoresSpecial(new int[] { 14, 10, 4 }, new int[] { 4, 20, 30 }));
        }

        @Test
        public void sumHeightsTest() {
                assertEquals(6, ap1TestObject.sumHeights(new int[] { 5, 3, 6, 7, 2 }, 2, 4));
                assertEquals(2, ap1TestObject.sumHeights(new int[] { 5, 3, 6, 7, 2 }, 0, 1));
                assertEquals(11, ap1TestObject.sumHeights(new int[] { 5, 3, 6, 7, 2 }, 0, 4));
                assertEquals(0, ap1TestObject.sumHeights(new int[] { 5, 3, 6, 7, 2 }, 1, 1));
                assertEquals(3, ap1TestObject.sumHeights(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 0, 3));
                assertEquals(11, ap1TestObject.sumHeights(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 4, 8));
                assertEquals(8, ap1TestObject.sumHeights(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 7, 8));
                assertEquals(0, ap1TestObject.sumHeights(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 8, 8));
                assertEquals(0, ap1TestObject.sumHeights(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 2, 2));
                assertEquals(3, ap1TestObject.sumHeights(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 3, 6));
                assertEquals(1, ap1TestObject.sumHeights(new int[] { 10, 8, 7, 7, 7, 6, 7 }, 1, 4));
                assertEquals(2, ap1TestObject.sumHeights(new int[] { 10, 8, 7, 7, 7, 6, 7 }, 1, 5));
        }

        @Test
        public void sumHeights2Test() {
                assertEquals(7, ap1TestObject.sumHeights2(new int[] { 5, 3, 6, 7, 2 }, 2, 4));
                assertEquals(2, ap1TestObject.sumHeights2(new int[] { 5, 3, 6, 7, 2 }, 0, 1));
                assertEquals(15, ap1TestObject.sumHeights2(new int[] { 5, 3, 6, 7, 2 }, 0, 4));
                assertEquals(0, ap1TestObject.sumHeights2(new int[] { 5, 3, 6, 7, 2 }, 1, 1));
                assertEquals(6, ap1TestObject.sumHeights2(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 0, 3));
                assertEquals(19, ap1TestObject.sumHeights2(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 4, 8));
                assertEquals(16, ap1TestObject.sumHeights2(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 7, 8));
                assertEquals(0, ap1TestObject.sumHeights2(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 8, 8));
                assertEquals(0, ap1TestObject.sumHeights2(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 2, 2));
                assertEquals(4, ap1TestObject.sumHeights2(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 3, 6));
                assertEquals(1, ap1TestObject.sumHeights2(new int[] { 10, 8, 7, 7, 7, 6, 7 }, 1, 4));
                assertEquals(2, ap1TestObject.sumHeights2(new int[] { 10, 8, 7, 7, 7, 6, 7 }, 1, 5));
        }

        @Test
        public void userCompareTest() {
                assertEquals(-1, ap1TestObject.userCompare("bb", 1, "zz", 2));
                assertEquals(1, ap1TestObject.userCompare("bb", 1, "aa", 2));
                assertEquals(0, ap1TestObject.userCompare("bb", 1, "bb", 1));
                assertEquals(1, ap1TestObject.userCompare("bb", 5, "bb", 1));
                assertEquals(-1, ap1TestObject.userCompare("bb", 5, "bb", 10));
                assertEquals(-1, ap1TestObject.userCompare("adam", 1, "bob", 2));
                assertEquals(-1, ap1TestObject.userCompare("bob", 1, "bob", 2));
                assertEquals(1, ap1TestObject.userCompare("bzb", 1, "bob", 2));
        }

        @Test
        public void mergeTwoTest() {
                assertArrayEquals(new String[] { "a", "b", "c" }, ap1TestObject.mergeTwo(new String[] { "a", "c", "z" },
                                new String[] { "b", "f", "z" }, 3));
                assertArrayEquals(new String[] { "a", "c", "f" }, ap1TestObject.mergeTwo(new String[] { "a", "c", "z" },
                                new String[] { "c", "f", "z" }, 3));
                assertArrayEquals(new String[] { "c", "f", "g" }, ap1TestObject.mergeTwo(new String[] { "f", "g", "z" },
                                new String[] { "c", "f", "g" }, 3));
                assertArrayEquals(new String[] { "a", "c", "z" }, ap1TestObject.mergeTwo(new String[] { "a", "c", "z" },
                                new String[] { "a", "c", "z" }, 3));
                assertArrayEquals(new String[] { "a", "b", "c" }, ap1TestObject
                                .mergeTwo(new String[] { "a", "b", "c", "z" }, new String[] { "a", "c", "z" }, 3));
                assertArrayEquals(new String[] { "a", "b", "c" }, ap1TestObject.mergeTwo(new String[] { "a", "c", "z" },
                                new String[] { "a", "b", "c", "z" }, 3));
                assertArrayEquals(new String[] { "a", "c" }, ap1TestObject.mergeTwo(new String[] { "a", "c", "z" },
                                new String[] { "a", "c", "z" }, 2));
                assertArrayEquals(new String[] { "a", "c", "y" }, ap1TestObject.mergeTwo(new String[] { "a", "c", "z" },
                                new String[] { "a", "c", "y", "z" }, 3));
                assertArrayEquals(new String[] {"a", "b", "x"}, ap1TestObject.mergeTwo(new String[] { "x", "y", "z" },
                                new String[] { "a", "b", "z" }, 3));

        }
}