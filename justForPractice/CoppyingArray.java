package justForPractice;

import java.util.Arrays;

public class CoppyingArray {

	public static void main(String[] args) {
		int[] org=new int[]{1,2,3};
   /*	int[] org=new int[3];
		org[0]=1;
		org[1]=2;
		org[2]=3; */
		
		
//		for(int i=0;i<org.length;i++) {
//			System.out.print(org[i]);
//		}
		
		int[] copy=Arrays.copyOf(org, 5);
		//adding more
		copy[3]=4;
		copy[4]=5;
		
		for(int j=0;j<copy.length;j++) {
			System.out.print(copy[j]);
		}

	}

}
