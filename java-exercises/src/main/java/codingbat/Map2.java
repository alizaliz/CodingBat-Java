package codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * Maps with bulk data and loops. See the Java Map WordCount for help
 */
public final class Map2 {

    /**
     * Given an array of strings, return a Map<String, Integer> containing a key for
     * every different string in the array, always with the value 0. For example the
     * string "hello" makes the pair "hello":0. We'll do more complicated counting
     * later, but for this problem the value is simply 0.
     * 
     * word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0} word0(["a", "b", "a", "c",
     * "b"]) → {"a": 0, "b": 0, "c": 0} word0(["c", "b", "a"]) → {"a": 0, "b": 0,
     * "c": 0}
     */
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], 0);
        }

        return map;
    }

    /**
     * Given an array of strings, return a Map<String, Integer> containing a key for
     * every different string in the array, and the value is that string's length.
     * 
     * wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1} wordLen(["this", "and",
     * "that", "and"]) → {"that": 4, "and": 3, "this": 4} wordLen(["code", "code",
     * "code", "bug"]) → {"code": 4, "bug": 3}
     */
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], strings[i].length());
        }

        return map;
    }

    /**
     * Given an array of non-empty strings, create and return a Map<String, String>
     * as follows: for each string add its first character as a key with its last
     * character as the value.
     * 
     * pairs(["code", "bug"]) → {"b": "g", "c": "e"} pairs(["man", "moon", "main"])
     * → {"m": "n"} pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n",
     * "n": "t"}
     */
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < strings.length; i++) {
            map.put("" + strings[i].charAt(0), "" + strings[i].charAt(strings[i].length() - 1));
        }

        return map;
    }

    /**
     * The classic word-count algorithm: given an array of strings, return a
     * Map<String, Integer> with a key for each different string, with the value the
     * number of times that string appears in the array.
     * 
     * wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
     * wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1} wordCount(["c", "c",
     * "c", "c"]) → {"c": 4}
     */
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {
            if (map.get(strings[i]) != null) {
                map.put(strings[i], map.get(strings[i]) + 1);
            } else {
                map.put(strings[i], 1);
            }
        }

        return map;
    }

}