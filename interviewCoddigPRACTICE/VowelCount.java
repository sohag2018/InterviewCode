package interviewCoddigPRACTICE;

import java.util.Scanner;

public class VowelCount {
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your String"+"\n");
		String s =input.nextLine();
		input.close();
		
		System.out.println("Total number of vowel in the given String is :"+vowelCount(s)+"\n");
	}
	
	public static int vowelCount(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u') {
				count++;
				}
		}
		return count;
	}

}
