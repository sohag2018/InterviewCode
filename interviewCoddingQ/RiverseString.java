package interviewCoddingQ;

public class RiverseString {
	public static void main(String[] args) {
		
		String s = "Dad";
		
		//1) using reverse() in StringBuffer/StringBuilder class
		StringBuffer sb = new StringBuffer(s);
		String s1=sb.reverse().toString();
		System.out.println(s1);//daD
		
		//2) by for looping
		
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			System.out.print(c);
		}
		
		
		
		
	}

}
