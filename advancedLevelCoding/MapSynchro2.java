package advancedLevelCoding;

import java.util.HashMap;
import java.util.Map;

public class MapSynchro2 extends Thread{
    //having variable:
	Map<String,String> testMap;
	//creating contractor (making local variable global)
	MapSynchro2(Map<String,String> testMap) {
		this.testMap=testMap;
	}
	// run() to run the threads
	public void run() {
		//System.out.println("in run mehod"+Thread.currentThread().getName());
		String str=Thread.currentThread().getName();
		for(int i=0;i<50;i++) {
			testMap.put(str+i, str+i);
			
		}}


	public static void main(String[] args) {
		//creating map
		Map<String,String> testMap = new HashMap<>();
		
		
        //creating obj of Thread and MapSynchro and passing the map key and value
		Thread t1 = new Thread(new MapSynchro2(testMap));
		Thread t2 = new Thread(new MapSynchro2(testMap));
		
		t1.start();
		t2.start();
	
		try {
			t1.join();
			t2.join();
			} catch (InterruptedException e) {
			e.printStackTrace();}
		//printing size of the map
		System.out.println("Size of Map is "+testMap.size());
		}}
