package interviewCoddigPRACTICE;

//Q: count how many times 'a' is in the string in "aabba'

public class CountString {

	public static void main(String[] args) {
		String s="aabba";
		int count=0;	
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
					}	}
		System.out.println(count);
	}
}
