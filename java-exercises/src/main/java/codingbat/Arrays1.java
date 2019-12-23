package codingbat;

/**
 * Basic array problems -- no loops.. Use a[0], a[1], ... to access elements in
 * an array, a.length is the length (note that s.length() is for Strings).
 * Allocate a new array like this: int[] a = new int[10]; // length 10 array
 */

public final class Arrays1 {

    /**
     * Given an array of ints, return true if 6 appears as either the first or last
     * element in the array. The array will be length 1 or more.
     * 
     * firstLast6([1, 2, 6]) → true firstLast6([6, 1, 2, 3]) → true firstLast6([13,
     * 6, 1, 2, 3]) → false
     */
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    /**
     * Given an array of ints, return true if the array is length 1 or more, and the
     * first element and the last element are equal.
     * 
     * sameFirstLast([1, 2, 3]) → false sameFirstLast([1, 2, 3, 1]) → true
     * sameFirstLast([1, 2, 1]) → true
     */
    public boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1) {
            return nums[0] == nums[nums.length - 1];
        }
        return false;
    }

}