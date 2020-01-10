package allThreadProblems;
/* Example:Print name using getName(), 
 * Change the name 1. using setName("newName")  for t1 obj First-Thread
   2.Name it when create the obj of Thread in this example as 2nd parameter we pass the name 
   when created obj of thread->for t2 obj "Second-Thread"
 * Set priority-by default priority is 5 (normal) check by using getPriority()
 * 1 is the least priority and 10 is the highest priority
  
 */ 

public class ThreadWithPriority {

	public static void main(String[] args) {
		Thread t1=new Thread(()-> {
			for(int i=0;i<5;i++) {
				System.out.println("good morning !");
				try {Thread.sleep(500);} catch (InterruptedException e) {}  
			}});
		Thread t2=new Thread(()-> {
			for(int i=0;i<5;i++) {
				System.out.println("good afternoon !");
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}},"Second-Thread");
//		System.out.println(t1.getName());//return default name "Thread-0"
		t1.setName("First-Thread");
		System.out.println(t1.getName());//return changed name "First-Thread"
		System.out.println(t2.getName());//return changed name "SecondThread"
		//t1.start();
		//t2.start();
		
	}
}
