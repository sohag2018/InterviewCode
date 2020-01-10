package interviewCoddigPRACTICE;

public class MissingInArray {
	public static int findMissing(int a[],int n) {
		int i,total;
		total=(n+1)*(n+2)/2;//6*7=42/2=21
		for(i=0;i<n;i++) {
			total=total-a[i]; //21-
		}
		return total;
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,5,6};
		System.out.println(findMissing(a,5));
	}

}
