package interviewCoddigPRACTICE;


//Q: count how many times 'a' is in the string in "aabba'

// by converting string to char[]

public class CharCounting  {

	public static void main(String[] args) {
		String s="Aabba";
		int count=0;
		char[] s1=s.toCharArray();
		
		for(int i=0;i<s1.length;i++) {
			if(s1[i]=='a') {
				count++;
			}
		}
System.out.println("number of 'a' is :"+count);
	}

}
