package interviewCoddigPRACTICE;

import java.util.HashMap;

public class VowelPrintAndCount {

	public static void main(String[] args) {
		String s="aeroplane-vi";
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(hm.get(c) !=null) {
			hm.put(c, hm.get(c)+1);
		}else{
			hm.put(c, 1);
		
			
		}
		
		}
         System.out.println(hm);
	}

}
