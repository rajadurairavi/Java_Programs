package JavaPrograms;

import java.util.Scanner;

public class SwapTwoStringsWithoutUsingThirdString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String a =	sc.nextLine(); //Raja
		System.out.println("Enter Second String : ");
		String b =	sc.nextLine(); //Durai
		System.out.println("a value is " +a+ " b value is "+b);
		a = a+b; //Rajadurai
		System.out.println("After joining the a value is "+ a);
		b = a.substring(0,a.length()-b.length()); //Raja
		System.out.println("Now b value is "+ b);
		a= a.substring(b.length()); //Durai
		System.out.println("Now a value is "+ a);
		
		System.out.println("a value is " +a+ " b value is "+b); 
		

	}

}
