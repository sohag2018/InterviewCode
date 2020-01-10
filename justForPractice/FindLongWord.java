package justForPractice;

public class FindLongWord {

	public static void main(String[] args) {
		String s="My name is Sohag";
		String w=" ";
		int L=0;
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()>L) {
				w=arr[i];
				L=arr[i].length();		}
		}
		System.out.println("Long word is:"+w+" & it's Length is:"+L);

	}

}
