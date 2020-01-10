package interviewCoddingQ;

public class PalindromeStringStringBuffer {
	
	public static void checkPalindrome(String s) {
		
		
		//reversing given string and keeping in new String
		String reversed=new StringBuffer(s).reverse().toString();
		
		//To check whether it is palindrome or not
		
		if(s.equals(reversed)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}

	public static void main(String[] args) {
		
		checkPalindrome("madam");
		checkPalindrome("Adam");
		
	}

}
