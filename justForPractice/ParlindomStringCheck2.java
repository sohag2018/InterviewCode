package justForPractice;

public class ParlindomStringCheck2 {

	public static void main(String[] args) {
		String a="ma",b="";
		int n=a.length();
		
		for(int i=n-1; i>=0;i--) 
			b=b+a.charAt(i);
			
			
		if(a.equals(b)) 
			System.out.println("Yes");
		else 
			System.out.println("No");
		

	}

}
