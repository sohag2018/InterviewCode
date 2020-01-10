package advancedLevelCoding;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SyncronizedHashMap extends Thread {
	// having variable:
	Map<String, String> map;

	// creating constractor (making local variable global)
	SyncronizedHashMap(Map<String, String> map) {
		this.map = map;
	}

	// run() to run the threads
	public void run() {
		// System.out.println("in run mehod"+Thread.currentThread().getName());
		String str = Thread.currentThread().getName();
		for (int i = 0; i < 50; i++) {
			map.put(str + i, str + i); // put key and value in map //i returns int so we add with str
		}
	}

	public static void main(String[] args) {
		// creating map
		Map<String, String> map = Collections.synchronizedMap(new HashMap<>());
		

		// creating obj of Thread and MapSynchro and passing the map key and value
		Thread t1 = new Thread(new SyncronizedHashMap(map));
		Thread t2 = new Thread(new SyncronizedHashMap(map));
        // call start() to start thread
		t1.start();
		t2.start();
        //call join() to ensure main thread waits untill other threads join
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// printing size of the map
		System.out.println("Size of Map is " + map.size()); // we expect 500+500=100
	}
}
