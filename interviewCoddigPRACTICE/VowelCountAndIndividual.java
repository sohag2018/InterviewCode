package interviewCoddigPRACTICE;

public class VowelCountAndIndividual {

	public static void main(String[] args) {
		String s = "aeroplane-ui";
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
	
		
		for(int v=0;v<s.length();v++) {
			if(s.charAt(v)=='a') {a++;}
			if(s.charAt(v)=='e') {e++;}
			if(s.charAt(v)=='i') {i++;}
			if(s.charAt(v)=='o') {o++;}
			if(s.charAt(v)=='u') {u++;}
					
		}
       System.out.println("a: "+a+", e: "+e+", i: "+i+", o: "+o+" & u: "+u);
	}

}
