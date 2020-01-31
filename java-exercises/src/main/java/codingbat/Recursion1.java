package codingbat;

/**
 * Basic recursion problems. Recursion strategy: first test for one or two base
 * cases that are so simple, the answer can be returned immediately. Otherwise,
 * make a recursive a call for a smaller case (that is, a case which is a step
 * towards the base case). Assume that the recursive call works correctly, and
 * fix up what it returns to make the answer.
 */
public final class Recursion1 {

    /**
     * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2)
     * ... 1. Compute the result recursively (without loops).
     * 
     * factorial(1) → 1 factorial(2) → 2 factorial(3) → 6
     */
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * We have a number of bunnies and each bunny has two big floppy ears. We want
     * to compute the total number of ears across all the bunnies recursively
     * (without loops or multiplication).
     * 
     * bunnyEars(0) → 0 bunnyEars(1) → 2 bunnyEars(2) → 4
     */
    public int bunnyEars(int bunnies) {

        if (bunnies == 0) {
            return 0;
        } else {
            return 2 + bunnyEars(bunnies - 1);
        }
    }

    /**
     * The fibonacci sequence is a famous bit of mathematics, and it happens to have
     * a recursive definition. The first two values in the sequence are 0 and 1
     * (essentially 2 base cases). Each subsequent value is the sum of the previous
     * two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
     * Define a recursive fibonacci(n) method that returns the nth fibonacci number,
     * with n=0 representing the start of the sequence.
     * 
     * fibonacci(0) → 0 fibonacci(1) → 1 fibonacci(2) → 1
     */
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3,
     * ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3
     * ears, because they each have a raised foot. Recursively return the number of
     * "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
     * 
     * bunnyEars2(0) → 0 bunnyEars2(1) → 2 bunnyEars2(2) → 5
     */
    public int bunnyEars2(int bunnies) {
        int ears = 0;
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 > 0) {
            ears = 2;
        } else if (bunnies % 2 == 0) {
            ears = 3;
        }
        return ears + bunnyEars2(bunnies - 1);
    }

    /**
     * We have triangle made of blocks. The topmost row has 1 block, the next row
     * down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively
     * (no loops or multiplication) the total number of blocks in such a triangle
     * with the given number of rows.
     * 
     * triangle(0) → 0 triangle(1) → 1 triangle(2) → 3
     */
    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        } else if (rows == 1) {
            return 1;
        }

        return rows + triangle(rows - 1);
    }

    /**
     * Given a non-negative int n, return the sum of its digits recursively (no
     * loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
     * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     * 
     * sumDigits(126) → 9 sumDigits(49) → 13 sumDigits(12) → 3
     */
    public int sumDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return sumDigits(n % 10) + sumDigits(n / 10);
        }
    }

    /**
     * Given a non-negative int n, return the count of the occurrences of 7 as a
     * digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10
     * yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
     * the rightmost digit (126 / 10 is 12).
     * 
     * count7(717) → 2 count7(7) → 1 count7(123) → 0
     */
    public int count7(int n) {
        if (n == 7) {
            return 1;
        } else if (n < 10) {
            return 0;
        }

        return count7(n / 10) + count7(n % 10);
    }

    /**
     * Given a non-negative int n, compute recursively (no loops) the count of the
     * occurrences of 8 as a digit, except that an 8 with another 8 immediately to
     * its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the
     * rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost
     * digit (126 / 10 is 12).
     * 
     * count8(8) → 1 count8(818) → 2 count8(8818) → 4
     */
    public int count8(int n) {
        if (n == 0) {
            return 0;
        }
        int last = n % 10;
        n = n / 10;
        if (last == 8 && n % 10 == 8) {
            return 2 + count8(n);
        }
        if (last == 8) {
            return 1 + count8(n);
        }
        return count8(n);
    }

    /**
     * Given base and n that are both 1 or more, compute recursively (no loops) the
     * value of base to the n power, so powerN(3, 2) is 9 (3 squared).
     * 
     * powerN(3, 1) → 3 powerN(3, 2) → 9 powerN(3, 3) → 27
     */
    public int powerN(int base, int n) {
        if (n == 1) {
            return base;
        }
        return base * powerN(base, n - 1);
    }

    /**
     * Given a string, compute recursively (no loops) the number of lowercase 'x'
     * chars in the string.
     * 
     * countX("xxhixx") → 4 countX("xhixhix") → 3 countX("hi") → 0
     */
    public int countX(String str) {
        if (str.length() <= 1) {
            if (str.equals("x"))
                return 1;
            else
                return 0;
        }
        if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1));
        }
        return countX(str.substring(1));
    }

    /**
     * Given a string, compute recursively (no loops) the number of times lowercase
     * "hi" appears in the string.
     * 
     * countHi("xxhixx") → 1 countHi("xhixhix") → 2 countHi("hi") → 1
     */
    public int countHi(String str) {
        if (str.length() <= 2) {
            if (str.equals("hi")) {
                return 1;
            } else {
                return 0;
            }
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(1));
        } else {
            return countHi(str.substring(1));
        }
    }

}