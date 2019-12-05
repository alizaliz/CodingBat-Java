package codingbat;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Test cases for String1 exercises
 */
public class String1Test{
    
    private String1 string1testObject;

    @Before
    public void setUp() {
        string1testObject = new String1();
    }

    @Test
    public void helloNameTest() {
        assertEquals("Hello Bob!",string1testObject.helloName("Bob"));
        assertEquals("Hello Alice!",string1testObject.helloName("Alice"));
        assertEquals("Hello X!",string1testObject.helloName("X"));
        assertEquals("Hello Dolly!",string1testObject.helloName("Dolly"));
        assertEquals("Hello Alpha!",string1testObject.helloName("Alpha"));
        assertEquals("Hello Omega!",string1testObject.helloName("Omega"));
        assertEquals("Hello Goodbye!",string1testObject.helloName("Goodbye"));
        assertEquals("Hello ho ho ho!",string1testObject.helloName("ho ho ho"));
        assertEquals("Hello xyz!",string1testObject.helloName("xyz"));
        assertEquals("Hello Hello!",string1testObject.helloName("Hello"));

    }

    @Test
    public void makeAbbaTest() {
        assertEquals("HiByeByeHi",string1testObject.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo",string1testObject.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat",string1testObject.makeAbba("What", "Up"));
        assertEquals("aaabbbbbbaaa",string1testObject.makeAbba("aaa", "bbb"));
        assertEquals("xyyx",string1testObject.makeAbba("x", "y"));
        assertEquals("xx",string1testObject.makeAbba("x", ""));
        assertEquals("yy",string1testObject.makeAbba("", "y"));
        assertEquals("BoYaYaBo",string1testObject.makeAbba("Bo", "Ya"));
        assertEquals("YaYaYaYa",string1testObject.makeAbba("Ya", "Ya"));
    }

    @Test
    public void makeTagsTest()
    {
        String1 testObject = new String1();
        assertEquals("<i>Yay</i>",testObject.makeTags("i", "Yay"));
        assertEquals("<i>Hello</i>",testObject.makeTags("i", "Hello"));
        assertEquals("<cite>Yay</cite>",testObject.makeTags("cite", "Yay"));
        assertEquals("<address>here</address>",testObject.makeTags("address", "here"));
        assertEquals("<body>Heart</body>",testObject.makeTags("body", "Heart"));
        assertEquals("<i>i</i>",testObject.makeTags("i", "i"));
        assertEquals("<i></i>",testObject.makeTags("i", ""));
    }

    @Test
    public void makeOutWordTest() {
        assertEquals("<<Yay>>",string1testObject.makeOutWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>",string1testObject.makeOutWord("<<>>", "WooHoo"));
        assertEquals("[[word]]",string1testObject.makeOutWord("[[]]", "word"));
        assertEquals("HHHellooo",string1testObject.makeOutWord("HHoo", "Hello"));
        assertEquals("abYAYyz",string1testObject.makeOutWord("abyz", "YAY"));
    }

    @Test
    public void extraEndTest() {
        assertEquals("lololo",string1testObject.extraEnd("Hello"));
        assertEquals("ababab",string1testObject.extraEnd("ab"));
        assertEquals("HiHiHi",string1testObject.extraEnd("Hi"));
        assertEquals("dydydy",string1testObject.extraEnd("Candy"));
        assertEquals("dedede",string1testObject.extraEnd("Code"));
    }

    @Test
    public void firstTwoTest() {
        assertEquals("He",string1testObject.firstTwo("Hello"));
        assertEquals("ab",string1testObject.firstTwo("abcdefg"));
        assertEquals("ab",string1testObject.firstTwo("ab"));
        assertEquals("a",string1testObject.firstTwo("a"));
        assertEquals("",string1testObject.firstTwo(""));
        assertEquals("Ki",string1testObject.firstTwo("Kitten"));
        assertEquals("hi",string1testObject.firstTwo("hi"));
        assertEquals("hi",string1testObject.firstTwo("hiya"));
    }
    
    @Test
    public void firstHalfTest() {
        assertEquals("Woo",string1testObject.firstHalf("WooHoo"));
        assertEquals("Hello",string1testObject.firstHalf("HelloThere"));
        assertEquals("abc",string1testObject.firstHalf("abcdef"));
        assertEquals("a",string1testObject.firstHalf("ab"));
        assertEquals("",string1testObject.firstHalf(""));
        assertEquals("01234",string1testObject.firstHalf("0123456789"));
        assertEquals("kit",string1testObject.firstHalf("kitten"));
        
    }

    @Test
    public void withoutEndTest(){
        assertEquals("ell",string1testObject.withoutEnd("Hello"));
        assertEquals("av",string1testObject.withoutEnd("java"));
        assertEquals("odin",string1testObject.withoutEnd("coding"));
        assertEquals("od",string1testObject.withoutEnd("code"));
        assertEquals("",string1testObject.withoutEnd("ab"));
        assertEquals("hocolate",string1testObject.withoutEnd("Chocolate!"));
        assertEquals("itte",string1testObject.withoutEnd("Kitten"));
        assertEquals("ooho",string1testObject.withoutEnd("woohoo"));
    }

    @Test
    public void comboStringTest(){
        assertEquals("hiHellohi",string1testObject.comboString("Hello","hi"));
        assertEquals("hiHellohi",string1testObject.comboString("hi","Hello"));
        assertEquals("baaab",string1testObject.comboString("aaa","b"));
        assertEquals("baaab",string1testObject.comboString("b","aaa"));
        assertEquals("aaa",string1testObject.comboString("aaa",""));
        assertEquals("bb",string1testObject.comboString("","bb"));
        assertEquals("aaa1234aaa",string1testObject.comboString("aaa","1234"));
        assertEquals("bbaaabb",string1testObject.comboString("aaa","bb"));
        assertEquals("abba",string1testObject.comboString("a","bb"));
        assertEquals("abba",string1testObject.comboString("bb","a"));
        assertEquals("abxyzab",string1testObject.comboString("xyz","ab"));
    }

    @Test
    public void nonStartTest(){
        assertEquals("ellohere",string1testObject.nonStart("Hello","There"));
        assertEquals("avaode",string1testObject.nonStart("java","code"));
        assertEquals("hotlava",string1testObject.nonStart("shotl","java"));
        assertEquals("by",string1testObject.nonStart("ab","xy"));
        assertEquals("b",string1testObject.nonStart("ab","x"));
        assertEquals("c",string1testObject.nonStart("x","ac"));
        assertEquals("",string1testObject.nonStart("a","x"));
        assertEquals("itat",string1testObject.nonStart("kit","kat"));
        assertEquals("artart",string1testObject.nonStart("mart","dart"));
    }

    @Test
    public void left2Test(){
        assertEquals("lloHe",string1testObject.left2("Hello"));
        assertEquals("vaja",string1testObject.left2("java"));
        assertEquals("Hi",string1testObject.left2("Hi"));
        assertEquals("deco",string1testObject.left2("code"));
        assertEquals("tca",string1testObject.left2("cat"));
        assertEquals("34512",string1testObject.left2("12345"));
        assertEquals("ocolateCh",string1testObject.left2("Chocolate"));
        assertEquals("icksbr",string1testObject.left2("bricks"));
    }

    @Test
    public void right2Test(){
        assertEquals("loHel",string1testObject.right2("Hello"));
        assertEquals("vaja",string1testObject.right2("java"));
        assertEquals("Hi",string1testObject.right2("Hi"));
        assertEquals("deco",string1testObject.right2("code"));
        assertEquals("atc",string1testObject.right2("cat"));
        assertEquals("45123",string1testObject.right2("12345"));
        assertEquals("teChocola",string1testObject.right2("Chocolate"));
        assertEquals("ksbric",string1testObject.right2("bricks"));
    }
    
    @Test
    public void theEndTest(){
        assertEquals("H",string1testObject.theEnd("Hello",true));
        assertEquals("o",string1testObject.theEnd("Hello",false));
        assertEquals("o",string1testObject.theEnd("oh",true));
        assertEquals("h",string1testObject.theEnd("oh",false));
        assertEquals("x",string1testObject.theEnd("x",true));
        assertEquals("x",string1testObject.theEnd("x",false));
        assertEquals("j",string1testObject.theEnd("java",true));
        assertEquals("e",string1testObject.theEnd("Chocolate",false));
        assertEquals("1",string1testObject.theEnd("1234",true));
        assertEquals("e",string1testObject.theEnd("code",false));
    }

    @Test
    public void withoutEnd2Test(){
        assertEquals("ell",string1testObject.withoutEnd2("Hello"));
        assertEquals("b",string1testObject.withoutEnd2("abc"));
        assertEquals("",string1testObject.withoutEnd2("ab"));
        assertEquals("",string1testObject.withoutEnd2("a"));
        assertEquals("",string1testObject.withoutEnd2(""));
        assertEquals("old",string1testObject.withoutEnd2("coldy"));
        assertEquals("ava cod",string1testObject.withoutEnd2("java code"));
    }

    @Test
    public void middleTwoTest(){
        assertEquals("ri",string1testObject.middleTwo("string"));
        assertEquals("od",string1testObject.middleTwo("code"));
        assertEquals("ct",string1testObject.middleTwo("Practice"));
        assertEquals("ab",string1testObject.middleTwo("ab"));
        assertEquals("45",string1testObject.middleTwo("0123456789"));
    }

    @Test
    public void endsLyTest(){
        assertTrue(string1testObject.endsLy("oddly"));
        assertFalse(string1testObject.endsLy("y"));
        assertFalse(string1testObject.endsLy("oddy"));
        assertFalse(string1testObject.endsLy("oddl"));
        assertFalse(string1testObject.endsLy("olydd"));
        assertTrue(string1testObject.endsLy("ly"));
        assertFalse(string1testObject.endsLy(""));
        assertFalse(string1testObject.endsLy("falsey"));
        assertTrue(string1testObject.endsLy("evenly"));
    }

    @Test
    public void nTwiceTest(){
        assertEquals("Helo",string1testObject.nTwice("Hello", 2));
        assertEquals("Choate",string1testObject.nTwice("Chocolate", 3));
        assertEquals("Ce",string1testObject.nTwice("Chocolate", 1));
        assertEquals("",string1testObject.nTwice("Chocolate", 0));
        assertEquals("Hellello",string1testObject.nTwice("Hello", 4));
        assertEquals("CodeCode",string1testObject.nTwice("Code", 4));
        assertEquals("Code",string1testObject.nTwice("Code", 2));
    }

    @Test
    public void twoCharTest(){
        assertEquals("ja",string1testObject.twoChar("java", 0));
        assertEquals("va",string1testObject.twoChar("java", 2));
        assertEquals("ja",string1testObject.twoChar("java", 3));
        assertEquals("ja",string1testObject.twoChar("java", 4));
        assertEquals("ja",string1testObject.twoChar("java", -1));
        assertEquals("He",string1testObject.twoChar("Hello", 0));
        assertEquals("el",string1testObject.twoChar("Hello", 1));
        assertEquals("He",string1testObject.twoChar("Hello", 99));
        assertEquals("lo",string1testObject.twoChar("Hello", 3));
        assertEquals("He",string1testObject.twoChar("Hello", 24));
        assertEquals("He",string1testObject.twoChar("Hello", 5));
        assertEquals("He",string1testObject.twoChar("Hello", -7));
        assertEquals("He",string1testObject.twoChar("Hello", 6));
        assertEquals("He",string1testObject.twoChar("Hello", -1));
        assertEquals("ya",string1testObject.twoChar("yay", 0));
    }

    @Test
    public void middleThreeTest(){
        assertEquals("and",string1testObject.middleThree("Candy"));
        assertEquals("and",string1testObject.middleThree("and"));
        assertEquals("lvi",string1testObject.middleThree("solving"));
        assertEquals("yet",string1testObject.middleThree("Hi yet Hi"));
        assertEquals("yet",string1testObject.middleThree("java yet java"));
        assertEquals("col",string1testObject.middleThree("Chocolate"));
        assertEquals("xyz",string1testObject.middleThree("XabcxyzabcX"));
    }

    @Test
    public void hasBadTest(){
        assertTrue(string1testObject.hasBad("badxx"));
        assertTrue(string1testObject.hasBad("xbadxx"));
        assertFalse(string1testObject.hasBad("xxbadxx"));
        assertFalse(string1testObject.hasBad("code"));
        assertTrue(string1testObject.hasBad("bad"));
        assertFalse(string1testObject.hasBad("ba"));
        assertFalse(string1testObject.hasBad("xba"));
        assertTrue(string1testObject.hasBad("xbad"));
        assertFalse(string1testObject.hasBad(""));
        assertTrue(string1testObject.hasBad("badyy"));
    }

    @Test
    public void atFirstTest(){
        assertEquals("he",string1testObject.atFirst("hello"));
        assertEquals("hi",string1testObject.atFirst("hi"));
        assertEquals("h@",string1testObject.atFirst("h"));
        assertEquals("@@",string1testObject.atFirst(""));
        assertEquals("ki",string1testObject.atFirst("kitten"));
        assertEquals("ja",string1testObject.atFirst("java"));
        assertEquals("j@",string1testObject.atFirst("j"));
    }

    @Test
    public void lastCharsTest(){
        assertEquals("ls",string1testObject.lastChars("last", "chars"));
        assertEquals("ya",string1testObject.lastChars("yo", "java"));
        assertEquals("h@",string1testObject.lastChars("hi", ""));
        assertEquals("@o",string1testObject.lastChars("", "hello"));
        assertEquals("@@",string1testObject.lastChars("", ""));
        assertEquals("ki",string1testObject.lastChars("kitten", "hi"));
        assertEquals("kp",string1testObject.lastChars("k", "zip"));
        assertEquals("k@",string1testObject.lastChars("kitten", ""));
        assertEquals("kp",string1testObject.lastChars("kitten", "zip"));
    }

    @Test
    public void conCatTest(){
        assertEquals("abcat",string1testObject.conCat("abc", "cat"));
        assertEquals("dogcat",string1testObject.conCat("dog", "cat"));
        assertEquals("abc",string1testObject.conCat("abc", ""));
        assertEquals("cat",string1testObject.conCat("", "cat"));
        assertEquals("pig",string1testObject.conCat("pig", "g"));
        assertEquals("pigdoggy",string1testObject.conCat("pig", "doggy"));
    }

    @Test
    public void lastTwoTest(){
        assertEquals("codign",string1testObject.lastTwo("coding"));
        assertEquals("cta",string1testObject.lastTwo("cat"));
        assertEquals("ba",string1testObject.lastTwo("ab"));
        assertEquals("a",string1testObject.lastTwo("a"));
        assertEquals("",string1testObject.lastTwo(""));
    }

    @Test
    public void seeColorTest(){
        assertEquals("red",string1testObject.seeColor("redxx"));
        assertEquals("",string1testObject.seeColor("xxred"));
        assertEquals("blue",string1testObject.seeColor("blueTimes"));
        assertEquals("",string1testObject.seeColor("NoColor"));
        assertEquals("red",string1testObject.seeColor("red"));
        assertEquals("",string1testObject.seeColor("re"));
        assertEquals("",string1testObject.seeColor("blu"));
        assertEquals("blue",string1testObject.seeColor("blue"));
        assertEquals("",string1testObject.seeColor("a"));
        assertEquals("",string1testObject.seeColor(""));
        assertEquals("",string1testObject.seeColor("xyzred"));
    }

    @Test
    public void frontAgainTest(){
        assertTrue(string1testObject.frontAgain("edited"));
        assertFalse(string1testObject.frontAgain("edit"));
        assertTrue(string1testObject.frontAgain("ed"));
        assertTrue(string1testObject.frontAgain("jj"));
        assertTrue(string1testObject.frontAgain("jjj"));
        assertTrue(string1testObject.frontAgain("jjjj"));
        assertFalse(string1testObject.frontAgain("jjjk"));
        assertFalse(string1testObject.frontAgain("x"));
        assertFalse(string1testObject.frontAgain(""));
        assertFalse(string1testObject.frontAgain("java"));
        assertTrue(string1testObject.frontAgain("javaja"));
    }

    @Test
    public void minCatTest(){
        assertEquals("loHi",string1testObject.minCat("Hello", "Hi"));
        assertEquals("ellojava",string1testObject.minCat("Hello", "java"));
        assertEquals("javaello",string1testObject.minCat("java", "Hello"));
        assertEquals("cx",string1testObject.minCat("abc", "x"));
        assertEquals("xc",string1testObject.minCat("x", "abc"));
        assertEquals("",string1testObject.minCat("abc", ""));
    }

    @Test
    public void extraFrontTest(){
        assertEquals("HeHeHe",string1testObject.extraFront("Hello"));
        assertEquals("ababab",string1testObject.extraFront("ab"));
        assertEquals("HHH",string1testObject.extraFront("H"));
        assertEquals("",string1testObject.extraFront(""));
        assertEquals("CaCaCa",string1testObject.extraFront("Candy"));
        assertEquals("CoCoCo",string1testObject.extraFront("Code"));
    }

    @Test
    public void without2Test(){
        assertEquals("lloHe",string1testObject.without2("HelloHe"));
        assertEquals("HelloHi",string1testObject.without2("HelloHi"));
        assertEquals("",string1testObject.without2("Hi"));
        assertEquals("Chocolate",string1testObject.without2("Chocolate"));
        assertEquals("x",string1testObject.without2("xxx"));
        assertEquals("",string1testObject.without2("xx"));
        assertEquals("x",string1testObject.without2("x"));
        assertEquals("",string1testObject.without2(""));
        assertEquals("Fruits",string1testObject.without2("Fruits"));
    }

    @Test
    public void deFrontTest(){
        assertEquals("llo",string1testObject.deFront("Hello"));
        assertEquals("va",string1testObject.deFront("java"));
        assertEquals("aay",string1testObject.deFront("away"));
        assertEquals("ay",string1testObject.deFront("axy"));
        assertEquals("abc",string1testObject.deFront("abc"));
        assertEquals("by",string1testObject.deFront("xby"));
        assertEquals("ab",string1testObject.deFront("ab"));
        assertEquals("a",string1testObject.deFront("ax"));
        assertEquals("ab",string1testObject.deFront("axb"));
        assertEquals("aa",string1testObject.deFront("aaa"));
        assertEquals("bc",string1testObject.deFront("xbc"));
        assertEquals("bb",string1testObject.deFront("bbb"));
        assertEquals("zz",string1testObject.deFront("bazz"));
        assertEquals("",string1testObject.deFront("ba"));
        assertEquals("abxyz",string1testObject.deFront("abxyz"));
        assertEquals("",string1testObject.deFront("hi"));
        assertEquals("s",string1testObject.deFront("his"));
        assertEquals("",string1testObject.deFront("xz"));
        assertEquals("z",string1testObject.deFront("zzz"));
    }
    
    @Test
    public void startWordTest(){
        assertEquals("hi",string1testObject.startWord("hippo", "hi"));
        assertEquals("hip",string1testObject.startWord("hippo", "xip"));
        assertEquals("h",string1testObject.startWord("hippo", "i"));
        assertEquals("",string1testObject.startWord("hippo", "ix"));
        assertEquals("",string1testObject.startWord("h", "ix"));
        assertEquals("",string1testObject.startWord("", "i"));
        assertEquals("hi",string1testObject.startWord("hip", "zi"));
        assertEquals("hip",string1testObject.startWord("hip", "zip"));
        assertEquals("",string1testObject.startWord("hip", "zig"));
        assertEquals("h",string1testObject.startWord("h", "z"));
        assertEquals("hippo",string1testObject.startWord("hippo", "xippo"));
        assertEquals("",string1testObject.startWord("hippo", "xyz"));
        assertEquals("hip",string1testObject.startWord("hippo", "hip"));
        assertEquals("kit",string1testObject.startWord("kitten", "cit"));
        assertEquals("kit",string1testObject.startWord("kit", "cit"));
    }

    @Test
    public void withoutXTest(){
        assertEquals("Hi",string1testObject.withoutX("xHix"));
        assertEquals("Hi",string1testObject.withoutX("xHi"));
        assertEquals("Hxi",string1testObject.withoutX("Hxix"));
        assertEquals("Hi",string1testObject.withoutX("Hi"));
        assertEquals("xHi",string1testObject.withoutX("xxHi"));
        assertEquals("Hi",string1testObject.withoutX("Hix"));
        assertEquals("axb",string1testObject.withoutX("xaxbx"));
        assertEquals("",string1testObject.withoutX("xx"));
        assertEquals("",string1testObject.withoutX("x"));
        assertEquals("",string1testObject.withoutX(""));
        assertEquals("Hello",string1testObject.withoutX("Hello"));
        assertEquals("Hexllo",string1testObject.withoutX("Hexllo"));
    }

    @Test
    public void withoutX2Test(){
        assertEquals("Hi",string1testObject.withoutX2("xHi"));
        assertEquals("Hi",string1testObject.withoutX2("Hi"));
        assertEquals("Hi",string1testObject.withoutX2("Hxi"));
        assertEquals("Hi",string1testObject.withoutX2("xxHi"));
        assertEquals("Hix",string1testObject.withoutX2("Hix"));
        assertEquals("axb",string1testObject.withoutX2("xaxb"));
        assertEquals("",string1testObject.withoutX2("xx"));
        assertEquals("",string1testObject.withoutX2("x"));
        assertEquals("",string1testObject.withoutX2(""));
        assertEquals("Hello",string1testObject.withoutX2("Hello"));
        assertEquals("Hexllo",string1testObject.withoutX2("Hexllo"));
        assertEquals("Hxllo",string1testObject.withoutX2("xHxllo"));
    }
}