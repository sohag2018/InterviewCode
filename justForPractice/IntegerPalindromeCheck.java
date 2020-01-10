package justForPractice;



public class IntegerPalindromeCheck {

	public static void main(String[] args)  {
		int given=4554;
		String original=String.valueOf(given),reversed="";
		
		for(int i=original.length()-1;i>=0;i--) reversed=reversed+original.charAt(i);
		if(reversed.equals(original)) System.out.println("It is palindrome Integer");
		else System.out.println("It is not palindrome Integer");
		
	}

}
