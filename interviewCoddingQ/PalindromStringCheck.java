package interviewCoddingQ;

import java.util.Scanner;

public class PalindromStringCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter String");
		String inputString=sc.next();
		sc.close();
		String reversedString=new StringBuffer(inputString).reverse().toString();
		
		if(inputString.equals(reversedString)) {
			System.out.println("It is a Palindrom");
		}else {
			System.out.println("It is not Palindrom");
		}

	}

}
