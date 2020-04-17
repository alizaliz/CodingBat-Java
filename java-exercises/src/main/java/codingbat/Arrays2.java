package codingbat;

/**
 * Medium array problems -- 1 loop. See the Java Arrays and Loops document for
 * help. https://codingbat.com/doc/java-array-loops.html
 */

public class Arrays2 {

    /**
     * Return the number of even ints in the given array. Note: the % "mod" operator
     * computes the remainder, e.g. 5 % 2 is 1. countEvens([2, 1, 2, 3, 4]) → 3
     * countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
     */
    public int countEvens(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    /**
     * Given an array length 1 or more of ints, return the difference between the
     * largest and smallest values in the array. Note: the built-in Math.min(v1, v2)
     * and Math.max(v1, v2) methods return the smaller or larger of two values.
     * 
     * bigDiff([10, 3, 5, 6]) → 7 bigDiff([7, 2, 10, 9]) → 8 bigDiff([2, 10, 7, 2])
     * → 8
     */
    public int bigDiff(int[] nums) {
        int max = 0;
        int min = 99999999;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        return max - min;
    }

    /**
     * Return the "centered" average of an array of ints, which we'll say is the
     * mean average of the values, except ignoring the largest and smallest values
     * in the array. If there are multiple copies of the smallest value, ignore just
     * one copy, and likewise for the largest value. Use int division to produce the
     * final average. You may assume that the array is length 3 or more.
     * 
     * centeredAverage([1, 2, 3, 4, 100]) → 3 centeredAverage([1, 1, 5, 5, 10, 8,
     * 7]) → 5 centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
     */
    public int centeredAverage(int[] nums) {

        int max = 0;
        int min = 9999;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);

        }

        int minCount = 0;
        int maxCount = 0;
        int sum = 0;
        float divider = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min && minCount == 0) {
                minCount++;
                continue;
            }

            if (nums[i] == max && maxCount == 0) {
                maxCount++;
                continue;
            }
            sum += nums[i];
            divider++;
        }

        return Math.round(sum / divider);
    }

    /**
     * Return the sum of the numbers in the array, returning 0 for an empty array.
     * Except the number 13 is very unlucky, so it does not count and numbers that
     * come immediately after a 13 also do not count. sum13([1, 2, 2, 1]) → 6
     * sum13([1, 1]) → 2 sum13([1, 2, 2, 1, 13]) → 6
     * 
     */
    public int sum13(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sum += nums[i];
            } else {
                i++;
            }
        }

        return sum;
    }

    /**
     * Return the sum of the numbers in the array, except ignore sections of numbers
     * starting with a 6 and extending to the next 7 (every 6 will be followed by at
     * least one 7). Return 0 for no numbers.
     * 
     * sum67([1, 2, 2]) → 5 sum67([1, 2, 2, 6, 99, 99, 7]) → 5 sum67([1, 1, 6, 7,
     * 2]) → 4
     * 
     */
    public int sum67(int[] nums) {

        int sum = 0;
        boolean ignore = false;
        for (int i = 0; i < nums.length; i++) {
            if (!ignore && nums[i] == 6) {
                ignore = true;
            }

            if (!ignore)
                sum += nums[i];

            if (ignore && nums[i] == 7) {
                ignore = false;
            }

        }

        return sum;
    }

    /**
     * Given an array of ints, return true if the array contains a 2 next to a 2
     * somewhere.
     * 
     * has22([1, 2, 2]) → true has22([1, 2, 1, 2]) → false has22([2, 1, 2]) → false
     * 
     */
    public boolean has22(int[] nums) {
        boolean has22 = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                has22 = true;
            }
        }

        return has22;
    }

}