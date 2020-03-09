package codingbat;

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

}