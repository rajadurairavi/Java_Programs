package JavaPrograms;

public class CountOfDigitsInGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234567;
		int count = 0;
		
		while(num>0) {
			
			count ++;
			
			num = num/10;
			
			
		}

		System.out.println("The count of digit in give number is "+ count);
	}

}
