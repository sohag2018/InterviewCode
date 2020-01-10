package justForPractice;

import java.util.HashMap;
import java.util.Map;

public class MapSyncronizing implements Runnable {
	// declare a Map type variable:
	Map<String, String> m;

	// creating a constructor when obj created it will initialize above attribute
	public MapSyncronizing(Map<String, String> m) {
		this.m = m;
	}
	
	@Override
	public void run() {
		System.out.println("RunningThread: "+Thread.currentThread().getName());
		String s=Thread.currentThread().getName();
		for(int i=0;i<5;i++) {
			m.put(s, s);
			//try {Thread.sleep(5000);} catch (InterruptedException e) {}
		}
		
	}





	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
    
		//creating some Thread
		
		Thread t1 =new Thread (new MapSyncronizing(map) );
		Thread t2 =new Thread (new MapSyncronizing(map) );
		Thread t3 =new Thread (new MapSyncronizing(map) );
		Thread t4 =new Thread (new MapSyncronizing(map) );
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {t1.join();
		t2.join();
		t3.join();
		t4.join();} catch (InterruptedException e) {}
		
		
		System.out.println("Total number of map:"+map.size());
	}



	

}
