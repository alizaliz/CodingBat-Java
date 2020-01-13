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

    /**
     * Given a list of integers, return a list of those numbers, omitting any that
     * are between 13 and 19 inclusive.
     * 
     * noTeen([12, 13, 19, 20]) → [12, 20] noTeen([1, 14, 1]) → [1, 1] noTeen([15])
     * → []
     */
    public List<Integer> noTeen(List<Integer> nums) {
        List<Integer> ret = new ArrayList<Integer>(nums);
        ret.removeIf(n -> n >= 13 && n <= 19);
        return ret;
    }

    /**
     * Given a list of strings, return a list of the strings, omitting any string
     * that contains a "z". (Note: the str.contains(x) method returns a boolean)
     * 
     * noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"] noZ(["hziz", "hzello", "hi"]) →
     * ["hi"] noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
     */
    public List<String> noZ(List<String> strings) {
        List<String> ret = new ArrayList<String>(strings);
        ret.removeIf(n -> n.contains("z"));
        return ret;
    }

    /**
     * Given a list of strings, return a list of the strings, omitting any string
     * length 4 or more.
     * 
     * noLong(["this", "not", "too", "long"]) → ["not", "too"] noLong(["a", "bbb",
     * "cccc"]) → ["a", "bbb"] noLong(["cccc", "cccc", "cccc"]) → []
     */
    public List<String> noLong(List<String> strings) {
        List<String> ret = new ArrayList<String>(strings);
        ret.removeIf(n -> n.length() >= 4);
        return ret;
    }

}