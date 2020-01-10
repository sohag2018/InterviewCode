package interviewCoddingQ;

import java.util.Random; 
public class CheckAgeRandomNumber { 
 public static void func(int n) {
	 if(n<22) {
			System.out.println("Access denied");
		}else {
			System.out.println("Access permited");
		}
 
     } 
 
 public static void main(String a[]) 
 { 
     func(new Random().nextInt(30)); 
 } 
} 