package justForPractice;
//Q: If you are given a string and you are asked to count a specific char in that string. how do you do this?
//A: first i will put that string in a char type array by using toCharArray() method so that i can use for loop.then if will use an if condidtion
//so that i can count specific char and over ride the value of already initialized int variable and finaly i will go for print.

public class CountChar {

	public static void main(String[] args) {
		String s = "aabbaa";
		int count=0;
		
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]=='a');
			count++;
		}
System.out.println("the char a is in the string comes "+count+" times");
	}

}
