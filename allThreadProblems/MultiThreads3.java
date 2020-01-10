package allThreadProblems;
 
class AX implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("good morning !");
		try {Thread.sleep(500);} catch (InterruptedException e) {}  
	}}
}

class BY implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("good afternoon !");
		try {Thread.sleep(500);} catch (InterruptedException e) {}
	}}
}
public class MultiThreads3 {

	public static void main(String[] args) {
		
		Thread t1=new Thread(new AX());
		Thread t2=new Thread(new BY());
		t1.start();
		t2.start();

	}

}
