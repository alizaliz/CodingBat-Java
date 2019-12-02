package codingbat;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test cases for String1 exercises
 */
public class String1Test{
    
    @Test
    public void helloNameTest() {
        String1 testObject = new String1();
        assertEquals("Hello Bob!",testObject.helloName("Bob"));
        assertEquals("Hello Alice!",testObject.helloName("Alice"));
        assertEquals("Hello X!",testObject.helloName("X"));
        assertEquals("Hello Dolly!",testObject.helloName("Dolly"));
        assertEquals("Hello Alpha!",testObject.helloName("Alpha"));
        assertEquals("Hello Omega!",testObject.helloName("Omega"));
        assertEquals("Hello Goodbye!",testObject.helloName("Goodbye"));
        assertEquals("Hello ho ho ho!",testObject.helloName("ho ho ho"));
        assertEquals("Hello xyz!",testObject.helloName("xyz"));
        assertEquals("Hello Hello!",testObject.helloName("Hello"));

    }

    @Test
    public void makeAbbaTest()
    {
        String1 testObject = new String1();
        assertEquals("HiByeByeHi",testObject.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo",testObject.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat",testObject.makeAbba("What", "Up"));
        assertEquals("aaabbbbbbaaa",testObject.makeAbba("aaa", "bbb"));
        assertEquals("xyyx",testObject.makeAbba("x", "y"));
        assertEquals("xx",testObject.makeAbba("x", ""));
        assertEquals("yy",testObject.makeAbba("", "y"));
        assertEquals("BoYaYaBo",testObject.makeAbba("Bo", "Ya"));
        assertEquals("YaYaYaYa",testObject.makeAbba("Ya", "Ya"));
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
    public void makeOutWordTest()
    {
        String1 testObject = new String1();
        assertEquals("<<Yay>>",testObject.makeOutWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>",testObject.makeOutWord("<<>>", "WooHoo"));
        assertEquals("[[word]]",testObject.makeOutWord("[[]]", "word"));
        assertEquals("HHHellooo",testObject.makeOutWord("HHoo", "Hello"));
        assertEquals("abYAYyz",testObject.makeOutWord("abyz", "YAY"));
    }

    @Test
    public void extraEndTest()
    {
        String1 testObject = new String1();
        assertEquals("lololo",testObject.extraEnd("Hello"));
        assertEquals("ababab",testObject.extraEnd("ab"));
        assertEquals("HiHiHi",testObject.extraEnd("Hi"));
        assertEquals("dydydy",testObject.extraEnd("Candy"));
        assertEquals("dedede",testObject.extraEnd("Code"));
    }

    @Test
    public void firstTwoTest()
    {
        String1 testObject = new String1();
        assertEquals("He",testObject.firstTwo("Hello"));
        assertEquals("ab",testObject.firstTwo("abcdefg"));
        assertEquals("ab",testObject.firstTwo("ab"));
        assertEquals("a",testObject.firstTwo("a"));
        assertEquals("",testObject.firstTwo(""));
        assertEquals("Ki",testObject.firstTwo("Kitten"));
        assertEquals("hi",testObject.firstTwo("hi"));
        assertEquals("hi",testObject.firstTwo("hiya"));
    }
    
    @Test
    public void firstHalfTest()
    {
        String1 testObject = new String1();
        assertEquals("Woo",testObject.firstHalf("WooHoo"));
        assertEquals("Hello",testObject.firstHalf("HelloThere"));
        assertEquals("abc",testObject.firstHalf("abcdef"));
        assertEquals("a",testObject.firstHalf("ab"));
        assertEquals("",testObject.firstHalf(""));
        assertEquals("01234",testObject.firstHalf("0123456789"));
        assertEquals("kit",testObject.firstHalf("kitten"));
        
    }

    @Test
    public void withoutEndTest(){
        String1 testObject = new String1();
        assertEquals("ell",testObject.withoutEnd("Hello"));
        assertEquals("av",testObject.withoutEnd("java"));
        assertEquals("odin",testObject.withoutEnd("coding"));
        assertEquals("od",testObject.withoutEnd("code"));
        assertEquals("",testObject.withoutEnd("ab"));
        assertEquals("hocolate",testObject.withoutEnd("Chocolate!"));
        assertEquals("itte",testObject.withoutEnd("Kitten"));
        assertEquals("ooho",testObject.withoutEnd("woohoo"));
    }

    @Test
    public void comboStringTest(){
        String1 testObject = new String1();
        assertEquals("hiHellohi",testObject.comboString("Hello","hi"));
        assertEquals("hiHellohi",testObject.comboString("hi","Hello"));
        assertEquals("baaab",testObject.comboString("aaa","b"));
        assertEquals("baaab",testObject.comboString("b","aaa"));
        assertEquals("aaa",testObject.comboString("aaa",""));
        assertEquals("bb",testObject.comboString("","bb"));
        assertEquals("aaa1234aaa",testObject.comboString("aaa","1234"));
        assertEquals("bbaaabb",testObject.comboString("aaa","bb"));
        assertEquals("abba",testObject.comboString("a","bb"));
        assertEquals("abba",testObject.comboString("bb","a"));
        assertEquals("abxyzab",testObject.comboString("xyz","ab"));
    }

    @Test
    public void nonStartTest(){
        String1 testObject = new String1();
        assertEquals("ellohere",testObject.nonStart("Hello","There"));
        assertEquals("avaode",testObject.nonStart("java","code"));
        assertEquals("hotlava",testObject.nonStart("shotl","java"));
        assertEquals("by",testObject.nonStart("ab","xy"));
        assertEquals("b",testObject.nonStart("ab","x"));
        assertEquals("c",testObject.nonStart("x","ac"));
        assertEquals("",testObject.nonStart("a","x"));
        assertEquals("itat",testObject.nonStart("kit","kat"));
        assertEquals("artart",testObject.nonStart("mart","dart"));
    }

    @Test
    public void left2Test(){
        String1 testObject = new String1();
        assertEquals("lloHe",testObject.left2("Hello"));
        assertEquals("vaja",testObject.left2("java"));
        assertEquals("Hi",testObject.left2("Hi"));
        assertEquals("deco",testObject.left2("code"));
        assertEquals("tca",testObject.left2("cat"));
        assertEquals("34512",testObject.left2("12345"));
        assertEquals("ocolateCh",testObject.left2("Chocolate"));
        assertEquals("icksbr",testObject.left2("bricks"));
    }

    @Test
    public void right2Test(){
        String1 testObject = new String1();
        assertEquals("loHel",testObject.right2("Hello"));
        assertEquals("vaja",testObject.right2("java"));
        assertEquals("Hi",testObject.right2("Hi"));
        assertEquals("deco",testObject.right2("code"));
        assertEquals("atc",testObject.right2("cat"));
        assertEquals("45123",testObject.right2("12345"));
        assertEquals("teChocola",testObject.right2("Chocolate"));
        assertEquals("ksbric",testObject.right2("bricks"));
    }
    
    @Test
    public void theEndTest(){
        String1 testObject = new String1();
        assertEquals("H",testObject.theEnd("Hello",true));
        assertEquals("o",testObject.theEnd("Hello",false));
        assertEquals("o",testObject.theEnd("oh",true));
        assertEquals("h",testObject.theEnd("oh",false));
        assertEquals("x",testObject.theEnd("x",true));
        assertEquals("x",testObject.theEnd("x",false));
        assertEquals("j",testObject.theEnd("java",true));
        assertEquals("e",testObject.theEnd("Chocolate",false));
        assertEquals("1",testObject.theEnd("1234",true));
        assertEquals("e",testObject.theEnd("code",false));
    }

    @Test
    public void withoutEnd2Test(){
        String1 testObject = new String1();
        assertEquals("ell",testObject.withoutEnd2("Hello"));
        assertEquals("b",testObject.withoutEnd2("abc"));
        assertEquals("",testObject.withoutEnd2("ab"));
        assertEquals("",testObject.withoutEnd2("a"));
        assertEquals("",testObject.withoutEnd2(""));
        assertEquals("old",testObject.withoutEnd2("coldy"));
        assertEquals("ava cod",testObject.withoutEnd2("java code"));
    }

    @Test
    public void middleTwoTest(){
        String1 testObject = new String1();
        assertEquals("ri",testObject.middleTwo("string"));
        assertEquals("od",testObject.middleTwo("code"));
        assertEquals("ct",testObject.middleTwo("Practice"));
        assertEquals("ab",testObject.middleTwo("ab"));
        assertEquals("45",testObject.middleTwo("0123456789"));
    }

    @Test
    public void endsLyTest(){
        String1 testObject = new String1();
        assertTrue(testObject.endsLy("oddly"));
        assertFalse(testObject.endsLy("y"));
        assertFalse(testObject.endsLy("oddy"));
        assertFalse(testObject.endsLy("oddl"));
        assertFalse(testObject.endsLy("olydd"));
        assertTrue(testObject.endsLy("ly"));
        assertFalse(testObject.endsLy(""));
        assertFalse(testObject.endsLy("falsey"));
        assertTrue(testObject.endsLy("evenly"));
    }

    @Test
    public void nTwiceTest(){
        String1 testObject = new String1();
        assertEquals("Helo",testObject.nTwice("Hello", 2));
        assertEquals("Choate",testObject.nTwice("Chocolate", 3));
        assertEquals("Ce",testObject.nTwice("Chocolate", 1));
        assertEquals("",testObject.nTwice("Chocolate", 0));
        assertEquals("Hellello",testObject.nTwice("Hello", 4));
        assertEquals("CodeCode",testObject.nTwice("Code", 4));
        assertEquals("Code",testObject.nTwice("Code", 2));
    }

    @Test
    public void twoCharTest(){
        String1 testObject = new String1();
        assertEquals("ja",testObject.twoChar("java", 0));
        assertEquals("va",testObject.twoChar("java", 2));
        assertEquals("ja",testObject.twoChar("java", 3));
        assertEquals("ja",testObject.twoChar("java", 4));
        assertEquals("ja",testObject.twoChar("java", -1));
        assertEquals("He",testObject.twoChar("Hello", 0));
        assertEquals("el",testObject.twoChar("Hello", 1));
        assertEquals("He",testObject.twoChar("Hello", 99));
        assertEquals("lo",testObject.twoChar("Hello", 3));
        assertEquals("He",testObject.twoChar("Hello", 24));
        assertEquals("He",testObject.twoChar("Hello", 5));
        assertEquals("He",testObject.twoChar("Hello", -7));
        assertEquals("He",testObject.twoChar("Hello", 6));
        assertEquals("He",testObject.twoChar("Hello", -1));
        assertEquals("ya",testObject.twoChar("yay", 0));
    }

    @Test
    public void middleThreeTest(){
        String1 testObject = new String1();
        assertEquals("and",testObject.middleThree("Candy"));
        assertEquals("and",testObject.middleThree("and"));
        assertEquals("lvi",testObject.middleThree("solving"));
        assertEquals("yet",testObject.middleThree("Hi yet Hi"));
        assertEquals("yet",testObject.middleThree("java yet java"));
        assertEquals("col",testObject.middleThree("Chocolate"));
        assertEquals("xyz",testObject.middleThree("XabcxyzabcX"));
    }

    @Test
    public void hasBadTest(){
        String1 testObject = new String1();
        assertTrue(testObject.hasBad("badxx"));
        assertTrue(testObject.hasBad("xbadxx"));
        assertFalse(testObject.hasBad("xxbadxx"));
        assertFalse(testObject.hasBad("code"));
        assertTrue(testObject.hasBad("bad"));
        assertFalse(testObject.hasBad("ba"));
        assertFalse(testObject.hasBad("xba"));
        assertTrue(testObject.hasBad("xbad"));
        assertFalse(testObject.hasBad(""));
        assertTrue(testObject.hasBad("badyy"));
    }

    @Test
    public void atFirstTest(){
        String1 testObject = new String1();
        assertEquals("he",testObject.atFirst("hello"));
        assertEquals("hi",testObject.atFirst("hi"));
        assertEquals("h@",testObject.atFirst("h"));
        assertEquals("@@",testObject.atFirst(""));
        assertEquals("ki",testObject.atFirst("kitten"));
        assertEquals("ja",testObject.atFirst("java"));
        assertEquals("j@",testObject.atFirst("j"));
    }

    @Test
    public void lastCharsTest(){
        String1 testObject = new String1();
        assertEquals("ls",testObject.lastChars("last", "chars"));
        assertEquals("ya",testObject.lastChars("yo", "java"));
        assertEquals("h@",testObject.lastChars("hi", ""));
        assertEquals("@o",testObject.lastChars("", "hello"));
        assertEquals("@@",testObject.lastChars("", ""));
        assertEquals("ki",testObject.lastChars("kitten", "hi"));
        assertEquals("kp",testObject.lastChars("k", "zip"));
        assertEquals("k@",testObject.lastChars("kitten", ""));
        assertEquals("kp",testObject.lastChars("kitten", "zip"));
    }

    @Test
    public void conCatTest(){
        String1 testObject = new String1();
        assertEquals("abcat",testObject.conCat("abc", "cat"));
        assertEquals("dogcat",testObject.conCat("dog", "cat"));
        assertEquals("abc",testObject.conCat("abc", ""));
        assertEquals("cat",testObject.conCat("", "cat"));
        assertEquals("pig",testObject.conCat("pig", "g"));
        assertEquals("pigdoggy",testObject.conCat("pig", "doggy"));
    }

    @Test
    public void lastTwoTest(){
        String1 testObject = new String1();
        assertEquals("codign",testObject.lastTwo("coding"));
        assertEquals("cta",testObject.lastTwo("cat"));
        assertEquals("ba",testObject.lastTwo("ab"));
        assertEquals("a",testObject.lastTwo("a"));
        assertEquals("",testObject.lastTwo(""));
    }

    @Test
    public void seeColorTest(){
        String1 testObject = new String1();
        assertEquals("red",testObject.seeColor("redxx"));
        assertEquals("",testObject.seeColor("xxred"));
        assertEquals("blue",testObject.seeColor("blueTimes"));
        assertEquals("",testObject.seeColor("NoColor"));
        assertEquals("red",testObject.seeColor("red"));
        assertEquals("",testObject.seeColor("re"));
        assertEquals("",testObject.seeColor("blu"));
        assertEquals("blue",testObject.seeColor("blue"));
        assertEquals("",testObject.seeColor("a"));
        assertEquals("",testObject.seeColor(""));
        assertEquals("",testObject.seeColor("xyzred"));
    }
}