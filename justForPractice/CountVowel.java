package justForPractice;

public class CountVowel {

	public static void main(String[] args) {
		String s = "patrick";
		int mount=0;
		
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u') {
			mount++;
			
		}
		
		}
		System.out.println(mount);

	}

}
