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

}