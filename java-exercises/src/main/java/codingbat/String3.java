package codingbat;

public class String3 {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y'
     * in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case
     * sensitive). We'll say that a y or z is at the end of a word if there is not
     * an alphabetic letter immediately following it. (Note:
     * Character.isLetter(char) tests if a char is an alphabetic letter.)
     * 
     * 
     * countYZ("fez day") → 2 countYZ("day fez") → 2 countYZ("day fyyyz") → 2
     */
    public int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'z' || str.toLowerCase().charAt(i) == 'y') {
                if (i + 1 >= str.length() || !Character.isLetter(str.charAt(i + 1))) {
                    count++;
                }
            }
        }

        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where
     * all instances of the remove string have been removed (not case sensitive).
     * You may assume that the remove string is length 1 or more. Remove only
     * non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * 
     * 
     * withoutString("Hello there", "llo") → "He there" withoutString("Hello there",
     * "e") → "Hllo thr" withoutString("Hello there", "x") → "Hello there"
     */
    public String withoutString(String base, String remove) {

        String ret = "";

        while (base.length() != 0) {
            if (Character.toLowerCase(base.charAt(0)) == Character.toLowerCase(remove.charAt(0))) {
                if (remove.length() - 1 < base.length()
                        && base.substring(0, remove.length()).toLowerCase().equals(remove.toLowerCase())) {
                    base = base.substring(remove.length());
                    continue;
                }
            }
            ret += base.charAt(0);
            if (base.length() >= 1) {
                base = base.substring(1);
            }

        }

        return ret;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in
     * the string is equal to the number of appearances of "not" anywhere in the
     * string (case sensitive).
     * 
     * 
     * equalIsNot("This is not") → false equalIsNot("This is notnot") → true
     * equalIsNot("noisxxnotyynotxisi") → true
     */
    public boolean equalIsNot(String str) {
        int isCount = 0, notCount = 0;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'i':
                    if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                        isCount++;
                    }
                    break;
                case 'n':
                    if (i + 2 < str.length() && str.substring(i, i + 3).equals("not")) {
                        notCount++;
                    }
                    break;
            }
        }

        return isCount == notCount;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
     * immediately to its left or right. Return true if all the g's in the given
     * string are happy.
     * 
     * 
     * gHappy("xxggxx") → true gHappy("xxgxx") → false gHappy("xxggyygxx") → false
     */
    public boolean gHappy(String str) {
        boolean ret = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (!((i > 0 && str.charAt(i - 1) == 'g') || i < str.length() - 1 && str.charAt(i + 1) == 'g')) {
                    ret = false;
                }
            }
        }

        return ret;
    }

}