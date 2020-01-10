package interviewCoddigPRACTICE;

public class FactorialNumberPrint {

	public static void main(String[] args) {
		System.out.println(factorial(7));

	}
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}else { return n*factorial(n-1); // method recursion gives the number each time n-1 mean if it is 7 then 6.....so on. it would be 7*6*5*4*3*2*1
	}
	
	}
}
 

//Note:  if(){}else{}  can work without typical style

/*public static int factorial(int n) {
	if(n==0) 
		return 1;
	return n*factorial(n-1); 
}

*/
    