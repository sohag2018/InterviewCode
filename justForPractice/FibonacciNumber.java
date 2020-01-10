package justForPractice;

import java.util.Arrays;

public class FibonacciNumber {

	public static void main(String[] args) {
		int []fibo=new int [20];
		
		for(int i=0;i<20;i++) 
		if(i<2) fibo[i]=i;
		else fibo[i]=fibo[i-1]+fibo[i-2];
		System.out.println(Arrays.toString(fibo));
	}

}
