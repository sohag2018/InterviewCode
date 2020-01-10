package allThreadProblems;
/* THIS EXAMAPLE IS CONTINUTION OF PREV EXAMPLE-using Lambda expression
 * ->instead of using Runnable obj we direcly pass code directly in Thread obj creation time 
 */ 

public class MultiThreadsLambaExpression2 {

	public static void main(String[] args) {
		
		Thread t1=new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("good morning !");
				try {Thread.sleep(500);} catch (InterruptedException e) {}  
			}});
		Thread t2=new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("good afternoon !");
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}});
		t1.start();
		t2.start();

	}

}
