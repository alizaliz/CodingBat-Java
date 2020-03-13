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
                assertEquals(Map.of("a", 0, "b", 0, "c", 0),
                                map2TestObject.word0(new String[] { "a", "b", "a", "c", "b" }));
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
                assertEquals(Map.of("a", "d", "c", "s"),
                                map2TestObject.pairs(new String[] { "are", "codes", "and", "cods" }));
                assertEquals(Map.of("a", "e", "b", "a", "c", "e", "t", "a"),
                                map2TestObject.pairs(new String[] { "apple", "banana", "tea", "coffee" }));
        }

        @Test
        public void wordCountTest() {
                assertEquals(Map.of("a", 2, "b", 2, "c", 1),
                                map2TestObject.wordCount(new String[] { "a", "b", "a", "c", "b" }));
                assertEquals(Map.of("a", 1, "b", 1, "c", 1), map2TestObject.wordCount(new String[] { "c", "b", "a" }));
                assertEquals(Map.of("c", 4), map2TestObject.wordCount(new String[] { "c", "c", "c", "c" }));
                assertEquals(Map.of(), map2TestObject.wordCount(new String[] {}));
                assertEquals(Map.of("", 1, "and", 1, "this", 2),
                                map2TestObject.wordCount(new String[] { "this", "and", "this", "" }));
                assertEquals(Map.of("x", 2, "X", 1, "y", 1, "Y", 1),
                                map2TestObject.wordCount(new String[] { "x", "y", "x", "Y", "X" }));
                assertEquals(Map.of("0", 1, "1", 1, "123", 2),
                                map2TestObject.wordCount(new String[] { "123", "0", "123", "1" }));
                assertEquals(Map.of("a", 4, "b", 5, "d", 3, "e", 1, "f", 1, "one", 1, "x", 2, "z", 2, "two", 2),
                                map2TestObject.wordCount(new String[] { "d", "a", "e", "d", "a", "d", "b", "b", "z",
                                                "a", "a", "b", "z", "x", "b", "f", "x", "two", "b", "one", "two" }));
                assertEquals(Map.of("banana", 2, "apple", 3, "tea", 1, "coffee", 1), map2TestObject.wordCount(
                                new String[] { "apple", "banana", "apple", "apple", "tea", "coffee", "banana" }));
        }

        @Test
        public void firstCharTest() {
                assertEquals(Map.of("s", "saltsoda", "t", "teatoast"),
                                map2TestObject.firstChar(new String[] { "salt", "tea", "soda", "toast" }));
                assertEquals(Map.of("a", "aaaAA", "b", "bb", "c", "cccCC", "d", "d"),
                                map2TestObject.firstChar(new String[] { "aa", "bb", "cc", "aAA", "cCC", "d" }));
                assertEquals(Map.of(), map2TestObject.firstChar(new String[] {}));
                assertEquals(Map.of("a", "appleaardvark", "b", "bellsbellsbells", "s", "saltsun", "z", "zen"),
                                map2TestObject.firstChar(new String[] { "apple", "bells", "salt", "aardvark", "bells",
                                                "sun", "zen", "bells" }));
        }

        @Test
        public void wordAppendTest() {
                assertEquals("a", map2TestObject.wordAppend(new String[] { "a", "b", "a" }));
                assertEquals("aa", map2TestObject.wordAppend(new String[] { "a", "b", "a", "c", "a", "d", "a" }));
                assertEquals("a", map2TestObject.wordAppend(new String[] { "a", "", "a" }));
                assertEquals("", map2TestObject.wordAppend(new String[] {}));
                assertEquals("ba", map2TestObject.wordAppend(new String[] { "a", "b", "b", "a", "a" }));
                assertEquals("baa", map2TestObject.wordAppend(new String[] { "a", "b", "b", "b", "a", "c", "a", "a" }));
                assertEquals("baaba", map2TestObject
                                .wordAppend(new String[] { "a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a" }));
                assertEquals("andornot", map2TestObject.wordAppend(
                                new String[] { "not", "and", "or", "and", "this", "and", "or", "that", "not" }));
                assertEquals("", map2TestObject.wordAppend(new String[] { "a", "b", "c" }));
                assertEquals("thisandthat", map2TestObject
                                .wordAppend(new String[] { "this", "or", "that", "and", "this", "and", "that" }));
                assertEquals("xxyyzzxx", map2TestObject
                                .wordAppend(new String[] { "xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx" }));
        }

        @Test
        public void wordMultipleTest() {
                assertEquals(Map.of("a", true, "b", true, "c", false),
                                map2TestObject.wordMultiple(new String[] { "a", "b", "a", "c", "b" }));
                assertEquals(Map.of("a", false, "b", false, "c", false),
                                map2TestObject.wordMultiple(new String[] { "c", "b", "a" }));
                assertEquals(Map.of("c", true), map2TestObject.wordMultiple(new String[] { "c", "c", "c", "c" }));
                assertEquals(Map.of(), map2TestObject.wordMultiple(new String[] {}));
                assertEquals(Map.of("and", false, "this", true),
                                map2TestObject.wordMultiple(new String[] { "this", "and", "this" }));
                assertEquals(Map.of("a", true, "b", true, "d", true, "e", false, "x", false, "z", true),
                                map2TestObject.wordMultiple(new String[] { "d", "a", "e", "d", "a", "d", "b", "b", "z",
                                                "a", "a", "b", "z", "x" }));
        }

        @Test
        public void allSwapTest() {
                assertArrayEquals(new String[] { "ac", "ab" }, map2TestObject.allSwap(new String[] { "ab", "ac" }));
                assertArrayEquals(new String[] { "ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa" }, map2TestObject
                                .allSwap(new String[] { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" }));
                assertArrayEquals(new String[] { "ay", "by", "ax", "bx", "aj", "ai", "by", "bx" }, map2TestObject
                                .allSwap(new String[] { "ax", "bx", "ay", "by", "ai", "aj", "bx", "by" }));
                assertArrayEquals(new String[] { "ay", "bx", "cy", "ax", "cx", "abb", "aaa" },
                                map2TestObject.allSwap(new String[] { "ax", "bx", "cx", "ay", "cy", "aaa", "abb" }));
                assertArrayEquals(new String[] { "every", "does", "ice", "easy", "it", "eaten" },
                                map2TestObject.allSwap(new String[] { "easy", "does", "it", "every", "ice", "eaten" }));
                assertArrayEquals(new String[] { "lily", "over", "water", "swims", "of", "list", "words", "wait" },
                                map2TestObject.allSwap(new String[] { "list", "of", "words", "swims", "over", "lily",
                                                "water", "wait" }));
                assertArrayEquals(new String[] { "42", "8", "16", "15", "23", "4" },
                                map2TestObject.allSwap(new String[] { "4", "8", "15", "16", "23", "42" }));
                assertArrayEquals(new String[] { "aaa" }, map2TestObject.allSwap(new String[] { "aaa" }));
                assertArrayEquals(new String[] {}, map2TestObject.allSwap(new String[] {}));
                assertArrayEquals(new String[] { "a", "b", "c", "xx", "yy", "zz" },
                                map2TestObject.allSwap(new String[] { "a", "b", "c", "xx", "yy", "zz" }));
        }

        @Test
        public void firstSwapTest() {
                assertArrayEquals(new String[] { "ac", "ab" }, map2TestObject.firstSwap(new String[] { "ab", "ac" }));
                assertArrayEquals(new String[] { "ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz" }, map2TestObject
                                .firstSwap(new String[] { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" }));
                assertArrayEquals(new String[] { "ay", "by", "ax", "bx", "ai", "aj", "bx", "by" }, map2TestObject
                                .firstSwap(new String[] { "ax", "bx", "ay", "by", "ai", "aj", "bx", "by" }));
                assertArrayEquals(new String[] { "ay", "bx", "cy", "ax", "cx", "aaa", "abb" },
                                map2TestObject.firstSwap(new String[] { "ax", "bx", "cx", "ay", "cy", "aaa", "abb" }));
                assertArrayEquals(new String[] { "every", "does", "ice", "easy", "it", "eaten" }, map2TestObject
                                .firstSwap(new String[] { "easy", "does", "it", "every", "ice", "eaten" }));
                assertArrayEquals(new String[] { "lily", "over", "water", "swims", "of", "list", "words", "wait" },
                                map2TestObject.firstSwap(new String[] { "list", "of", "words", "swims", "over", "lily",
                                                "water", "wait" }));
                assertArrayEquals(new String[] { "42", "8", "16", "15", "23", "4" },
                                map2TestObject.firstSwap(new String[] { "4", "8", "15", "16", "23", "42" }));
                assertArrayEquals(new String[] { "aaa" }, map2TestObject.firstSwap(new String[] { "aaa" }));
                assertArrayEquals(new String[] {}, map2TestObject.firstSwap(new String[] {}));
                assertArrayEquals(new String[] { "a", "b", "c", "xx", "yy", "zz" },
                                map2TestObject.firstSwap(new String[] { "a", "b", "c", "xx", "yy", "zz" }));
        }
}