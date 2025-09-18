package JavaPrograms;

public class MissingNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,4,5}; //missing number in an array
		
		int n = 5;
		
		int totalsum = n*(n+1)/2;
		
		int actualsum = 0;
		
		for(int num  : arr) {
			
			actualsum = actualsum +num;
			
		}
		
		int missing =totalsum-actualsum;
		
		System.out.println(missing);

	}

}
