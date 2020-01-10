package justForPractice;

public class LongestWordInGivenString {

	public static void main(String[] args) {
		String s="The Cow Jumped Over The Moon";
		String w=" ";
		int l=0;
		
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length-1;i++) 
			if(arr[i].length()>l) {
				l=arr[i].length();
				w=arr[i];
		}
		
		System.out.println("The longest word is:"+w+" & length is:"+l);
		}
	}


