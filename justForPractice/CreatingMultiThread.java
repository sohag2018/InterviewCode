package justForPractice;
//Create a class A which extends Thread Class
class A extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Good Morning!");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

//Create another class B which also extends Thread Class
class B extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Good AfterNoon!");
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}
public class CreatingMultiThread {

	public static void main(String[] args) {
		new A().start(); //as A class extends Thread Class so we access start() it will invoke run() internall
		new B().start();// we dont need to call run() to print 

	}

}
