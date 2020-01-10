package interviewCoddingQ;
//A sample Java code with a try catch block 
//where the try block has only one catch block 
//to handle all possible exceptions 

//importing class Random to generate a random number as input 
import java.util.Random; 
public class ExceptionHandling2 { 
 public static void func(int n) 
 { 
     try { 

         // this will throw ArithmeticException if n is 0 
         int x = 10 / n; 
         int y[] = new int[n]; 

         // this will throw ArrayIndexOutOfBoundsException if the value of x surpasses the highest index of this array 
         y[x] = 10; 
         
         System.out.println("No exception arose");
     } 
     catch (ArithmeticException f) { 
         System.out.println("Dividing by 0"); 
     } 
     catch (ArrayIndexOutOfBoundsException e) { 
    	 System.out.println("That index doesn't exist"); 
     } 
     
 } 
 public static void main(String a[]) 
 { 
     func(new Random().nextInt(5)); 
 } 
} 