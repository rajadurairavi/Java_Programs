package JavaPrograms;

public class MultiplicationOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int rem = 0;
		int rev =1;
		int num = 222;
		int Number = num;
		
		
		while(num>0) {
			
			rem = num%10;
			rev = rev*rem;
			num = num/10;
		}
		
		System.out.println("The multiplication of given number is "+ rev);
		
	}	

}
