package interviewCoddingQ;
//Q: we have int a []={1,2,3,4,5,6}. printout the distinct pairs of these integers that 
//sum is 7

public class DistingPairFromArray {

	public static void main(String[] args) {
		int a []= {1,2,3,4,5,6};
		
		for(int i=0;i<a.length;i++) {
			//System.out.print(a[i]); //12345
			for(int j=1;j<a.length;j++) {
				//System.out.print(a[j]);//23452345234523452345
				
				if(a[i]+a[j]==7){
					System.out.println(a[i]+"+"+a[j]+"=7");
					}
			}
		}

	}

}
