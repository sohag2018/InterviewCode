package interviewCoddingQ;
//Q: we have int array[]={1,2,3,4,5,6}. printout the distinct pairs of these integers that sum is 7
public class PairsWithGivenSum2 {

	public static void main(String[] args) {
		int []array={1,2,3,4,5,6};  //given int array[]
		for(int i = 0;i<array.length;i++)//to iterate over every single index
		for(int j = i+1;j<array.length;j++)// to iterate over next index after[i], example if i goes for [0] index then j goes for [1] and so on.. 
		if(array[i]+array[j]==7)//now check both sum is equal to 7 or not
		System.out.print("("+array[i]+","+array[j]+")");//print those pairs if condition is true.
			

	}

}
