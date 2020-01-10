package interviewCoddingQ;

public class FactorialNumber {
	
	public static int factorialApproach2(int num) {
		
		if(num==0) {
			return 1;
		}else {
				return num*factorialApproach2(num-1);
			}
	}

	public static void main(String[] args) {
		
		System.out.println(factorialApproach2(8));

}
}
