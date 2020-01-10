package interviewCoddingQ;

import java.util.Arrays;

public class CopyingArray {

	public static void main(String[] args) {
		int [] org = new int[] {1,2,3};
		//int [] org = new int[] {1,2,3};------->we can write this way too.
		
		//if we print the array:
		
		for(int i =0; i<org.length;i++) {
			System.out.print(org[i]);  //output: 123
		}
		//let's create a gape btwn two print
		System.out.println("-----------------");
		//copying org[] into new array copied[]:
		
		int[] copied = Arrays.copyOf(org,6); //.copyOf() method will ask for the original array and length of the new array
		//if we print new array we will get only prev. index but we declared length is 6, so let's add three more
		
		copied[3]=4;
		copied[4]=5;
		copied[5]=6;
		
		//now let's print our new array
		
		for(int j=0;j<copied.length;j++) {
			
			System.out.print(copied[j]); //output: 12345
		}
		

	}

}
