package interviewCoddingQ;

import java.util.Arrays;

public class DuplicateSample {
	
	public static void main (String []args) {
	
	String str = "Jaava";
	
	//converting String to character Array:
	char[] myArray=str.toCharArray();
	
	for(int i =0;i<myArray.length;i++) {
		for(int j=i+1;j<myArray.length;j++) { //iterate from next index so, i+1
			if(myArray[i]==myArray[j]) {
				//myArray=ArrayUtils.remove(myArray,j); //need to install ArrayUtils
			}
		}
		
	}
	System.out.println("String value after deleting duplicate values"+Arrays.toString(myArray));
	}
}
