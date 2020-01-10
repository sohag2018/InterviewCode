package interviewCoddingQ;

public class VowelCount2 {

	public static void main(String[] args) {
		String sentence = "My name is Sohag";
		int count=0;
		for(int i =0; i<sentence.length();i++) {
			char c=sentence.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
//			we can do it directly without creating new char variable:
			//if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u') {
//				count++;
//			}
		}
            System.out.println("Total number of vowel is: "+count);
	}

}
