package interviewCoddigPRACTICE;

public class FactorialRecursiveAndIteration {

	public static void main(String[] args) {
		//print factorial numbers of 7 by using recursive method
		System.out.println("Factorial numbers of 7: "+factorialRecursive(7));
		//print factorial numbers of 7 by using Iteration
		System.out.println("Factorial numbers of 7: "+factorialIteration(7));}
	
	//Recursive method print again again. Return type accepts passing n value form main method
	    public static int factorialRecursive(int n){
		if(n==0)
		return 1;
		return n*factorialRecursive(n-1);}
	
	//Iteration by using while loop
	public static int factorialIteration(int n){
		int result=1,i=1; //purpose of having result variable to get factorial numbers by 
	                      //overriding the value of result and i based on i value we will iterate
	while(i<=n){
		result=result*i;
		i++;}
	return result;
	}}
