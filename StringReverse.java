package JavaPrograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Reverse : ");
		String original = 	sc.nextLine();
		int length = original.length();
		String reverse = "";
		
		for(int i =length-1;i>=0;i--) {
			reverse = reverse+original.charAt(i);
		}
		
		System.out.println("The Reverse string of "+original + " is "+ reverse);
	}

}
