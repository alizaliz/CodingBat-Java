package codingbat;

/**
 * Medium String problems -- 1 loop. See the Java String Help document for help
 * with strings. https://codingbat.com/doc/string.html
 */

public class String2 {

    /**
     * Given a string, return a string where for every char in the original, there
     * are two chars.
     * 
     * 
     * doubleChar("The") → "TThhee" doubleChar("AAbb") → "AAAAbbbb"
     * doubleChar("Hi-There") → "HHii--TThheerree"
     */
    public String doubleChar(String str) {
        String ret = "";

        for (int i = 0; i < str.length(); i++) {
            ret += str.charAt(i);
            ret += str.charAt(i);
        }
        return ret;
    }

    /**
     * Return the number of times that the string "hi" appears anywhere in the given
     * string.
     * 
     * 
     * countHi("abc hi ho") → 1 countHi("ABChi hi") → 2 countHi("hihi") → 2
     */
    public int countHi(String str) {
        int count = 0;
        int state = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (state) {
                case 0:
                    if (str.charAt(i) == 'h') {
                        state = 1;
                    }
                    break;
                case 1:
                    if (str.charAt(i) == 'i') {
                        count++;
                    }
                    state = 0;
            }
        }
        return count;
    }

    /**
     * Return true if the string "cat" and "dog" appear the same number of times in
     * the given string.
     * 
     * 
     * catDog("catdog") → true catDog("catcat") → false catDog("1cat1cadodog") →
     * true
     */
    public boolean catDog(String str) {
        int cats = 0;
        int dogs = 0;

        if (str.length() >= 6) {
            String tmp;
            for (int i = 0; i < str.length() - 2; i++) {
                tmp = str.substring(i, i + 3);
                if (tmp.equals("cat")) {
                    cats++;
                } else if (tmp.equals("dog")) {
                    dogs++;
                }
            }
        } else {
            if (str.contains("cat") || str.contains("dog")) {
                return false;
            }
        }

        return cats == dogs;
    }

    /**
     * Return the number of times that the string "code" appears anywhere in the
     * given string, except we'll accept any letter for the 'd', so "cope" and
     * "cooe" count.
     * 
     * 
     * countCode("aaacodebbb") → 1 countCode("codexxcode") → 2
     * countCode("cozexxcope") → 2
     */
    public int countCode(String str) {
        int count = 0;
        int state = 0; // parsing state
        for (int i = 0; i < str.length(); i++) {
            switch (state) {
                case 0: // Look for c
                    if (str.charAt(i) == 'c') {
                        state = 1; // move on
                    }
                    break;
                case 1: // look for o
                    if (str.charAt(i) == 'o') {
                        state = 2; // move on
                    } else if (str.charAt(i) == 'c') {
                        state = 1; // new start
                    } else {
                        state = 0; // go back to start
                    }
                    break;
                case 2: // see if theres a third
                    state = 3; // Any char
                    break;
                case 3:
                    if (str.charAt(i) == 'e') {
                        count++; // succesful "code"
                    } else if (str.charAt(i) == 'c') {
                        state = 1; // new start
                    } else {
                        state = 0; // go back to start
                    }
                    break;

            }

        }
        return count;
    }

    /**
     * Given two strings, return true if either of the strings appears at the very
     * end of the other string, ignoring upper/lower case differences (in other
     * words, the computation should not be "case sensitive"). Note:
     * str.toLowerCase() returns the lowercase version of a string.
     * 
     * 
     * endOther("Hiabc", "abc") → true endOther("AbC", "HiaBc") → true
     * endOther("abc", "abXabc") → true
     */
    public boolean endOther(String a, String b) {
        if (a.length() >= b.length()) {
            return a.toLowerCase().substring(a.length() - b.length()).equals(b.toLowerCase());
        }
        if (b.length() > a.length()) {
            return b.toLowerCase().substring(b.length() - a.length()).equals(a.toLowerCase());
        }
        return false;
    }

    /**
     * Return true if the given string contains an appearance of "xyz" where the xyz
     * is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does
     * not.
     * 
     * 
     * xyzThere("abcxyz") → true xyzThere("abc.xyz") → false xyzThere("xyz.abc") →
     * true
     */
    public boolean xyzThere(String str) {

        if (str.contains("xyz")) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 3).equals("xyz")) {
                    if (i > 0) {
                        if (str.charAt(i - 1) != '.') {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            }

        }

        return false;

    }

    /**
     * Return true if the given string contains a "bob" string, but where the middle
     * 'o' char can be any char.
     * 
     * 
     * bobThere("abcbob") → true bobThere("b9b") → true bobThere("bac") → false
     */
    public boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
                return true;
        }

        return false;
    }

    /**
     * We'll say that a String is xy-balanced if for all the 'x' chars in the
     * string, there exists a 'y' char somewhere later in the string. So "xxy" is
     * balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if
     * the given string is xy-balanced.
     * 
     * 
     * xyBalance("aaxbby") → true xyBalance("aaxbb") → false xyBalance("yaaxbb") →
     * false
     */
    public boolean xyBalance(String str) {
        boolean balance = true;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'x':
                    balance = false;
                    break;
                case 'y':
                    balance = true;
                    break;
                default:
                    break;
            }
        }

        return balance;
    }

    /**
     * Given two strings, a and b, create a bigger string made of the first char of
     * a, the first char of b, the second char of a, the second char of b, and so
     * on. Any leftover chars go at the end of the result.
     * 
     * 
     * mixString("abc", "xyz") → "axbycz" mixString("Hi", "There") → "HTihere"
     * mixString("xxxx", "There") → "xTxhxexre"
     */
    public String mixString(String a, String b) {

        String ret = "";
        for (int i = 0; i < a.length() || i < b.length(); i++) {
            if (i < a.length()) {
                ret += a.charAt(i);
            }
            if (i < b.length()) {
                ret += b.charAt(i);
            }
        }

        return ret;
    }

    /**
     * Given a string and an int n, return a string made of n repetitions of the
     * last n characters of the string. You may assume that n is between 0 and the
     * length of the string, inclusive.
     * 
     * 
     * repeatEnd("Hello", 3) → "llollollo" repeatEnd("Hello", 2) → "lolo"
     * repeatEnd("Hello", 1) → "o"
     */
    public String repeatEnd(String str, int n) {
        String ret = "";

        String sub = str.substring(str.length() - n);

        for (int i = 0; i < n; i++) {
            ret += sub;
        }

        return ret;
    }

    /**
     * Given a string and an int n, return a string made of the first n characters
     * of the string, followed by the first n-1 characters of the string, and so on.
     * You may assume that n is between 0 and the length of the string, inclusive
     * (i.e. n >= 0 and n <= str.length()).
     * 
     * 
     * repeatFront("Chocolate", 4) → "ChocChoChC" repeatFront("Chocolate", 3) →
     * "ChoChC" repeatFront("Ice Cream", 2) → "IcI"
     */
    public String repeatFront(String str, int n) {
        String ret = "";

        for (int i = 0; i < n; i++) {
            ret += str.substring(0, n - i);
        }

        return ret;
    }

    /**
     * Given two strings, word and a separator sep, return a big string made of
     * count occurrences of the word, separated by the separator string.
     * 
     * 
     * repeatSeparator("Word", "X", 3) → "WordXWordXWord" repeatSeparator("This",
     * "And", 2) → "ThisAndThis" repeatSeparator("This", "And", 1) → "This"
     */
    public String repeatSeparator(String word, String sep, int count) {
        String ret = "";
        for (int i = 0; i < count; i++) {
            ret += word;
            if (i != count - 1)
                ret += sep;
        }
        return ret;
    }

}