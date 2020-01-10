package justForPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateDifferentWays {

	public static void main(String[] args) {
		ArrayList<Integer> programs = new ArrayList<>();
		programs.add(1);
		programs.add(2);
		programs.add(3);
		programs.add(4);
		programs.add(5);
		
//		System.out.println("(1:)");
//		programs.forEach(print ->{System.out.print(print);});
//		System.out.println("(2:)");
//	
//		for(int i:programs) {System.out.print(i);}
//		System.out.println("(3:)");
//		
		
		
		ListIterator<Integer>it2=programs.listIterator(programs.size());
		it2.add(6);
		while(it2.hasPrevious()) {System.out.println(it2.previous());}
		
		Iterator<Integer>it=programs.iterator();
		while(it.hasNext()) {System.out.println(it.next());}
		
		
	
	}

}
