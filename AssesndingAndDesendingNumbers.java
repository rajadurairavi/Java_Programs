package JavaPrograms;

import java.util.Arrays;

public class AssesndingAndDesendingNumbers {

	public static void main(String[] args) {

		Integer[] a = { 55, 20, 60, 90, 15, 35 };
		
		for(int i=0;i<a.length;i++) {
			for(int j = i+1; j<a.length;j++) {
				
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]= a[j];
					a[j] = temp;
				}
			}
		}


		System.out.println(Arrays.toString(a));
		

	}

}
