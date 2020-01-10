package justForPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapDebug {

	public static void main(String[] args) {
		Map<String,Integer> map =new HashMap<>();
		
		map.put("aaa", 1);
		System.out.println(map.hashCode());
		map.put("bbb", 2);
		map.put("ccc", 3);
		map.put("ddd", 4);

	}

}
