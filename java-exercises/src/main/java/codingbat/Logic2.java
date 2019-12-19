package codingbat;

/**
 * Medium boolean logic puzzles -- if else && || !
 */
public final class Logic2 {

    /**
     * We want to make a row of bricks that is goal inches long. We have a number of
     * small bricks (1 inch each) and big bricks (5 inches each). Return true if it
     * is possible to make the goal by choosing from the given bricks. This is a
     * little harder than it looks and can be done without any loops. See also:
     * Introduction to MakeBricks
     * 
     * makeBricks(3, 1, 8) → true makeBricks(3, 1, 9) → false makeBricks(3, 2, 10) →
     * true
     */
    public boolean makeBricks(int small, int big, int goal) {
        if (small == goal || 5 * big == goal) {
            return true;
        }

        int remainder = goal % 5;
        int required = (goal - remainder) / 5;

        if ((required <= big && (goal - (5 * required)) <= small)
                || ((goal - big * 5) >= 0 && (goal - big * 5) <= small)) {
            return true;
        }
        return false;
    }

    /**
     * Given 3 int values, a b c, return their sum. However, if one of the values is
     * the same as another of the values, it does not count towards the sum.
     * 
     * loneSum(1, 2, 3) → 6 loneSum(3, 2, 3) → 2 loneSum(3, 3, 3) → 0
     */
    public int loneSum(int a, int b, int c) {
        int sum = 0;

        if (a != b && a != c) {
            sum += a;
        }
        if (b != a && b != c) {
            sum += b;
        }
        if (c != a && c != b) {
            sum += c;
        }

        return sum;
    }

}