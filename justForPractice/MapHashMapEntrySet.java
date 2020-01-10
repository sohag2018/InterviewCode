package justForPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapHashMapEntrySet {

	public static void main(String[] args) {
		Map<String, Integer> map =new HashMap<>();
		map.put("aaa", 1);
		map.put("bbb", 2);
		map.put("ccc", 3);
		map.put("ddd", 4);
		
		System.out.println(map.get("aaa")); // to print one value of the one key
		
		Set<String> keys=map.keySet();
		for(String k:keys) {
			System.out.println(k+":"+map.get(k));
		}

		
		
		
		
		
	}

}
