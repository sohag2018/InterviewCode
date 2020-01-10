package interviewCoddingQ;

public class EqalMethodAndDoubleEqualOperator {

	public static void main(String[] args) {
		//--->creating obj by new keyword
		String s1 = new String("Sohag");   // z
		//String s2 = new String("Sohag");
		String s3=s1.concat(" Ahmed");
		System.out.println(s3);
		
		
		
//		System.out.println(s1==s2);  //false -->not pointing same reference (we are comparing ref/address not value or content
//		System.out.println(s1.equals(s2));  //true-->pointing same content (we are comparing content not ref/address
//		
//		//--->creating obj by using ""--> so, pointing to the same ref in string pool
//		String s3 = "Sohag";
//		String s4 = "Sohag";
//	
//		
//		System.out.println(s3==s4);  //true -->pointing same reference (we are comparing ref/address not value or content
//		System.out.println(s3.equals(s4));  //true-->pointing same content (we are comparing content not ref/address
//				
	}

}

//Note: When create String obj by using new kewword means obj is creating runtime: first obj is created in String constant pool then also created in Heap area
// 2nd time when we create obj with same value it will not allow to create obj in String Constant pool but in runtime another obj will create in heap


// When we create obj by "" then obj is created in heap but in String constant pool area first obj is created and second time as there is one obj with the same value it reffer same one



//How to open new tab in same browser in selenium------>.sendKeys(Keys.CONTROL+"t");
//How to open new browser in selenium------>.sendKeys(Keys.CONTROL+"t");
//How to perform ctrl+a (select all) in selenium------>.sendKeys(Keys.chord(Keys.CONTROL, "a"));






