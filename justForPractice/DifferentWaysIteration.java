package justForPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DifferentWaysIteration {

	public static void main(String[] args) {
		//lets have our ArrayList
		int i;
		ArrayList<String> programs = new ArrayList<>();
		
		programs.add("a");
		programs.add("b");
		programs.add("c");
		programs.add("d");
		
//1. using forEach() and Lamba expression
		programs.forEach(show ->{
			System.out.println(show);});
		
		System.out.println("_______________________________________________________________");
		
//2. using iterator()
		Iterator<String>it=programs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("_______________________________________________________________");
		
//3. using forEachRemaaining() in iterator and lamba expression
		
		programs.iterator().forEachRemaining(show2 ->{
			System.out.println(show2);
		});
		System.out.println("_______________________________________________________________");
//4. using listIterator() in ListIterator
		
		 ListIterator<String> lt=programs.listIterator(programs.size());
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
//5. using for each loop
		
		for(String s:programs) {
			System.out.println(s);
			
		}
		System.out.println("6_______________________________________________________________");
//6. using for loop
		for(i=programs.size()-1; i>0;i--) {
			System.out.println(programs.get(i));
		}
	}

}
