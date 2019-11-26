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
}