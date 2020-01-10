package advancedLevelCoding;
/*Problem Description:To check map size (is it equal to method's invoking times/frequency or not)
 *Steps: 1.implements Runnable Interface  2. Create a map 
 *3. override run(): Here we program our plan->get thread's name and use it as our map key and value
 *                   ->use a for loop for looping 50 times to increase our map size
 *                   ->map size should be 50xnumber of threads we use->50x3=150
 *4. in main method: ->create the obj of the class so that we can pass it when Thread will be created
 *                    and we can get access of map variable to print size of the map
 *5.using start() to start thread to invoke run()
 *6.using join() to ensure main thread waits until other threads join  */
import java.util.Hashtable;
import java.util.Map;

public class SyncHashTable implements Runnable {
	// creating map:
	Map<String, String> map = new Hashtable<>();

	// overloading run() for execution (50 times per thread) our code:
	public void run() {
        System.out.println(Thread.currentThread().getName());
		String str = Thread.currentThread().getName(); //storing current thread's name
		for (int i = 0; i <50; i++) {
			map.put(str+i, str+i); // put'thread's name+looping index' together as key and value as it doesnt support duplicate element 
		}
		
	}

	public static void main(String[] args) {
		SyncHashTable sm = new SyncHashTable(); //creating obj of SyncroMapSimple 
        //creating threads
		Thread t1 = new Thread(sm);
		Thread t2 = new Thread(sm);
		Thread t3 = new Thread(sm);
        //start() will invoke run() to execute our code
		t1.start(); 
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// printing size of the map
		System.out.println("Size of Map is " + sm.map.size());
	}
}
