package codingbat;

import java.util.ArrayList;
import java.util.List;

/**
 * Functional filtering and mapping operations on lists with lambdas. See the
 * Java Functional Filtering page for an introduction. The main computation for
 * each of these problems can be done with 1 or 2 lines of lambda code.
 */
public final class Functional2 {

    /**
     * Given a list of integers, return a list of the integers, omitting any that
     * are less than 0.
     * 
     * noNeg([1, -2]) → [1] noNeg([-3, -3, 3, 3]) → [3, 3] noNeg([-1, -1, -1]) → []
     */
    public List<Integer> noNeg(List<Integer> nums) {
        List<Integer> ret = new ArrayList<Integer>(nums);
        ret.removeIf(n -> n < 0);
        return ret;
    }

    /**
     * Given a list of non-negative integers, return a list of those numbers except
     * omitting any that end with 9. (Note: % by 10)
     * 
     * no9([1, 2, 19]) → [1, 2] no9([9, 19, 29, 3]) → [3] no9([1, 2, 3]) → [1, 2, 3]
     */
    public List<Integer> no9(List<Integer> nums) {
        List<Integer> ret = new ArrayList<Integer>(nums);
        ret.removeIf(n -> n % 10 == 9);
        return ret;
    }

}