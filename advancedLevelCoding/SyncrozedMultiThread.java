package advancedLevelCoding;


//1.simple class for crating program for having incremented count value:
class Counter{  //-->we cant make it public because its not have itw own file
	//declare a variable
	int count;
	//create the method to increase the value of count by +1 when it is called
	public synchronized void  increament() { //try this making synchronized and not syncronized
		count++;
	}
}

public class SyncrozedMultiThread {
	
public static void main(String[]args) throws Exception {
		//creating obj of Counter class
	    Counter c= new Counter();
	    
	    //creating 1st Threads it will call increament() for 1000 times
	    Thread t1=new Thread(new Runnable() {
	    	public void run() { //-->must create run()
	    		for(int i=1;i<=1000;i++) {
	    			c.increament();
	    		} //-->for loop close here
	    		}// method closing 	    	
	            }//Runnable body closing
	    		); //Thread closing
	    
	    t1.start();//thread start
	    t1.join();// thread waits (asked for exception)
	    
	  //creating 2nd Threads it will call increament() for 1000 times
	    Thread t2=new Thread(new Runnable() {
	    	public void run() { //-->must create run()
	    		for(int i=1;i<=1000;i++) {
	    			c.increament();
	    		} //-->for loop close here
	    		}// method closing 	    	
	            }//Runnable body closing
	    		); //Thread closing
	    
	    t2.start();
	    t2.join();
	    
	    System.out.println(c.count); // we expect count should be 2000 but if it is not sycronized then it will not
	   
	}//main method body closing
}