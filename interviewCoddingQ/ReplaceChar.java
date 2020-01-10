package interviewCoddingQ;

public class ReplaceChar {

	public static void main(String[] args) {
	String s ="Sahag";
	System.out.println(s.replace('a', 'o'));
	
	//to replace whole word we could use replaceAll()
	String s1=s.replaceAll("Sahag", "Sharif");
	System.out.println(s1);

	}

}
