package justForPractice;

public class CreatingMultiThreadLamraExpression {
	
	
	public static void main(String[] args) {
		Runnable r1=new Runnable() {
			public void run() {
				for(int i=0;i<=5;i++) {
					System.out.println("Good Morning!");
					try {Thread.sleep(500);} catch (InterruptedException e) {}
				}
		}};
		
		Runnable r2=new Runnable() {
			public void run() {
				for(int i=0;i<=5;i++) {
					System.out.println("Good AfterNoon!");
					try {Thread.sleep(500);} catch (InterruptedException e) {}
				}
		}};
		 
		new Thread(r1).start();
		new Thread(r2).start();
		
		
		}
}
