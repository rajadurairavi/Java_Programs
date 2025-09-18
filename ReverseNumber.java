package JavaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rem = 0;
		int rev = 0;
		int num = 234;
		
		while(num>0) {
			
			
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
			
			
			
		}
		System.out.println(rev);

	}

}
