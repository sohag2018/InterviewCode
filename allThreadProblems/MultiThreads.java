package allThreadProblems;
/* Note: We will learn basic of Thread and create simple program
 * By default we have 1 Thread that is called Main 
 * all we do in our program/code is executed by Main Thread
 * we write  System.out.println("My name is Sohag") is executed by main
   
 *  "In this example we didnt create thread. See next example"
 *  This example is showing if we do it by only main thread both prorams are not being executed parallel
    if there is no dependency we can execute parralel by multi Threads. Lets see in next example
 */ 

//Lets have two classes A class and B Class  and our intention to print do their functions 5 times
class A{
	public void greets() {
		for(int i=0;i<5;i++) {
		System.out.println("good morning !");
		//try {Thread.sleep(500);} catch (InterruptedException e) {}  
	}}
}

class B{
	public void greets() {
		for(int i=0;i<5;i++) {
		System.out.println("good afternoon !");
		//try {Thread.sleep(500);} catch (InterruptedException e) {}
	}}
}
public class MultiThreads {

	public static void main(String[] args) {
		
		new A().greets();
		new B().greets();

	}

}
