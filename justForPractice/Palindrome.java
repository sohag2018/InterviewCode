package justForPractice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter your string");
		Scanner sc=new Scanner(System.in);
                String input=sc.nextLine();
                sc.close();
                
                //First way
                String s=new StringBuilder(input).reverse().toString();
                if(input.equals(s)) {
                	System.out.println("Yes, It is Palindrom");
                }else {
                	System.out.println("No. It is not Palindrom");
                }
                
                //2nd Way
                
                String reverse="";
                
                for(int i=input.length()-1;i>=0;i--) {
                	reverse=reverse+input.charAt(i);
                }
                
                if(input.equals(reverse)) {
                	System.out.println("Yes, It is Palindrom");
                }else {
                	System.out.println("No. It is not Palindrom");
                }
                
	}
	
	
	

}
