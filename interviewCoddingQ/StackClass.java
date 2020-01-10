package interviewCoddingQ;

import java.util.Iterator;
import java.util.Stack;

/*The Stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack. 
The stack contains all of the methods of Vector class and also provides its methods like boolean push(),
boolean peek(), boolean push(object o), which defines its properties.*/

public class StackClass {

	public static void main(String[] args) {
		Stack<Integer>st=new Stack<>();
		st.push(10);
		st.add(20);
		st.add(40);
		st.add(30);
		
		
		Iterator<Integer> it=st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
