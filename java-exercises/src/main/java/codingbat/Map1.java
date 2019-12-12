package codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * Basic Map get()/put(), no loops. These can be solved with just get(), put(),
 * and containsKey(). No loops required. See the Java Map Introduction for help.
 */
public final class Map1 {

    /**
     * Modify and return the given map as follows: if the key "a" has a value, set
     * the key "b" to have that value, and set the key "a" to have the value "".
     * Basically "b" is a bully, taking the value and replacing it with the empty
     * string.
     * 
     * mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
     * mapBully({"a": "candy"}) → {"a": "", "b": "candy"} mapBully({"a": "candy",
     * "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
     */
    public Map<String, String> mapBully(Map<String, String> map) {
        Map<String, String> bulliedMap = new HashMap<String, String>(map);
        if (bulliedMap.get("a") != null) {
            bulliedMap.put("b", bulliedMap.get("a"));
            bulliedMap.put("a", "");
        }
        return bulliedMap;
    }

    /**
     * Modify and return the given map as follows: if the key "a" has a value, set
     * the key "b" to have that same value. In all cases remove the key "c", leaving
     * the rest of the map unchanged.
     * 
     * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
     * mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"} mapShare({"a": "aaa", "c":
     * "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
     */
    public Map<String, String> mapShare(Map<String, String> map) {
        Map<String, String> shareMap = new HashMap<String, String>(map);
        if (shareMap.get("a") != null) {
            shareMap.put("b", shareMap.get("a"));
        }
        shareMap.remove("c");
        return shareMap;
    }

    /**
     * Modify and return the given map as follows: for this problem the map may or
     * may not contain the "a" and "b" keys. If both keys are present, append their
     * 2 string values together and store the result under the key "ab".
     * 
     * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
     * mapAB({"a": "Hi"}) → {"a": "Hi"} mapAB({"b": "There"}) → {"b": "There"}
     */
    public Map<String, String> mapAB(Map<String, String> map) {
        Map<String, String> abMap = new HashMap<String, String>(map);
        if (abMap.get("a") != null && abMap.get("b") != null) {
            abMap.put("ab", abMap.get("a") + abMap.get("b"));
        }
        return abMap;
    }

    /**
     * Given a map of food keys and topping values, modify and return the map as
     * follows: if the key "ice cream" is present, set its value to "cherry". In all
     * cases, set the key "bread" to have the value "butter".
     * 
     * topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream":
     * "cherry"} topping1({}) → {"bread": "butter"} topping1({"pancake": "syrup"}) →
     * {"bread": "butter", "pancake": "syrup"}
     */
    public Map<String, String> topping1(Map<String, String> map) {
        Map<String, String> topping1Map = new HashMap<String, String>(map);
        topping1Map.put("bread", "butter");
        if (topping1Map.get("ice cream") != null) {
            topping1Map.put("ice cream", "cherry");
        }
        return topping1Map;
    }

    /**
     * Given a map of food keys and their topping values, modify and return the map
     * as follows: if the key "ice cream" has a value, set that as the value for the
     * key "yogurt" also. If the key "spinach" has a value, change that value to
     * "nuts".
     * 
     * topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream":
     * "cherry"} topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt":
     * "cherry", "spinach": "nuts", "ice cream": "cherry"} topping2({"yogurt":
     * "salt"}) → {"yogurt": "salt"}
     */
    public Map<String, String> topping2(Map<String, String> map) {
        Map<String, String> topping2Map = new HashMap<String, String>(map);
        if (topping2Map.get("ice cream") != null) {
            topping2Map.put("yogurt", topping2Map.get("ice cream"));
        }
        if (topping2Map.get("spinach") != null) {
            topping2Map.put("spinach", "nuts");
        }
        return topping2Map;
    }

    /**
     * Given a map of food keys and topping values, modify and return the map as
     * follows: if the key "potato" has a value, set that as the value for the key
     * "fries". If the key "salad" has a value, set that as the value for the key
     * "spinach".
     * 
     * topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
     * topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
     * topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad":
     * "oil", "potato": "ketchup", "fries": "ketchup"}
     * 
     */
    public Map<String, String> topping3(Map<String, String> map) {
        Map<String, String> topping3Map = new HashMap<String, String>(map);
        if (topping3Map.get("potato") != null) {
            topping3Map.put("fries", topping3Map.get("potato"));
        }
        if (topping3Map.get("salad") != null) {
            topping3Map.put("spinach", topping3Map.get("salad"));
        }
        return map;
    }

    /**
     * Modify and return the given map as follows: if the keys "a" and "b" are both
     * in the map and have equal values, remove them both.
     * 
     * mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"} mapAB2({"a":
     * "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"} mapAB2({"a": "aaa", "b":
     * "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
     */
    public Map<String, String> mapAB2(Map<String, String> map) {
        Map<String, String> ab2Map = new HashMap<String, String>(map);
        if (ab2Map.containsKey("a") && ab2Map.containsKey("b"))
            if (ab2Map.get("a").equals(ab2Map.get("b"))) {
                ab2Map.remove("a");
                ab2Map.remove("b");
            }
        return ab2Map;
    }

    /**
     * Modify and return the given map as follows: if exactly one of the keys "a" or
     * "b" has a value in the map (but not both), set the other to have that same
     * value in the map.
     * 
     * mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
     * mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
     * mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c":
     * "cake"}
     * 
     */
    public Map<String, String> mapAB3(Map<String, String> map) {
        Map<String, String> ab3Map = new HashMap<String, String>(map);
        if (ab3Map.containsKey("a") && !ab3Map.containsKey("b")) {
            ab3Map.put("b", ab3Map.get("a"));
        } else if (!ab3Map.containsKey("a") && ab3Map.containsKey("b")) {
            ab3Map.put("a", ab3Map.get("b"));
        }
        return ab3Map;
    }

    /**
     * Modify and return the given map as follows: if the keys "a" and "b" have
     * values that have different lengths, then set "c" to have the longer value. If
     * the values exist and have the same length, change them both to the empty
     * string in the map.
     * 
     * mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c":
     * "aaa"} mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb",
     * "c": "bbb"} mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c":
     * "bbb"}
     * 
     */
    public Map<String, String> mapAB4(Map<String, String> map) {
        Map<String, String> ab4Map = new HashMap<String, String>(map);
        if (ab4Map.containsKey("a") && ab4Map.containsKey("b")) {
            String a = ab4Map.get("a");
            String b = ab4Map.get("b");

            if (a.length() > b.length()) {
                ab4Map.put("c", a);
            } else if (b.length() > a.length()) {
                ab4Map.put("c", b);
            } else {
                ab4Map.put("a", "");
                ab4Map.put("b", "");
            }
        }
        return ab4Map;
    }

}