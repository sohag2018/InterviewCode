package allThreadProblems;
/* THIS EXAMAPLE IS CONTINUTION OF PREV EXAMPLE-using Lambda expression
 * 
 */ 

public class MultiThreadsLambaExpression {

	public static void main(String[] args) {
		Runnable r1=()->{
			for(int i=0;i<5;i++) {
				System.out.println("good morning !");
				try {Thread.sleep(500);} catch (InterruptedException e) {}  
			}};
 			
			Runnable r2=()->{
				for(int i=0;i<5;i++) {
					System.out.println("good afternoon !");
					try {Thread.sleep(500);} catch (InterruptedException e) {}
				}};
			
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();

	}

}
