package generic;

import java.util.ArrayList;

//Containeer class is T type which extends Number class so it can be Integer,Double or Float type
class Container2<T extends Number>{
	T value;
	
	public void show() {
		System.out.println(value.getClass().getName());	
	}
	//creating a method which accepts ArrayList(generic)
	//if our generic type is Integer then it will accept only Integer
	//public void show2 (ArrayList<Integer> obj){
	public void show2 (ArrayList<? extends T> obj){
		
	}
	}

public class Generic2 {

	public static void main(String[] args) {
		//specify the type of Container class while creating obj
		//
		Container2<Number> obj= new Container2<>();
		//calling show method to execute but before that we need to assign int value for value varible otherwise it will show nulpointer exceptiong
		obj.value=1;
		obj.show();
		obj.show2(new ArrayList<Integer>());

	}

}
