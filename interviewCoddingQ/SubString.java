package interviewCoddingQ;

public class SubString {

	public static void main(String[] args) {
		String str="codding";
		System.out.println(str.subSequence(2, 6));
		
		//let's print the word love (starting index 2 and ending index 6 as index starts with 0)
		
		 String substr=str.substring(2, 4);
		
		
		System.out.println("our substring value is :" +substr);

	}

}
