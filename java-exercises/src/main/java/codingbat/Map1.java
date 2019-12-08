package codingbat;

import java.util.HashMap;
import java.util.Map;

/**
 * Basic Map get()/put(), no loops. These can be solved with just get(), put(),
 * and containsKey(). No loops required. See the Java Map Introduction for help.
 */
public final class Map1 {
    
    /**
     * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, 
     * and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
     * 
     * mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
     * mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
     * mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
     */
    public Map<String, String> mapBully(Map<String, String> map) {
        Map<String, String> bulliedMap = new HashMap<String, String>(map);
        if(bulliedMap.get("a") != null )
        {
            bulliedMap.put("b" , bulliedMap.get("a"));
            bulliedMap.put("a", "");
        }
        return bulliedMap;
    }

    /**
     * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. 
     * In all cases remove the key "c", leaving the rest of the map unchanged.
     * 
     * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
     * mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
     * mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
    */
    public Map<String, String> mapShare(Map<String, String> map) {
        Map<String, String> shareMap = new HashMap<String, String>(map);
        if(shareMap.get("a") != null)
        {
            shareMap.put("b",shareMap.get("a"));
        }
        shareMap.remove("c");
        return shareMap;
    }
      
    /**
     * Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. 
     * If both keys are present, append their 2 string values together and store the result under the key "ab".
     * 
     * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
     * mapAB({"a": "Hi"}) → {"a": "Hi"}
     * mapAB({"b": "There"}) → {"b": "There"}
     */
    public Map<String, String> mapAB(Map<String, String> map) {
        Map<String, String> abMap = new HashMap<String, String>(map);
        if(abMap.get("a") != null && abMap.get("b") != null)
        {
            abMap.put("ab", abMap.get("a") + abMap.get("b"));
        }
        return abMap;
    }
    
    /**
     * Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, 
     * set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
     * 
     * topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
     * topping1({}) → {"bread": "butter"}
     * topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
     */
    public Map<String, String> topping1(Map<String, String> map) {
        Map<String, String> topping1Map = new HashMap<String, String>(map);
        topping1Map.put("bread","butter");
        if(topping1Map.get("ice cream") != null)
        {
            topping1Map.put("ice cream","cherry");
        }
        return topping1Map;
    }
      
}   