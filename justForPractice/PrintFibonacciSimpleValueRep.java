package justForPractice;

public class PrintFibonacciSimpleValueRep {

	public static void main(String[] args) {
		// Lets have some int variable
		int n1=0,n2=1,n3,i,count=10;  //we will get n3 value to print other fibo by adding n1+n2  n1 and n2 vlaue will be changing, i for looping 
		
		System.out.print(n1+" "+n2); //as we know first two number will be 0 1 so lets print first
		for(i=2;i<count;++i) { //as we have already two so we dont need for([0]&[1] , so start form [2]
		n3=n1+n2;//n3 value should be always current value of n1 and n2
		
		System.out.print(" "+n3); //print n3 value for rest of the index by looping so first value should be 0+1=1; 
			n1=n2;  //changing the value of n1, now n1=the value n2 (changing value)
			n2=n3;//changing the value of n2, now n2=the value n3 (changing value)
		}
		
	}

}
 /*Explanation: 1. first two fibonacci series number is 0 and 1 , so we print it first
  *             2. then we go for other number by printing n3 after having value of n3 adding n1 and n2
  *             3. for the 3rd number we get (n1=0, n2=1, so n3=0+1=1 then for next loop value of n1 and n2 changed 
  *             4. for 4th number we get n1=1, n2=1 (old n3) so new n3 should be 2
  *             5. for 5th number we get n1=1, n2=2, so new n3=3 
  *             9. so on.....
 */
                     