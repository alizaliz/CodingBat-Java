package codingbat;

/**
 * Basic boolean logic puzzles -- if else && || !.
 */

public final class Logic1 {

    /**
     * When squirrels get together for a party, they like to have cigars. A squirrel
     * party is successful when the number of cigars is between 40 and 60,
     * inclusive. Unless it is the weekend, in which case there is no upper bound on
     * the number of cigars. Return true if the party with the given values is
     * successful, or false otherwise.
     * 
     * cigarParty(30, false) → false cigarParty(50, false) → true cigarParty(70,
     * true) → true
     */
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        }
        return cigars >= 40 && cigars <= 60;
    }

    /**
     * You and your date are trying to get a table at a restaurant. The parameter
     * "you" is the stylishness of your clothes, in the range 0..10, and "date" is
     * the stylishness of your date's clothes. The result getting the table is
     * encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very
     * stylish, 8 or more, then the result is 2 (yes). With the exception that if
     * either of you has style of 2 or less, then the result is 0 (no). Otherwise
     * the result is 1 (maybe).
     * 
     * dateFashion(5, 10) → 2 dateFashion(5, 2) → 0 dateFashion(5, 5) → 1
     */
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        }
        return 1;
    }

    /**
     * The squirrels in Palo Alto spend most of the day playing. In particular, they
     * play if the temperature is between 60 and 90 (inclusive). Unless it is
     * summer, then the upper limit is 100 instead of 90. Given an int temperature
     * and a boolean isSummer, return true if the squirrels play and false
     * otherwise.
     * 
     * squirrelPlay(70, false) → true squirrelPlay(95, false) → false
     * squirrelPlay(95, true) → true
     */
    public boolean squirrelPlay(int temp, boolean isSummer) {
        int upper = 90;
        if (isSummer) {
            upper = 100;
        }
        if (temp >= 60 && temp <= upper) {
            return true;
        }
        return false;
    }

    /**
     * You are driving a little too fast, and a police officer stops you. Write code
     * to compute the result, encoded as an int value: 0=no ticket, 1=small ticket,
     * 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61
     * and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2.
     * Unless it is your birthday -- on that day, your speed can be 5 higher in all
     * cases.
     * 
     * caughtSpeeding(60, false) → 0 caughtSpeeding(65, false) → 1
     * caughtSpeeding(65, true) → 0
     */
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday) {
            speed -= 5;
        }
        if (speed > 60 && speed <= 80) {
            return 1;
        }
        if (speed > 80) {
            return 2;
        }
        return 0;
    }

    /**
     * Given 2 ints, a and b, return their sum. However, sums in the range 10..19
     * inclusive, are forbidden, so in that case just return 20.
     * 
     * sortaSum(3, 4) → 7 sortaSum(9, 4) → 20 sortaSum(10, 11) → 21
     */
    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum < 20) {
            return 20;
        }
        return sum;
    }

    /**
     * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a
     * boolean indicating if we are on vacation, return a string of the form "7:00"
     * indicating when the alarm clock should ring. Weekdays, the alarm should be
     * "7:00" and on the weekend it should be "10:00". Unless we are on vacation --
     * then on weekdays it should be "10:00" and weekends it should be "off".
     * 
     * alarmClock(1, false) → "7:00" alarmClock(5, false) → "7:00" alarmClock(0,
     * false) → "10:00"
     */
    public String alarmClock(int day, boolean vacation) {
        switch (day) {
            case 0:
            case 6:
                if (vacation) {
                    return "off";
                } else {
                    return "10:00";
                }
            default:
                if (vacation) {
                    return "10:00";
                } else {
                    return "7:00";
                }
        }
    }

    /**
     * The number 6 is a truly great number. Given two int values, a and b, return
     * true if either one is 6. Or if their sum or difference is 6. Note: the
     * function Math.abs(num) computes the absolute value of a number.
     * 
     * love6(6, 4) → true love6(4, 5) → false love6(1, 5) → true
     */
    public boolean love6(int a, int b) {
        return a == 6 || b == 6 || Math.abs(a - b) == 6 || a + b == 6;
    }

    /**
     * Given a number n, return true if n is in the range 1..10, inclusive. Unless
     * outsideMode is true, in which case return true if the number is less or equal
     * to 1, or greater or equal to 10.
     * 
     * in1To10(5, false) → true in1To10(11, false) → false in1To10(11, true) → true
     */
    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        }

        return n >= 1 && n <= 10;
    }

    /**
     * We'll say a number is special if it is a multiple of 11 or if it is one more
     * than a multiple of 11. Return true if the given non-negative number is
     * special. Use the % "mod" operator -- see Introduction to Mod :
     * https://codingbat.com/doc/practice/mod-introduction.html
     * 
     * specialEleven(22) → true specialEleven(23) → true specialEleven(24) → false
     */
    public boolean specialEleven(int n) {
        return n % 11 == 0 || (n - 1) % 11 == 0;
    }

    /**
     * Return true if the given non-negative number is 1 or 2 more than a multiple
     * of 20.
     * 
     * more20(20) → false more20(21) → true more20(22) → true
     */
    public boolean more20(int n) {
        return (n - 1) % 20 == 0 || (n - 2) % 20 == 0;
    }

    /**
     * Return true if the given non-negative number is a multiple of 3 or 5, but not
     * both. Use the % "mod" operator
     * 
     * old35(3) → true old35(10) → true old35(15) → false
     */
    public boolean old35(int n) {
        return ((n % 3 == 0) || (n % 5 == 0)) && !(n % 15 == 0);
    }

    /**
     * Return true if the given non-negative number is 1 or 2 less than a multiple
     * of 20. So for example 38 and 39 return true, but 40 returns false.
     * 
     * less20(18) → true less20(19) → true less20(20) → false
     */
    public boolean less20(int n) {
        return ((n + 1) % 20 == 0 || (n + 2) % 20 == 0);
    }

    /**
     * Given a non-negative number "num", return true if num is within 2 of a
     * multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5)
     * is 2.
     * 
     * nearTen(12) → true nearTen(17) → false nearTen(19) → true
     */
    public boolean nearTen(int num) {
        return num % 10 == 0 || (num - 1) % 10 == 0 || (num - 2) % 10 == 0 || (num + 1) % 10 == 0
                || (num + 2) % 10 == 0;
    }

    /**
     * Given 2 ints, a and b, return their sum. However, "teen" values in the range
     * 13..19 inclusive, are extra lucky. So if either value is a teen, just return
     * 19.
     * 
     * teenSum(3, 4) → 7 teenSum(10, 13) → 19 teenSum(13, 2) → 19
     */
    public int teenSum(int a, int b) {
        if (isTeen(a) || isTeen(b)) {
            return 19;
        }
        return a + b;
    }

    public boolean isTeen(int n) {
        return n >= 13 && n < 20;
    }

    /**
     * Your cell phone rings. Return true if you should answer it. Normally you
     * answer, except in the morning you only answer if it is your mom calling. In
     * all cases, if you are asleep, you do not answer.
     * 
     * answerCell(false, false, false) → true answerCell(false, false, true) → false
     * answerCell(true, false, false) → false
     */
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && ((isMorning && isMom) || !isMorning);
    }

    /**
     * We are having a party with amounts of tea and candy. Return the int outcome
     * of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if
     * both tea and candy are at least 5. However, if either tea or candy is at
     * least double the amount of the other one, the party is great (2). However, in
     * all cases, if either tea or candy is less than 5, the party is always bad
     * (0).
     * 
     * teaParty(6, 8) → 1 teaParty(3, 8) → 0 teaParty(20, 6) → 2
     */
    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5)
            return 0;
        if (tea >= (candy * 2) || candy >= (tea * 2))
            return 2;
        else
            return 1;
    }

    /**
     * Given a string str, if the string starts with "f" return "Fizz". If the
     * string ends with "b" return "Buzz". If both the "f" and "b" conditions are
     * true, return "FizzBuzz". In all other cases, return the string unchanged.
     * (See also: FizzBuzz Code)
     * 
     * fizzString("fig") → "Fizz" fizzString("dib") → "Buzz" fizzString("fib") →
     * "FizzBuzz"
     */
    public String fizzString(String str) {
        String ret = "";

        if (str.charAt(0) == 'f')
            ret += "Fizz";
        if (str.charAt(str.length() - 1) == 'b')
            ret += "Buzz";

        if (ret.length() > 1) {
            return ret;
        } else {
            return str;
        }
    }

    /**
     * Given an int n, return the string form of the number followed by "!". So the
     * int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead
     * of the number, and if the number is divisible by 5 use "Buzz", and if
     * divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod" operator
     * computes the remainder after division, so 23 % 10 yields 3. What will the
     * remainder be when one number divides evenly into another? (See also: FizzBuzz
     * Code and Introduction to Mod)
     * 
     * fizzString2(1) → "1!" fizzString2(2) → "2!" fizzString2(3) → "Fizz!"
     */
    public String fizzString2(int n) {
        String ret = "";
        if (n % 3 == 0)
            ret += "Fizz";
        if (n % 5 == 0)
            ret += "Buzz";
        if (!(ret.length() > 1))
            ret += n;

        ret += "!";

        return ret;
    }

    /**
     * Given three ints, a b c, return true if it is possible to add two of the ints
     * to get the third.
     * 
     * twoAsOne(1, 2, 3) → true twoAsOne(3, 1, 2) → true twoAsOne(3, 2, 2) → false
     */
    public boolean twoAsOne(int a, int b, int c) {
        return (a + (b - c)) == 0 || (a - (b + c)) == 0 || (a + (c - b)) == 0 || (a - (c + b)) == 0;
    }

    /**
     * Given three ints, a b c, return true if b is greater than a, and c is greater
     * than b. However, with the exception that if "bOk" is true, b does not need to
     * be greater than a.
     * 
     * inOrder(1, 2, 4, false) → true inOrder(1, 2, 1, false) → false inOrder(1, 1,
     * 2, true) → true
     */
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk)
            return c > b;
        else
            return b > a && c > b;
    }

    /**
     * Given three ints, a b c, return true if they are in strict increasing order,
     * such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception
     * that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
     * 
     * inOrderEqual(2, 5, 11, false) → true inOrderEqual(5, 7, 6, false) → false
     * inOrderEqual(5, 5, 7, true) → true
     */
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk)
            return a <= b && b <= c;
        return a < b && b < c;
    }

}