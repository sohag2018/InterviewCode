package interviewCoddigPRACTICE;

import java.util.HashMap;

public class PrintMultipleString {
	
	
	public static void printMultipleString(String str) {
		String[]s=str.split(" ");
		
		HashMap<String, Integer> hm=new HashMap<>();
		for(String st:s) {
			
			if(hm.get(st)!=null) {
				hm.put(st, hm.get(st)+1);	
			}else
			hm.put(st, 1);
	
		}
		
		System.out.println(hm);
		
	}

	public static void main(String[] args) {
		
		printMultipleString("My name is is Sharif");
	}

}
