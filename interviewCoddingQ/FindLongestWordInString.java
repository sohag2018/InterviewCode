package interviewCoddingQ;

public class FindLongestWordInString {

	public static void main(String[] args) {
		String s="The cow jumped over the moon";
		int length=0;
	String longestword=" ";
		String[] s1=s.split(" ");
	    for(int i=0;i<s1.length-1;i++) {
	    	for(int j=1+i;j<s1.length-1;j++) {
	    		if(s1[i].length()>=s1[j].length()) {
	    			longestword=s1[j];
	    			length=s1[j].length();
	    		}
	    	}
//	    	if(s1[i].length()>longword) {
//	    		longword=s1[i].length();
//	    		
//	    	}
	    }
System.out.println("lenght is: "+length+" & the word is: "+longestword);

	}

}
