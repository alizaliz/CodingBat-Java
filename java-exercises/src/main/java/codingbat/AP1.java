package codingbat;

import java.util.ArrayList;
import java.util.List;

/**
 * AP CS medium problems. These problems are based on free response questions
 * from old AP CS-A exams, 2004 and later. Some are from the exams and some were
 * just created to have a similar difficulty. These problems are good practice
 * for the logic/loop/array aspects of the exam. See also the Basic Recursion
 * section and the official college board CS-A page.
 * http://www.collegeboard.com/student/testing/ap/compsci_a/samp.html?compscia
 */

public final class AP1 {

    /**
     * Given an array of scores, return true if each score is equal or greater than
     * the one before. The array will be length 2 or more.
     * 
     * scoresIncreasing([1, 3, 4]) → true scoresIncreasing([1, 3, 2]) → false
     * scoresIncreasing([1, 1, 4]) → true
     */
    public boolean scoresIncreasing(int[] scores) {
        boolean ret = true;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                ret = false;
            }
        }

        return ret;
    }

    /**
     * Given an array of scores, return true if there are scores of 100 next to each
     * other in the array. The array length will be at least 2.
     * 
     * scores100([1, 100, 100]) → true scores100([1, 100, 99, 100]) → false
     * scores100([100, 1, 100, 100]) → true
     */
    public boolean scores100(int[] scores) {
        boolean ret = false;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == 100 && scores[i] == scores[i - 1]) {
                ret = true;
            }
        }

        return ret;
    }

    /**
     * Given an array of scores sorted in increasing order, return true if the array
     * contains 3 adjacent scores that differ from each other by at most 2, such as
     * with {3, 4, 5} or {3, 5, 5}.
     * 
     * scoresClump([3, 4, 5]) → true scoresClump([3, 4, 6]) → false scoresClump([1,
     * 3, 5, 5]) → true
     */
    public boolean scoresClump(int[] scores) {
        if (scores.length < 3) {
            return false;
        }

        for (int i = 2; i < scores.length; i++) {
            if (checkDiff(scores[i], scores[i - 1]) && checkDiff(scores[i - 1], scores[i - 2])
                    && checkDiff(scores[i], scores[i - 2])) {
                return true;
            }
        }

        return false;
    }

    public boolean checkDiff(int one, int two) {
        return Math.abs(one - two) <= 2;
    }

    /**
     * 
     * Given an array of scores, compute the int average of the first half and the
     * second half, and return whichever is larger. We'll say that the second half
     * begins at index length/2. The array length will be at least 2. To practice
     * decomposition, write a separate helper method int average(int[] scores, int
     * start, int end) { which computes the average of the elements between indexes
     * start..end. Call your helper method twice to implement scoresAverage(). Write
     * your helper method after your scoresAverage() method in the JavaBat text
     * area. Normally you would compute averages with doubles, but here we use ints
     * so the expected results are exact.
     * 
     * scoresAverage([2, 2, 4, 4]) → 4 scoresAverage([4, 4, 4, 2, 2, 2]) → 4
     * scoresAverage([3, 4, 5, 1, 2, 3]) → 4
     */
    public int scoresAverage(int[] scores) {

        return Math.max(average(scores, 0, scores.length / 2), average(scores, scores.length / 2, scores.length));
    }

    public int average(int[] scores, int start, int end) {
        int average = 0;
        for (int i = start; i < end; i++) {
            average += scores[i];
        }

        average = average / (end - start);

        return average;
    }

    /**
     * Given an array of strings, return the count of the number of strings with the
     * given length.
     * 
     * wordsCount(["a", "bb", "b", "ccc"], 1) → 2 wordsCount(["a", "bb", "b",
     * "ccc"], 3) → 1 wordsCount(["a", "bb", "b", "ccc"], 4) → 0
     */
    public int wordsCount(String[] words, int len) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                count++;
            }
        }

        return count;
    }

    /**
     * Given an array of strings, return a new array containing the first N strings.
     * N will be in the range 1..length.
     * 
     * wordsFront(["a", "b", "c", "d"], 1) → ["a"] wordsFront(["a", "b", "c", "d"],
     * 2) → ["a", "b"] wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
     */
    public String[] wordsFront(String[] words, int n) {
        String[] ret = new String[n];

        for (int i = 0; i < n; i++) {
            ret[i] = words[i];
        }

        return ret;
    }

    /**
     * 
     * Given an array of strings, return a new List (e.g. an ArrayList) where all
     * the strings of the given length are omitted. See wordsWithout() below which
     * is more difficult because it uses arrays.
     * 
     * wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
     * wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
     * wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
     */
    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> retWords = new ArrayList<String>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                retWords.add(words[i]);
            }
        }

        return retWords;
    }

    /**
     * Given a positive int n, return true if it contains a 1 digit. Note: use % to
     * get the rightmost digit, and / to discard the rightmost digit.
     * 
     * hasOne(10) → true hasOne(22) → false hasOne(220) → false
     */
    public boolean hasOne(int n) {
        while (n > 0) {
            if (n % 10 == 1) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }

    /**
     * We'll say that a positive int divides itself if every digit in the number
     * divides into the number evenly. So for example 128 divides itself since 1, 2,
     * and 8 all divide into 128 evenly. We'll say that 0 does not divide into
     * anything evenly, so no number with a 0 digit divides itself. Note: use % to
     * get the rightmost digit, and / to discard the rightmost digit.
     * 
     * dividesSelf(128) → true dividesSelf(12) → true dividesSelf(120) → false
     */
    public boolean dividesSelf(int n) {
        int digit = n;

        boolean ret = true;

        while (digit > 0) {
            if (digit % 10 == 0) {
                return false;
            }
            if ((n % (digit % 10)) != 0) {
                ret = false;
            }
            digit = digit / 10;
        }

        return ret;
    }

    /**
     * Given an array of positive ints, return a new array of length "count"
     * containing the first even numbers from the original array. The original array
     * will contain at least "count" even numbers.
     * 
     * copyEvens([3, 2, 4, 5, 8], 2) → [2, 4] copyEvens([3, 2, 4, 5, 8], 3) → [2, 4,
     * 8] copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
     */
    public int[] copyEvens(int[] nums, int count) {
        int[] nums2 = new int[count];
        int j = 0;
        for (int i = 0; j < count; i++) {
            if (nums[i] % 2 == 0) {
                nums2[j] = nums[i];
                j++;
            }
        }
        return nums2;
    }

}