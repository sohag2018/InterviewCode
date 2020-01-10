package goodToKnow;

import java.util.Scanner;

/*Scanner Class is available in java.util package
 * used to obtain the input of primitive type
 */
public class ScannerClassUse {

	public static void main(String[] args) {
		//creating onj of Scanner Class
		Scanner input= new Scanner(System.in); //in represents standard inputstream 
        
		//asking for input from user:
		System.out.println("Pleae type your name");
		String name=input.nextLine();//for String input -> use nextLine()
		System.out.println("Pleae type your Age");
		int age=input.nextInt();//for int input -> use nextInt()
		System.out.println("Pleae type your Gender");
		char gender=input.next().charAt(0);//for char input -> use next().charAt(0)
		System.out.println("Pleae type your ContactNumer");
		long contact=input.nextLong();//for long input -> use nextLong()
		System.out.println("Pleae type your UberRating");
		double uberRating=input.nextDouble();//for double input ->use nextDouble()
		input.close();//just to close Scanner class instance
		//print output
		System.out.println("Hi, Here is my details:  ");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("ContactNumber:"+contact);
		System.out.println("UberRating:"+uberRating);
		
	}

}
