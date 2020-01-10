package justForPractice;
//As Runnable is functional Interface we can use Lamra expression
//from java 7 Lamra expression is available
public class CreatingMultiThreadAnnonymousClass {
	
	
	public static void main(String[] args) {
		Runnable r1=()-> {
				for(int i=0;i<=5;i++) {
					System.out.println("Good Morning!");
					try {Thread.sleep(500);} catch (InterruptedException e) {}
				}
		};
		
		Runnable r2=()-> {
				for(int i=0;i<=5;i++) {
					System.out.println("Good AfterNoon!");
					try {Thread.sleep(500);} catch (InterruptedException e) {}
				}
		};
		 
		new Thread(r1).start();
		new Thread(r2).start();
		
		
		}
}
