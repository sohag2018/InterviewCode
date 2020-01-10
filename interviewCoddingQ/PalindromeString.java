package interviewCoddingQ;

public class PalindromeString {

	public static void main(String[] args) {
		String original="dada", reverse="";
		int len=original.length();
		
		for(int i=len-1;i>=0;i--) 
		reverse=reverse+original.charAt(i); //to covert the char to string we are adding prev value of string
		if(original.equals(reverse)) 
			System.out.println("it is palindrome String");
		else
			System.out.println("not palindrome");
		}
		

	}


