package interviewCoddingQ;

import java.util.Random; 
public class ExceptionHandling3 { 
 public static void func(int n) { 
	 System.out.println(n);
     try { 

         // this will throw ArithmeticException if n is 0 
         int x = 10 / n; 
         int y[] = new int[n]; 

         // this will throw ArrayIndexOutOfBoundsException 
         // if the value of x surpasses 
         // the highest index of this array 
         y[x] = 10; 
         
         System.out.println("No exception arose");
     } 
     catch (Exception e) { 
    	 if(e instanceof ArithmeticException)
         System.out.println("Can't divided by 0/zero"); 
    	 if(e instanceof ArrayIndexOutOfBoundsException)
    		 System.out.println("This index doesnt exist in this array");
     } 
 } 
 public static void main(String a[]) { 
	 Random r = new Random();
	
     func(r.nextInt(20)); //as because of random number every time produce different result in console
 } 
} 