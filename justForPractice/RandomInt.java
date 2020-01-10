package justForPractice;

import java.util.Random;

public class RandomInt {
	
	public static void checkAge(int n) {
		
		if(n<22) {
			System.out.println("Access denied");
		}else {
			System.out.println("Access permited");
		}
		
	}

	public static void main(String[] args) {
		
		checkAge(new Random().nextInt(60));
        


	}

}
