package interviewCoddingQ;

import java.util.Scanner;

public class IntNumCount {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num=new Scanner (System.in).nextInt();
		int count=0;
		while (num>0) {
		num=num/10;  //logic is this line each time eliminate last digit and revise the num ex: 1234 -->123 then -->12 finaly-->0; and loop becomes false
		count++; //each time count will increase by 1 
		}
		System.out.println(count);
	}

}
