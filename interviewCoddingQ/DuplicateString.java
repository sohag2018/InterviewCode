package interviewCoddingQ;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateString {

	
	static void findDuplicateWord(String str){  // this method takes string as argument; this method returns nothing;static to access from main
		
		HashMap<String,Integer> hm = new HashMap<>();
		
	String[] s=	str.split(" "); //split the words i am getting as argument and put in String array		
	for(String tempstring:s) {//to view we are using for loop
		//We want to create a table to put these words, for that first create a HashMap just after the method name
		if(hm.get(tempstring) !=null) {
			hm.put(tempstring, hm.get(tempstring)+1);
		}else {
		hm.put(tempstring, 1);
		}
		}
	
	Iterator<String> tempString = hm.keySet().iterator();
	while(tempString.hasNext()) {
		String temp=tempString.next();
		if(hm.get(temp)>1) {
			System.out.println("The word "+temp+"appeared "+hm.get(temp)+" number of times");
		}
	}
	
	}
	   
	
	public static void main(String[] args) {
		findDuplicateWord("I am am learning java java");
         
	}
	
	
	
	
	
	
	
	

}
