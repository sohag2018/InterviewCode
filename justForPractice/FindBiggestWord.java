package justForPractice;

public class FindBiggestWord {

	public static void main(String[] args) {
		String s="My name is Sohag";
		String w=" ";
		int l=0;
		String arr[]=s.split(" ");
		for(int i=0; i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[i].length()>arr[j].length()) {
					l=arr[i].length();
					w=arr[i];
				}
			}
		}
          System.out.println(w+":"+l);
	}

}
