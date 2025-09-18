package JavaPrograms;

import java.util.Scanner;

public class OddOrEvenNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Entered number is "+num);
		
		if(num%2==0) {
			System.out.println("Given number is even number");
		}
		else {
			System.out.println("Given number is odd number");
		}
		
	}

}
