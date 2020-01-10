package justForPractice;

public class ParlindomStringCheck {

	public static void main(String[] args) {
		String org="mada";
		
		String coppy=new StringBuffer(org).reverse().toString();
		
		if(org.equals(coppy)) {
			System.out.println("Yes, it is a parlindom Stering");
		}else {
			System.out.println("No, it is not");
		}

	}

}
