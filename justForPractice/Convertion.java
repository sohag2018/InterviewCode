package justForPractice;

public class Convertion {
	
public static void main(String[] args) {
		 String s1="100 ";
		 int s2=12;
System.out.println(s1+s2);//10012====>String+int
//Conversion s1 value to int
int s3=Integer.parseInt(s1);
System.out.println(s1+s3);//112====>int+int

//Conversion s2 value to String
String s4=String.valueOf(s2);
System.out.println(s1+s4);//10012====>String+String
	}
	
	

}
