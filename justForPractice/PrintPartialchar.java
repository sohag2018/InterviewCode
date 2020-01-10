package justForPractice;

import java.util.Scanner;

public class PrintPartialchar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the String");
		String s=sc.nextLine();
		sc.close();
		System.out.println(s.substring(0,3));

	}

}
