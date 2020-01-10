package advancedLevelCoding;
/*Problem Description:To see map size
 *Steps: Have a Map type variable to store map elements
 *       Creating constractor to make the local variable global so we get value when obj is created
 *       
 */
import java.util.HashMap;
import java.util.Map;

public class MapSynchro implements Runnable{
    //having variable:
	Map<String,String> testMap;   //we will get value map when obj will be created
	//creating contractor (making local variable global)
	MapSynchro(Map<String,String> testMap) {
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
		Map<String,String> map = new HashMap<>();
        //creating obj MapSynchro and passing the value of testMap varibale
		MapSynchro ms=new MapSynchro(map);
		//creating 2 Threads 
		Thread t1 = new Thread(ms);
		Thread t2 = new Thread(ms);
		
		
		t1.start();
		t2.start();
	
		try {
			t1.join();
			t2.join();
			} catch (InterruptedException e) {
			e.printStackTrace();}
		//printing size of the map
		System.out.println("Size of Map is "+map.size());
		}}
