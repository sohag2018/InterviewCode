package justForPractice;

public class VowelCount {

	public static void main(String[] args) {
		String s="Sohag";
		int v=0;
		char[] c=s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
				v++;
			}
		}
System.out.println("number of a is: "+v);
	}

}
