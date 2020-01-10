package interviewCoddingQ;

import java.util.HashMap;

public class HashMapOnlyKeyOrValue {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("BD", "Dhaka");
		hm.put("USA", "NY");
		hm.put("Canada", "Toronto");
		
		//System.out.println(hm);
		//System.out.println(hm.size());
	// System.out.println(hm.values());
	 System.out.println(hm.keySet());
		// System.out.println(hm);
		
		//***to print key and value  
		 for(String p:hm.keySet()) {
			 System.out.println("Key: "+p+" hashCode: "+p.hashCode()+ " Value: "+hm.get(p));
			 System.out.println("Index: "+p.hashCode()%16);
		 }
		
		//***to print only key
//		 for(String p:hm.keySet()) {
//			 System.out.println(p);
//		 }
//		
//		//***to print only value
//		 for(String p:hm.values()) {
//			 System.out.println(p);
//		 }
		 
		 
	}

}
