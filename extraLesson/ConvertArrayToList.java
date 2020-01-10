package extraLesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {
		// There is a method in java.util.Array class-->asList() we can use to convert

		String a[] = new String[] { "Sohag", "Monir", "Sharif", "Tufayel" };
		System.out.println(a[0]);// we can print only specific index value
		List<String> al = Arrays.asList(a);
		System.out.println(al); // now we can print whole list
	}

}
