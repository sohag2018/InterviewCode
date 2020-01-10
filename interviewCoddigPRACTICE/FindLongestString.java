package interviewCoddigPRACTICE;

public class FindLongestString {

	public static void main(String[] args) {
		String s = "The cow jumped over the moon";
		String word ="";
		int length =0;
		
		String arr[]=s.split(" ");
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i].length()>length) {
				length=arr[i].length();
				word=arr[i];
				
			}
			
		}
		System.out.println("The longest word is: "+word+" and length is: "+length);

	}

}
