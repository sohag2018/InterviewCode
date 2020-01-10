package interviewCoddingQ;
//Q: write a Java program that accepts an array of integers, and print out the distinct pairs of these integers that sum to 7.
//for examples if the input is [1,2,3,4,,5,6] the out put could be (1,6),(2,5),(3,4)..
public class PairsWithGivenSum {

public static void printPair(int array[],int sum){

for (int i = 0; i<array.length; i++)
for (int j =i +1 ; j<array.length; j++)
if (array[i] + array[j] == sum)

System.out.print("("+ array[i] + "," + array[j]+ ")");
}

public static void main(String[] args) {
int array[]= {1,2,3,4,5,6};	
int sum=7;
printPair(array,sum);

}

}