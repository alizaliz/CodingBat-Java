package codingbat;

/**
 * Harder recursion problems. Currently, these are all recursive backtracking
 * problems with arrays.
 */
public final class Recursion2 {

    /**
     * Given an array of ints, is it possible to choose a group of some of the ints,
     * such that the group sums to the given target? This is a classic backtracking
     * recursion problem. Once you understand the recursive backtracking strategy in
     * this problem, you can use the same pattern for many problems to search a
     * space of choices. Rather than looking at the whole array, our convention is
     * to consider the part of the array starting at index start and continuing to
     * the end of the array. The caller can specify the whole array simply by
     * passing start as 0. No loops are needed -- the recursive calls progress down
     * the array.
     * 
     * 
     * groupSum(0, [2, 4, 8], 10) → true groupSum(0, [2, 4, 8], 14) → true
     * groupSum(0, [2, 4, 8], 9) → false
     */
    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {
            if (target == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
        }
    }

    /**
     * Given an array of ints, is it possible to choose a group of some of the ints,
     * beginning at the start index, such that the group sums to the given target?
     * However, with the additional constraint that all 6's must be chosen. (No
     * loops needed.)
     * 
     * groupSum6(0, [5, 6, 2], 8) → true groupSum6(0, [5, 6, 2], 9) → false
     * groupSum6(0, [5, 6, 2], 7) → false
     */
    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) {
            if (target == 0) {
                return true;
            }
            return false;
        }
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - 6);
        }
        return groupSum6(start + 1, nums, target) || groupSum6(start + 1, nums, target - nums[start]);
    }

    /**
     * Given an array of ints, is it possible to choose a group of some of the ints,
     * such that the group sums to the given target with this additional constraint:
     * If a value in the array is chosen to be in the group, the value immediately
     * following it in the array must not be chosen. (No loops needed.)
     * 
     * groupNoAdj(0, [2, 5, 10, 4], 12) → true groupNoAdj(0, [2, 5, 10, 4], 14) →
     * false groupNoAdj(0, [2, 5, 10, 4], 7) → false
     */
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {
            if (target == 0) {
                return true;
            }
            return false;
        }
        return groupNoAdj(start + 1, nums, target) || groupNoAdj(start + 2, nums, target - nums[start]);
    }

    /**
     * Given an array of ints, is it possible to choose a group of some of the ints,
     * such that the group sums to the given target with these additional
     * constraints: all multiples of 5 in the array must be included in the group.
     * If the value immediately following a multiple of 5 is 1, it must not be
     * chosen. (No loops needed.)
     * 
     * groupSum5(0, [2, 5, 10, 4], 19) → true groupSum5(0, [2, 5, 10, 4], 17) → true
     * groupSum5(0, [2, 5, 10, 4], 12) → false
     */
    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            if (target == 0) {
                return true;
            }
            return false;
        }
        if (nums[start] % 5 == 0) {
            return groupSum5(start + 1, nums, target - nums[start]);
        }
        if (nums[start] == 1) {
            if ((start > 0 && nums[start - 1] % 5 != 0) || (start == 0)) {
                return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
            }
            return groupSum5(start + 1, nums, target);
        }
        return groupSum5(start + 1, nums, target) || groupSum5(start + 1, nums, target - nums[start]);
    }

    /**
     * Given an array of ints, is it possible to choose a group of some of the ints,
     * such that the group sums to the given target, with this additional
     * constraint: if there are numbers in the array that are adjacent and the
     * identical value, they must either all be chosen, or none of them chosen. For
     * example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the
     * middle must be chosen or not, all as a group. (one loop can be used to find
     * the extent of the identical values).
     * 
     * groupSumClump(0, [2, 4, 8], 10) → true groupSumClump(0, [1, 2, 4, 8, 1], 14)
     * → true groupSumClump(0, [2, 4, 4, 8], 14) → false
     */
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            if (target == 0) {
                return true;
            }
            return false;
        }
        int i = 1;
        for (; start + i < nums.length; i++) {
            if (nums[start] != nums[start + i]) {
                break;
            }
        }
        if (i > 0) {
            return groupSumClump(start + i, nums, target - (nums[start] * i)) || groupSumClump(start + i, nums, target);
        }
        return groupSumClump(start + 1, nums, target - nums[start]) || groupSumClump(start + 1, nums, target);
    }

    /**
     * Given an array of ints, is it possible to divide the ints into two groups, so
     * that the sums of the two groups are the same. Every int must be in one group
     * or the other. Write a recursive helper method that takes whatever arguments
     * you like, and make the initial call to your recursive helper from
     * splitArray(). (No loops needed.)
     * 
     * splitArray([2, 2]) → true splitArray([2, 3]) → false splitArray([5, 2, 3]) →
     * true
     */
    public boolean splitArray(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        int i = 0;
        return sumParts(nums, i, sum1, sum2);
    }

    public boolean sumParts(int[] nums, int index, int sum1, int sum2) {
        if (index >= nums.length) {
            return sum1 == sum2;
        }
        return sumParts(nums, index + 1, sum1 + nums[index], sum2)
                || sumParts(nums, index + 1, sum1, sum2 + nums[index]);
    }

}