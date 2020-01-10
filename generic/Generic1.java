package generic;

//creating my class which is not decided yet which type so we keep it as <T>
//<T> means Type. It will be any type as we use can be String,Integer, Double
class Container<T>{
	//declare a variable as T type
	T value;
	//create a method to show the type of class using .getClass().getName() methods:
	//we can print package name and many more by using specific method
	public void show() {
		System.out.println(value.getClass().getName());
		
	}
	}

public class Generic1 {

	public static void main(String[] args) {
		//specify the type of Container class while creating obj
		Container<Integer> obj= new Container<>();
		//calling show method to execute but before that we need to assign int value for value varible otherwise it will show nulpointer exceptiong
		obj.value=1;
		obj.show();

	}

}
