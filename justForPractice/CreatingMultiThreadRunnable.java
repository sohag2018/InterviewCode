package justForPractice;
//Create a class A which extends Thread Class
class AA implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Good Morning!");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

//Create another class B which also extends Thread Class
class BB extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Good AfterNoon!");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}
public class CreatingMultiThreadRunnable {

	public static void main(String[] args) {
		
		new Thread(new AA()).start();
		new Thread(new BB()).start();
		
		

	}

}
