package interviewCoddingQ;
public class MainOverloading {
	public static void main(String[] args) {
		System.out.println("Employee details are given here:");
		//based on parameter value overloaded main methods are calling
		main("Sohag");
		main(40);
		main('M');	
	}
		
public static void main(String name) {
		String eName=name;
System.out.print("Name: "+eName);
	}
public static void main(int age) {
	int eAge=age;
	System.out.print(", Age: "+eAge);
}
public static void main(char sex) {
	char eSex=sex;
	System.out.print(", Sex: "+eSex);
}
}
