package interviewCoddingQ;

import java.util.HashMap;
//import java.util.Iterator;

public class DuplicateCharacter {

	
	static void findDuplicateCharacter(String str){  // this method takes string as argument; this method returns nothing;static to access from main
		
	HashMap<Character,Integer> hm = new HashMap<>();
		
	for(int i=0;i<str.length();i++) {
		char c =str.charAt(i);
		if(hm.get(c) !=null) {
			hm.put(c, hm.get(c)+1);
		}else 
		hm.put(c, 1);
	}
	System.out.println(hm);
	}
	   
	
	public static void main(String[] args) {
		findDuplicateCharacter("Jaavva");
         
	}

}
