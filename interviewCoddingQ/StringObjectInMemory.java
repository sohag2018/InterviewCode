package interviewCoddingQ;

public class StringObjectInMemory {

	public static void main(String[] args) {
		//--->creating obj by new keyword
		String s1 = new String("Sohag");
		String s2 = new String("Sohag");
		
		//--->creating obj by using ""
//				String s1 = "Sohag";
//				String s2 = "Sohag";
		
		if(s1==s2) {
			
			System.out.println("Both objects are pointing the same ref");
		}else
			System.out.println("Both objects are not pointing the same ref");
		

	
				
	}

}

//Note: When create String obj by using new kewword means obj is creating runtime: first obj is created in String constant pool then also created in Heap area
// 2nd time when we create obj with same value it will not allow to create obj in String Constant pool but in runtime another obj will create in heap


// When we create obj by "" then obj is created in heap but in String constant pool area first obj is created and second time as there is one obj with the same value it reffer same one

