package justForPractice;

public class BigestNumerInArray {

	public static void main(String[] args) {
		int a[]= {1,20,5,10,8,13,6};
		int b=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=1;j<a.length-1;j++) {
			if(a[i]>a[j]) {
				b=a[i];
			}else {
				b=a[j];
			}
			}
		}
        System.out.println(b);
	}

}
