package collectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayAndArrayList {

	public static void main(String[] args) {
		//Lets start from array
		int a[]=new int[3]; //declaring size of the array
		a[0]=5;
		a[1]=15;
		a[2]=50;
		//print single index value:
		System.out.println("Printing single index value: "+a[0]);//output: 5
		//print all index value:
		System.out.println("Printing all index value: ");
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);}
		//update value:
		a[0]=55;
		System.out.println("After updating value of [0]: "+a[0]);//now output: 55
		//add value in index[3]:
		//a[3]=9; //as it is fixed in size we can add in index-4->will shoe error
		//copying of another array:
		int b[]=Arrays.copyOf(a, 6); //second argument: declaring size of new array along with old one
		b[3]=60;
		b[4]=65;
		b[4]=68;
		System.out.println("It was value of a[0]:"+b[0]);//55 which was value of a[0]
		
		//Now Lets start ArrayList:
		
		//getting new ArrayList -by default contractor-->initial capacity 10 
		ArrayList ar= new ArrayList();
        ar.add("Sohag"); // in [0]
        ar.add("Tofayel");
        ar.add(5); //different data type is allowed
        ar.add(""); //null is allowed
        ar.add("Farhana");
        ar.add("Orfat");
        ar.add("Rahman");
        ar.add("Imran");
        ar.add(5.5); //duplicate value is allowed
        ar.add('M');
        ar.add(5,"Nafasat"); //replacing value: adding in index [5]
        ar.add(5.5);//------------it is [10]--now capacity will be increased (ic*(3/2)+1=16
        /* now ar[] indext is 16 capacity  when we need to add for 10th index it jvm will create new array with capacity 16
        elements of the prev. array will be shifted to new array & old array will be ready for garbage collection*/
              
        //to see the size
        System.out.println(ar.size());
        //remove()
        ar.remove(1);
        //print by using get()//for single element
        System.out.println(ar.get(0));
        
        //to print all elements (for loop, for each loop, iterator()
        for(int i=0;i<ar.size();i++) {
        	System.out.println(ar.get(i));
        }
        
        //generic comes in java 1.5 -> by defining the type
        ArrayList<String> ar1= new ArrayList();
        ar1.add("Monir");
        
        //user-defined class obj--see the StudyGroup Class
        //Creating obj of the StudyGroup Class by parameterized constructor and passing value:
        StudyGroup s1=new StudyGroup("Muhammad",50,"Tofayel");
        StudyGroup s2=new StudyGroup("Muhammad",40,"Sharif");
        StudyGroup s3=new StudyGroup("Muhammad",30,"Sohag");
        StudyGroup s4=new StudyGroup("Muhammad",30,"Sohag");
        //now we can put the obj of the StudyGroup type obj (s1,s2,s3,s4))
        ArrayList<StudyGroup> ar3=new ArrayList<StudyGroup>();
        ar3.add(s1);
        ar3.add(s2);
        ar3.add(s3);
 
        //print by using for each loop/enhanced for loop/advanced for loop
        for(StudyGroup s 	:ar3) {
        	System.out.println(s.fname+ " "+s.lname+" "+s.age); }
        
        //using->addAll()
        ArrayList ar5=new ArrayList(); //creaing new ArrayList
        ar5.add("A");
        ar5.add("B");
        ar5.add("C");
        
        //applied addAll() in ar[]-->now in ar[] we have also ar5[] value too
        ar.addAll(ar5);
        System.out.println("After using addAll method: ");
        Iterator ar7= ar.iterator();
        while(ar7.hasNext()) {
        	System.out.println(ar7.next());
        }
        
        
        
/*    //removeAll():
          ar.removeAll(ar5);
          Iterator ar8= ar.iterator();
          while(ar7.hasNext()) {
          System.out.println(ar7.next());*/
        
        
        //retainAll()--only keeps common value between two ArrayList obj
        
        	ArrayList<String> ar9=new ArrayList(); //creating new ArrayList
        	ar9.add("Sohag"); //-------this is common
        	ar9.add("Rahman");
        	ar9.add("salma");
        	//apply retainAll():
        	ar.retainAll(ar9);
        	//ar9.retainAll(ar); //we can also do 
        	for(int i=0;i<ar.size();i++) {
        		System.out.println("After using retainAll: "+ar.get(i));
        	}
        	}
	}
