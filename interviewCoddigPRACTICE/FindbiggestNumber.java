package interviewCoddigPRACTICE;

public class FindbiggestNumber {

	public static void main(String[] args) {
		int[] a= {5,10,25,12,30};
		
		int number=0;

		for(int i=0;i<=a.length-1;i++) {
			for(int j=1;j<a.length-1;j++) {
				if(a[i]>a[j]) {
					number=a[i];
				}
			}
			
		}
		
		System.out.println(number);
	}

}
