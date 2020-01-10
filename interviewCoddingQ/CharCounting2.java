package interviewCoddingQ;

public class CharCounting2 {

	public static void main(String[] args) {
		String str = "aabba";
		String s1=str.replace('a', 'e');
		
		System.out.println(s1);
		int count=0;
		
		
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a') {
		count++;
			}
		}
          System.out.println("total number of a is : "+count);
		}

}
