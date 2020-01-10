package interviewCoddingQ;

import java.util.Scanner;

public class InputStreamInteger {

	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		sc.close();
		if(i<22) {
			System.out.println("Access denied. Mr. Sharif you are not adult yet");
		}else if (i==22) {
		System.out.println("Access accepted");
		}else {
			System.out.println("You are too adult");
		}

	}

}
