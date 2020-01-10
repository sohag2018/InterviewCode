package interviewCoddigPRACTICE;

public class CountCharacterInString {

	public static void main(String[] args) {
		String s= "Jaava";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a') {
				count ++;
				
			}
		}
		System.out.println("a="+count);
	}

}
