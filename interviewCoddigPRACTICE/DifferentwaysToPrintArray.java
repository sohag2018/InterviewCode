package interviewCoddigPRACTICE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DifferentwaysToPrintArray {

	public static void main(String[] args) {
	ArrayList<String> program = new ArrayList<>();
	program.add("Games of throne");
	program.add("KBC");
	program.add("Chayachado");
	program.add("Ittadi");
	
	//1. using java 8 with forEach() and lamba expression
	System.out.println("1. using java 8 with forEach() and lamba expression:");
	program.forEach(shows ->{
		System.out.println(shows);
	});
	
	//2. using iterator()
	System.out.println("2. using iterator(): ");
	
	Iterator<String> it=program.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	//3. using iterator() and java 8 for forEachRemaing() and lamba expression
System.out.println("3. using iterator() and java 8 for forEachRemaing() and lamba expression:");

program.iterator().forEachRemaining(show2 ->{
	System.out.println(show2);
});

//4. Using for each loop
System.out.println("4. Using for each loop:");

for (String show3:program) {
	System.out.println(show3);
	
}

//5.Using for loop with order/index
System.out.println("5.Using for loop with order/index:");

for(int i=0;i<program.size();i++) {
	System.out.println(program.get(i));
}

//6. using listIterator()
System.out.println("6. using listIterator()");
ListIterator<String> lt=program.listIterator(program.size());
while(lt.hasPrevious()) {
	System.out.println(lt.previous());
	
}

	}

}
