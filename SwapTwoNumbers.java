package JavaPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a =100; int b =200;
		
		System.out.println(a +" and " +b);
		
		a = a+b; // a = 100+200 = 300;
		b= a-b;  // b = 300 - 200 = 100
		a = a-b; // a = a = 300 - 100 = 200
		
		System.out.println("a value is: "+a +" b value is " +b);
		
	}
}
