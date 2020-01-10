package interviewCoddigPRACTICE;

import java.util.HashMap;
import java.util.Scanner;

public class PrintCharAndCount {

	public static void main(String[] args) {
		//String s = "Sohag";----->if String is given
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		sc.close();//just to close the Scanner class
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(int i =0; i<s.length();i++) {
			char c=s.charAt(i);
			if(hm.get(c)!=null) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
			
		}
          System.out.println("char in given String and counting (respectively):"+hm);
	}

}
