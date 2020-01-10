package justForPractice;

public class Pyramid {

	public static void main(String[] args) {
		// outer for loop
		
		for(int i=0;i<10;i++) {
			//1st inner loop to have white space before *
			for(int j=0;j<10-i;j++) {//10-i  to decrease in every line that help * to for shaping
				System.out.print(" ");//only print not println to print in same line
			}
			//2nd inner loop to print *
			for(int k=0;k<=i;k++) {//put k<=i so that it print1* then** then *** increasing for shape
				System.out.print("* ");//put space after * for full pyramid shap otherwise it would print half 
			} // we could 3rd loop to print 2nd half pyramid but as we put white space after/before * so we dont need
			
			//3rd innerloop optinal if we dont put space in 2nd loop with *
			
//			for(int m=1;m<i;m++) {// (m=1)we need to make the condition for first inner looping because we dont need * for first line
//				System.out.print("*");
//			}
//			
			
			System.out.println();// to create new lines
		}

	}

}
