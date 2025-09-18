package JavaPrograms;

import java.util.Iterator;

public class Largest_SmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {10,20,30,40,50};
		
		int max = num[0]; //assume first value as largest value, for now it is 10
		
		for(int i=0; i<=num.length-1;i++) {
			
			if(num[i]> max) {
				max = num[i];
			}
		}
		
		System.out.println("The largest value is : " + max);
		
		System.out.println("**************************************");
		
		int min = num[0]; //Assume first value is smallest value
		
		for(int i=0;i<=num.length-1;i++) {
			
			if(num[i]<min) {
				min = num[i];
			}
		}
		
		System.out.println("The Lowest value in this array : "+ min);
		

	}

}
