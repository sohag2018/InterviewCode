package interviewCoddingQ;

public class StringWordsCount {

	public static void main(String[] args) {
		String s = "My name is Sohag";
		
//		String s1[]=s.split(" ");
//		System.out.println(s1.length); //4
		
		
		//2nd approach
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' '&& s.charAt(i+1)!=' ') {
				count++;
			}
			
		}
           System.out.println(count);
	}

}
