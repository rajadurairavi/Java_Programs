package JavaPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem = 0;
		int rev = 0;
		int num = 212;
		int originalnum = num;
		
		while(num>0) {
			
			
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
			
			
			
		}
		System.out.println("Reverse number is : " +rev);
		
		if (originalnum == rev) {
			System.out.println("Given number is Palindrome Number");
		}else {
			System.out.println("Given number is Not Palindrome Number");
		}


	}

}
