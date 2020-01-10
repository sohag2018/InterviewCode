package interviewCoddingQ;

public class InsertString {

	public static void main(String[] args) {
		String s= "ohag";
		StringBuffer sb=new StringBuffer(s);
		String s1=sb.insert(0, "S").toString();
		
		System.out.println(s1);
		

	}

}
