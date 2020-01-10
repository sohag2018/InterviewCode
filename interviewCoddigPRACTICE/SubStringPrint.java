package interviewCoddigPRACTICE;
//Q: Let's say you have a string and you are required to print middle two character. How you will do it. Example from "Sohag" print "ha"

public class SubStringPrint {

	public static void main(String[] args) {
		String s = "Sohag";
		//print specific char by using charAt()
		//System.out.println(s.charAt(1));
		
		
//		//we can print by using substring()
		String s1=s.substring(2,4);
		System.out.println(s1); //ha
		
		
	//	char[] s1= s.toCharArray(); //converting String to charArray
		
		//we can print one or two char
		//System.out.print(s1[0]+"\n"+s1[1]);
		
		//we can use loop
//		for(int i=0; i<s1.length;i++) {
//			System.out.print(s1[i]+"\n");
//		}
	}

}
