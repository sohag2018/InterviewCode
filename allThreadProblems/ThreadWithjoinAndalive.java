package allThreadProblems;
/* Example:join(),alive()
 * join() tells the main thread to wait for  other thread to finish their task
 * if we dont use join() then main thread dont wait for other thread
 * isAlive() method returns true if the tread is in execution stage return false when it is dead
 */ 

public class ThreadWithjoinAndalive {

	public static void main(String[] args) throws Exception {
		Thread t1=new Thread(()-> {
			for(int i=0;i<5;i++) {
				System.out.println("good morning !");
				try {Thread.sleep(500);} catch (InterruptedException e) {}  
			}});
		Thread t2=new Thread(()-> {
			for(int i=0;i<5;i++) {
				System.out.println("good afternoon !");
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}});
		t1.start();
		t2.start();
		//System.out.println(t1.isAlive()); //returns true because it is still alive
		t1.join();
		t2.join();
		System.out.println("Good Night"); // we expected it will print last withoud using join() 
		System.out.println(t1.isAlive()); //returns false because it is not alive anymore
	}

}
