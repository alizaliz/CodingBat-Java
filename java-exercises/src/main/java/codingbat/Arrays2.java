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

    /**
     * Given an array of ints, return true if the array contains no 1's and no 3's.
     * 
     * lucky13([0, 2, 4]) → true lucky13([1, 2, 3]) → false lucky13([1, 2, 4]) →
     * false
     */
    public boolean lucky13(int[] nums) {
        boolean lucky13 = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                lucky13 = false;
            }
        }

        return lucky13;
    }

    /**
     * Given an array of ints, return true if the sum of all the 2's in the array is
     * exactly 8.
     * 
     * sum28([2, 3, 2, 2, 4, 2]) → true sum28([2, 3, 2, 2, 4, 2, 2]) → false
     * sum28([1, 2, 3, 4]) → false
     */
    public boolean sum28(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += 2;
            }
        }

        return sum == 8;
    }

    /**
     * Given an array of ints, return true if the number of 1's is greater than the
     * number of 4's
     * 
     * more14([1, 4, 1]) → true more14([1, 4, 1, 4]) → false more14([1, 1]) → true
     */
    public boolean more14(int[] nums) {
        int num1s = 0;
        int num4s = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                num1s++;
            }
            if (nums[i] == 4) {
                num4s++;
            }
        }

        return num1s > num4s;
    }

    /**
     * Given a number n, create and return a new int array of length n, containing
     * the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return
     * a length 0 array. You do not need a separate if-statement for the length-0
     * case; the for-loop should naturally execute 0 times in that case, so it just
     * works. The syntax to make a new int array is: new int[desired_length] (See
     * also: FizzBuzz Code)
     * 
     * 
     * fizzArray(4) → [0, 1, 2, 3] fizzArray(1) → [0] fizzArray(10) → [0, 1, 2, 3,
     * 4, 5, 6, 7, 8, 9]
     */
    public int[] fizzArray(int n) {
        int[] fizz = new int[n];

        for (int i = 0; i < n; i++) {
            fizz[i] = i;
        }

        return fizz;
    }

    /**
     * Given an array of ints, return true if every element is a 1 or a 4.
     * 
     * 
     * only14([1, 4, 1, 4]) → true only14([1, 4, 2, 4]) → false only14([1, 1]) →
     * true
     * 
     */
    public boolean only14(int[] nums) {
        boolean only14 = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 || nums[i] == 1) {
                continue;
            }
            only14 = false;
        }

        return only14;
    }

    /**
     * Given a number n, create and return a new string array of length n,
     * containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case
     * just return a length 0 array. Note: String.valueOf(xxx) will make the String
     * form of most types. The syntax to make a new string array is: new
     * String[desired_length] (See also: FizzBuzz Code)
     * 
     * 
     * fizzArray2(4) → ["0", "1", "2", "3"] fizzArray2(10) → ["0", "1", "2", "3",
     * "4", "5", "6", "7", "8", "9"] fizzArray2(2) → ["0", "1"]
     */
    public String[] fizzArray2(int n) {
        String[] fizz = new String[n];

        for (int i = 0; i < n; i++) {
            fizz[i] = String.valueOf(i);
        }

        return fizz;
    }

    /**
     * Given an array of ints, return true if it contains no 1's or it contains no
     * 4's.
     * 
     * 
     * no14([1, 2, 3]) → true no14([1, 2, 3, 4]) → false no14([2, 3, 4]) → true
     */
    public boolean no14(int[] nums) {
        boolean no1 = true;
        boolean no4 = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                no1 = false;
            }
            if (nums[i] == 4) {
                no4 = false;
            }
        }

        return no1 || no4;
    }

    /**
     * We'll say that a value is "everywhere" in an array if for every pair of
     * adjacent elements in the array, at least one of the pair is that value.
     * Return true if the given value is everywhere in the array.
     * 
     * 
     * isEverywhere([1, 2, 1, 3], 1) → true isEverywhere([1, 2, 1, 3], 2) → false
     * isEverywhere([1, 2, 1, 3, 4], 1) → false
     */
    public boolean isEverywhere(int[] nums, int val) {
        boolean isEverywhere = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == val || nums[i + 1] == val) {
                continue;
            }
            isEverywhere = false;
        }

        return isEverywhere;
    }

    /**
     * Given an array of ints, return true if the array contains a 2 next to a 2 or
     * a 4 next to a 4, but not both.
     * 
     * 
     * either24([1, 2, 2]) → true either24([4, 4, 1]) → true either24([4, 4, 1, 2,
     * 2]) → false
     */
    public boolean either24(int[] nums) {
        boolean either2 = false;
        boolean either4 = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                either2 = true;
            }
            if (nums[i] == 4 && nums[i + 1] == 4) {
                either4 = true;
            }
        }

        return either2 ^ either4;
    }

    /**
     * Given arrays nums1 and nums2 of the same length, for every element in nums1,
     * consider the corresponding element in nums2 (at the same index). Return the
     * count of the number of times that the two elements differ by 2 or less, but
     * are not equal.
     * 
     * 
     * matchUp([1, 2, 3], [2, 3, 10]) → 2 matchUp([1, 2, 3], [2, 3, 5]) → 3
     * matchUp([1, 2, 3], [2, 3, 3]) → 2
     */
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) > 0 && Math.abs(nums1[i] - nums2[i]) <= 2) {
                count++;
            }
        }

        return count;
    }

    /**
     * 
     * Given an array of ints, return true if the array contains two 7's next to
     * each other, or there are two 7's separated by one element, such as with {7,
     * 1, 7}.
     * 
     * has77([1, 7, 7]) → true has77([1, 7, 1, 7]) → true has77([1, 7, 1, 1, 7]) →
     * false
     */
    public boolean has77(int[] nums) {

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == 7 && nums[i - 1] == 7 || nums[i] == 7 && nums[i - 2] == 7) {
                return true;
            }
        }

        if (nums.length >= 2 && nums[0] == 7 && nums[1] == 7) {
            return true;
        }

        return false;
    }

    /**
     * Given an array of ints, return true if there is a 1 in the array with a 2
     * somewhere later in the array.
     * 
     * has12([1, 3, 2]) → true has12([3, 1, 2]) → true has12([3, 1, 4, 5, 2]) → true
     */
    public boolean has12(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            switch (flag) {
                case 0:
                    if (nums[i] == 1)
                        flag++;
                    break;
                case 1:
                    if (nums[i] == 2)
                        return true;
                    break;
                default:
                    continue;
            }
        }
        return false;
    }

    /**
     * Given an array of ints, return true if the array contains either 3 even or 3
     * odd values all next to each other.
     * 
     * modThree([2, 1, 3, 5]) → true modThree([2, 1, 2, 5]) → false modThree([2, 4,
     * 2, 5]) → true
     */
    public boolean modThree(int[] nums) {

        int evens = 0;
        int odds = 0;

        for (int i = 0; i < nums.length; i++) {
            switch (nums[i] % 2) {
                case 0:
                    evens++;
                    odds = 0;
                    break;
                case 1:
                    odds++;
                    evens = 0;
                    break;
            }

            if (evens >= 3 || odds >= 3) {
                return true;
            }
        }

        return false;
    }

    /**
     * Given an array of ints, return true if the value 3 appears in the array
     * exactly 3 times, and no 3's are next to each other.
     * 
     * haveThree([3, 1, 3, 1, 3]) → true haveThree([3, 1, 3, 3]) → false
     * haveThree([3, 4, 3, 3, 4]) → false
     */
    public boolean haveThree(int[] nums) {
        int count3 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count3++;
                if (i + 1 < nums.length && nums[i + 1] == 3) {
                    return false;
                }
            }
        }

        return count3 == 3;
    }

    /**
     * Given an array of ints, return true if every 2 that appears in the array is
     * next to another 2.
     * 
     * twoTwo([4, 2, 2, 3]) → true twoTwo([2, 2, 4]) → true twoTwo([2, 2, 4, 2]) →
     * false
     */
    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                if ((i > 0 && nums[i - 1] == 2) || (i < nums.length - 1 && nums[i + 1] == 2)) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Return true if the group of N numbers at the start and end of the array are
     * the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same
     * for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the
     * range 0..nums.length inclusive.
     * 
     * sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false sameEnds([5, 6, 45, 99, 13, 5,
     * 6], 2) → true sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
     */
    public boolean sameEnds(int[] nums, int len) {
        if (len > nums.length) {
            return false;
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[nums.length - (len - i)]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Return true if the array contains, somewhere, three increasing adjacent
     * numbers like .... 4, 5, 6, ... or 23, 24, 25.
     * 
     * 
     * tripleUp([1, 4, 5, 6, 2]) → true tripleUp([1, 2, 3]) → true tripleUp([1, 2,
     * 4]) → false
     */
    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2) {
                return true;
            }
        }

        return false;
    }

    /**
     * Given start and end numbers, return a new array containing the sequence of
     * integers from start up to but not including end, so start=5 and end=10 yields
     * {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number.
     * Note that a length-0 array is valid. (See also: FizzBuzz Code)
     * 
     * 
     * fizzArray3(5, 10) → [5, 6, 7, 8, 9] fizzArray3(11, 18) → [11, 12, 13, 14, 15,
     * 16, 17] fizzArray3(1, 3) → [1, 2]
     */
    public int[] fizzArray3(int start, int end) {
        int[] ret = new int[end - start];

        for (int i = 0; i < end - start; i++) {
            ret[i] = start + i;
        }

        return ret;
    }

    /**
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2,
     * 5, 3, 6}. You may modify and return the given array, or return a new array.
     * 
     * 
     * shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6] shiftLeft([1, 2]) → [2, 1]
     * shiftLeft([1]) → [1]
     */
    public int[] shiftLeft(int[] nums) {

        int[] ret = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                ret[i] = nums[i + 1];
            } else {
                ret[nums.length - 1] = nums[0];
            }
        }

        return ret;

    }

    /**
     * For each multiple of 10 in the given array, change all the values following
     * it to be that multiple of 10, until encountering another multiple of 10. So
     * {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
     * 
     * 
     * tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20] tenRun([10, 1, 20, 2])
     * → [10, 10, 20, 20] tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
     */
    public int[] tenRun(int[] nums) {
        int[] ret = new int[nums.length];

        int runNum = 0;
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                runNum = nums[i];
                flag = true;
            }

            if (!flag) {
                ret[i] = nums[i];
            } else {
                ret[i] = runNum;
            }
        }

        return ret;
    }

    /**
     * Given a non-empty array of ints, return a new array containing the elements
     * from the original array that come before the first 4 in the original array.
     * The original array will contain at least one 4. Note that it is valid in java
     * to create an array of length 0.
     * 
     * 
     * pre4([1, 2, 4, 1]) → [1, 2] pre4([3, 1, 4]) → [3, 1] pre4([1, 4, 4]) → [1]
     */
    public int[] pre4(int[] nums) {

        int length = 0;

        while (length < nums.length && nums[length] != 4) {
            length++;
        }

        int[] ret = new int[length];

        for (int i = 0; i < length; i++) {
            ret[i] = nums[i];
        }

        return ret;
    }

}