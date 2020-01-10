package justForPractice;

public class FactorialNumberApproach {

	public static void main(String[] args) {
		factorialApproach1(5);
		
	}
	public static void factorialApproach1(int num) {
		
		int i=1;
		int f=1;
		//1.we are using while loop
		/*while(num>=i) {
			f=f*i;
			i++;
		}*/
		
		//2.we are using for loop
	
		for(i=1;i<=num;i++) {
			f=f*i;	
		}
		System.out.println(f);
	}

}
