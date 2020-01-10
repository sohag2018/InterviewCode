package justForPractice;

public class FactorialNumber {

	public static void main(String[] args) {
		findFactorial(7);
		 }
	
	public static void findFactorial(int n) {
		int fn=1;
		int i=1;
		while(i<=n) {
			fn=fn*i;
			i++;
			
		}
		System.out.println(fn);
	}

	}


