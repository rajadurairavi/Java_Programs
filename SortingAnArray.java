package JavaPrograms;
import java.util.Arrays;
import java.util.Collections;

public class SortingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {12,5,78,34,90,2};
		Integer[] input  = {13,5,78,34,90,2};
		System.out.println("Original Array : "+ Arrays.toString(num));
		
		Arrays.sort(num);
		
		System.out.println("Sorted Array : "+ Arrays.toString(num));
		
		Arrays.sort(input, Collections.reverseOrder());
		
		System.out.println("Sorted in reverse order "+ Arrays.toString(input));
		
		for(int i =0;i<=num.length-1;i++) {
			
			System.out.print(num[i]+ " ");
		}
		
		
		
		

	}

}
