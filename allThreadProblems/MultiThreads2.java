package allThreadProblems;
/* THIS EXAMAPLE IS CONTINUTION OF PREV EXAMPLE
 *  WE WILL CREATE MULTIPLE THREADS HERE by extending Thread class
 *  In NEXT EXAMPLE we will do IMPLEMENTING Runnable Interface
 *  ->both X and Y classes extend Thread class so These classes become Thread
 *  ->we need to use start() to start Thread but for that we need to call run() because, 
 *  when we call start() internally Thread execute run()
 *  ->change the method name instaed of greets()-->run() that means we override run() to perform our task
 *  ->now time to use Thread.sleep() otherwise it will not work parallel
 *  
 *  We can see good morning or good afternoon printed together because scheduler chose random thread
 *  as there is no wait and no priority so  when we call start() thread is chosen randomly. lets put wait and see the difference
 */ 


class X extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("good morning !");
		try {Thread.sleep(5000);} catch (InterruptedException e) {}  
	}}
}

class Y extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("good afternoon !");
		try {Thread.sleep(500);} catch (InterruptedException e) {}
	}}
}
public class MultiThreads2 {

	public static void main(String[] args) {
		new X().start();
		new Y().start();

	}

}
