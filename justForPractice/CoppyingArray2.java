package justForPractice;

import java.util.Arrays;

public class CoppyingArray2 {

	public static void main(String[] args) {
		int[]a= {5,10,15};
		
		
		int [] b=Arrays.copyOf(a, 6);
		b[3]=20;
		b[4]=25;
		b[5]=30;
		
		for(int i=0;i<b.length;i++) {
		
		System.out.println(i+"="+b[i]);}

	}

}
