package interviewCoddigPRACTICE;

public class MissingMultipleNumber {

	public static void main(String[] args) {
		//given array:
		int a[]= {1,1,2,3,3,5,7,7};
		// let's create another array with same length 
		// by default all index will contain zero 
		int b[]=new int[a.length];
		// now let's iterate over a[] to mark all present numbers in b [] 

		for(int i:a) {
			b[i]=1; //put 1 just to mark so that we can do separate
		}

		//new we can find the missing numbers from a[]
        
		for(int i=1;i<b.length;i++) {
			if(b[i]==0) 
				System.out.println(i);
			
		}
	}

}
