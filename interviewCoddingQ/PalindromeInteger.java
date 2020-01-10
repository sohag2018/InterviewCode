package interviewCoddingQ;

import java.util.Scanner;

public class PalindromeInteger {
public static void main(String[] args) {
		System.out.println("Enter integer");
		Scanner input = new Scanner(System.in);
		int givenNumber=input.nextInt();
		input.close();
		verifyPalindromeInteger(givenNumber);
	}

public static void verifyPalindromeInteger(int givenNumber) {
	int num=givenNumber; 
	int reversedInt=0;
	int reminder;
	//storing value for reversedInt
	//we use while loop by giving instruction for decremntal by division by 10
	while (num !=0){   //condition line for while loop
		reminder=num%10; //getting reminder
		reversedInt=reversedInt*10+reminder;
		num=num/10; //Instruction line for while loop
	}
	
	//compare reversedInt with given number by == operator and if else to declare palindrome
	
	if(givenNumber==reversedInt) {
		System.out.println("It is a palindrome integer");
	}else {
		System.out.println("It is not a palindrome integer");
	}
	
}


}
