package justForPractice;

import java.util.HashMap;
import java.util.Scanner;

public class CharAndCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String s=sc.nextLine();
		sc.close();
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(int i =0; i<s.length();i++) {
			char c=s.charAt(i);
			if(hm.get(c)!=null) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
				
			}
		}
		
System.out.println(hm);
	}

}
