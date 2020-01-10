package interviewCoddingQ;

public class DimondMaking {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			
			for(int l=0;l<10-i;l++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
            for(int j=0;j<10;j++) {  //2nd outer loopa
			
			for(int n=10;n>10-j;n--) {
				System.out.print(" ");
			}
			
			for(int m=10;m>=j;m--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
