package interviewCoddigPRACTICE;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySet {

	public static void main(String[] args) {
		Map< String, Integer> map = new HashMap<>();
	
		//put some values mapping with keys:
		map.put("aaa", 1); map.put("bbb", 2); map.put("ccc", 3);map.put("ddd", 4);
		
		//1. to print one value of the the key
		/*System.out.println(map.get("ddd")); */
		
		//2. to print all keys' value need keySet available in Set interface
		/*Set<String> keys =map.keySet();
		for(String s:keys) {
		System.out.println(map.get(s));}*/
		
		//3. To print all keys and their values:
		
		 Set<Map.Entry<String, Integer>> values=map.entrySet();//Entry is the nested interface in Map interface
         for(Map.Entry<String, Integer> e: values) {
        	 System.out.println("|"+e.getKey()+"|"+e.getValue()+"|");
        	 System.out.println("-------");
         }
	}

}
