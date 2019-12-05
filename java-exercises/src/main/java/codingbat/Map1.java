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
    public Map<String, String> mapBully(Map<String, String> map) 
    {
        Map<String, String> bulliedMap = new HashMap<String, String>(map);
        if(bulliedMap.get("a") != null )
        {
            bulliedMap.put("b" , bulliedMap.get("a"));
            bulliedMap.put("a", "");
        }
        return bulliedMap;
    }

}