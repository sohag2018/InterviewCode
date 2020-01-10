package interviewCoddingQ;

public class Convertion {
	

	public static void main(String[] args) {
		String s = "100";
		System.out.println(s+20); //10020
		int i=Integer.parseInt(s);
		System.out.println(i+20); //120
		int j =Integer.valueOf(s);
		System.out.println(j+30); //130
		int k=Integer.valueOf(s).intValue();
		System.out.println(k+50);//150
		double d =Double.parseDouble(s);
		System.out.println(d); //100.0
		String ns=String.valueOf(i);
		System.out.println(ns+10); //10010
		
	}

}
