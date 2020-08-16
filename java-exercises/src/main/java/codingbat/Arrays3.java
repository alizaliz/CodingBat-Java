package codingbat;

/**
 * Harder array problems -- 2 loops, more complex logic. See the Java Arrays and
 * Loops document for help.https://codingbat.com/doc/array.html
 */

public class Arrays3 {

    /**
     * Consider the leftmost and righmost appearances of some value in an array.
     * We'll say that the "span" is the number of elements between the two
     * inclusive. A single value has a span of 1. Returns the largest span found in
     * the given array. (Efficiency is not a priority.)
     * 
     * 
     * maxSpan([1, 2, 1, 1, 3]) → 4 maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6 maxSpan([1,
     * 4, 2, 1, 4, 4, 4]) → 6
     */
    public int maxSpan(int[] nums) {
        int span = 0;

        for (int i = 0; i < nums.length; i++) {
            if (span > nums.length - i) {
                break;
            }

            int temp = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    temp = j - i + 1; // +1 due to 0 indexed array
                }
            }

            if (temp > span) {
                span = temp;
            }
        }

        return span;
    }

    /**
     * Return an array that contains exactly the same numbers as the given array,
     * but rearranged so that every 3 is immediately followed by a 4. Do not move
     * the 3's, but every other number may move. The array contains the same number
     * of 3's and 4's, every 3 has a number after it that is not a 3, and a 3
     * appears in the array before any 4.
     * 
     * 
     * fix34([1, 3, 1, 4]) → [1, 3, 4, 1] fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4,
     * 1, 1, 3, 4] fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
     */
    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                int j = i;
                while (true) {
                    if (nums[j] == 4 && (j == 0 || nums[j - 1] != 3)) {
                        break;
                    }
                    j = j + 1 >= nums.length ? 0 : j + 1;
                }
                nums = swapValues(nums, i + 1, j);
            }
        }

        return nums;

    }

    public int[] swapValues(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        return nums;
    }

    /**
     * (This is a slightly harder version of the fix34 problem.) Return an array
     * that contains exactly the same numbers as the given array, but rearranged so
     * that every 4 is immediately followed by a 5. Do not move the 4's, but every
     * other number may move. The array contains the same number of 4's and 5's, and
     * every 4 has a number after it that is not a 4. In this version, 5's may
     * appear anywhere in the original array.
     * 
     * 
     * fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9] fix45([1, 4, 1, 5]) → [1, 4,
     * 5, 1] fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
     */
    public int[] fix45(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i - 1] == 4 && nums[i] != 5) {
                int j = 0;
                for (; j < nums.length; j++) {
                    if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
                        break;
                    }
                }
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }

        }

        return nums;
    }

    /**
     * Given a non-empty array, return true if there is a place to split the array
     * so that the sum of the numbers on one side is equal to the sum of the numbers
     * on the other side.
     * 
     * 
     * canBalance([1, 1, 1, 2, 1]) → true canBalance([2, 1, 1, 2, 1]) → false
     * canBalance([10, 10]) → true
     */
    public boolean canBalance(int[] nums) {
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
        }

        for (int i = nums.length - 1; i > 0; i--) {
            sum1 -= nums[i];
            sum2 += nums[i];
            if (sum1 == sum2) {
                return true;
            }
        }

        return false;
    }

    /**
     * Given two arrays of ints sorted in increasing order, outer and inner, return
     * true if all of the numbers in inner appear in outer. The best solution makes
     * only a single "linear" pass of both arrays, taking advantage of the fact that
     * both arrays are already in sorted order.
     * 
     * 
     * linearIn([1, 2, 4, 6], [2, 4]) → true linearIn([1, 2, 4, 6], [2, 3, 4]) →
     * false linearIn([1, 2, 4, 4, 6], [2, 4]) → true
     */
    public boolean linearIn(int[] outer, int[] inner) {

        if (inner.length == 0)
            return true;

        int match = 0;

        for (int i = 0; i < outer.length && match < inner.length; i++) {
            if (outer[i] == inner[match]) {
                match++;
            }
        }

        return match == inner.length;
    }

}