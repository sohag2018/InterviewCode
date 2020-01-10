package justForPractice;

public class ReverseStringSentence {

	public static void main(String[] args) {
		String s="This is Sohag";
		String[] words=s.split(" ");
		
		String reverseS="";
		for(String w:words) {
			//reverseS=reverseS+words[i]+" ";
			//System.out.println(words[i]);
			String reverseWord="";
			for(int j=w.length()-1;j>=0;j--) {
				reverseWord=reverseWord+w.charAt(j);
				System.out.println(reverseWord);	
			}
			reverseS=reverseS+reverseWord+" ";
			
			System.out.println();
		}
		
	}

}
