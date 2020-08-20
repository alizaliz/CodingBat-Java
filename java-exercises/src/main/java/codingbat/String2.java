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

}