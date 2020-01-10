package interviewCoddigPRACTICE;

//   Q: from a String "soohhag" print the duplicate char


public class duplicateStringPrint {

	public static void main(String[] args) {
		String str = "soooohhag";
		 // int cnt = 0;  //if we want to count number of times it happened
		  char[] inp = str.toCharArray();
		 
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < inp.length; i++) {
		   for (int j = i + 1; j < inp.length; j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		    // cnt++; //if we want to count number of times it happened
		    // break;
		     
		    }
		   }
		  }

	}

}
