package extraLesson;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoopingPerformanceMeasure {
	// creat a static method to create array
	static String[] createArray() {
		String a[] = new String[500000];
		for (int i = 0; i < 5000; i++) {
			a[i] = "Array " + i;
		}
		return a;
	}

	public static void main(String[] args) {

		String b[] = createArray();
		// convert array to list
		List<String> l = Arrays.asList(b);

		System.out.println("(1)Iterator loop-------");
		long iteratorStart = new Date().getTime(); // return iterator start time
		System.out.println("Start Time:" + iteratorStart);

		// Iterator looping
		Iterator<String> i = l.iterator();
		while (i.hasNext()) {
			String s1 = i.next(); // we are not printing just put in a variable
		}

		long iteratorEnd = new Date().getTime(); // return iterator start time
		System.out.println("End Time:" + iteratorEnd);

		// measuring time

		System.out.println("Iterator Takes: " + (iteratorEnd - iteratorStart) + " mili seconds");

		System.out.println("(2)For loop-------");
		long forLoopStart = new Date().getTime(); // return forloop start time
		System.out.println("Start Time:" + forLoopStart);

		// for looping
		for (int j = 0; j < l.size(); j++) {
			String s2 = (String) l.get(j);
		}

		long forLoopEnd = new Date().getTime(); // return forloop start time
		System.out.println("End Time:" + iteratorEnd);

		// measuring time

		System.out.println("for loop Takes: " + (forLoopEnd - forLoopStart) + " mili seconds");

	}

}
