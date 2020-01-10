package justForPractice;

public class PyramidStylist {

	public static void main(String[] args) {
		// outer for loop
		
		for(int i=0;i<10;i++) {
			
			
			
			for(int j=0;j<10-i;j++) {//10-i  to decrease in every line that help * to for shaping
				System.out.print(" ");//only print not println to print in same line
			}
			
			for(int n=0;n<i;n++) {// (m=1)we need to make the condition for first inner looping because we dont need * for first line
				System.out.print("*");
			}
			
			for(int k=0;k<=i;k++) {
				System.out.print("* "); 
			} 
			
			
			
			for(int m=0;m<i;m++) {// (m=1)we need to make the condition for first inner looping because we dont need * for first line
				System.out.print("*");
			}
			
			
			System.out.println();// to create new lines
		}

	}

}
