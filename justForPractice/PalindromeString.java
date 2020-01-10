package justForPractice;

public class PalindromeString {
	//1st way:
	public static void palindromeCheck1(String a) {
		String b=new StringBuffer(a).reverse().toString();
		if(a.equals(b)) 
		System.out.println(a+" is a palindrome");
		else System.out.println(a+" is not a palindrome");
		}
	
	//2nd way:
	
	public static void palindromeCheck2() {
		String a1="Madam",b1="";
		for(int i=a1.length()-1;i>=0;i--) {
			b1=b1+a1.charAt(i);
		}
		if(a1.equals(b1))
			System.out.println(a1+" is a palindrome");
		else
			System.out.println(a1+" is not a palindrome");
	}

	public static void main(String[] args) {
		palindromeCheck1("madam");
		palindromeCheck2();

	}

}
