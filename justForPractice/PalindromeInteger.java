package justForPractice;

public class PalindromeInteger {

	public static void main(String[] args) {
		int givenNum=121;
		int originalNum=givenNum;
		int reversedNum=0;
		int remainingNum;
		
		//using while loop to get the reversedNum
		while(originalNum>0){
			remainingNum=originalNum%10;
			reversedNum=(reversedNum*10)+remainingNum;
			originalNum=originalNum/10;
			
			/* Let's see what is happening in looping and changing the value:
			 * *************************************************************
			
			iteration	originalNum	Condition	remaining	reversed
1 				1st		121				ok		121%10=1  	{(0*10)+1}=1
2 				2nd		121/10=12		ok		12%10=2		{(1*10)+2}=12
3 				3rd		12/10=1			ok		1%10=1		{(12*10)+1}=121
4 				4th		1/10=0.1		Fail		
			*/
			
			// Comparing givenNum with lastupdated reversedNum to check palindrome:
			
			}
		if(givenNum==reversedNum) {
			System.out.println("givenNum is Palindrome");
			}else {
				System.out.println("givenNum is not Palindrome");
			
		}   
	}
}


