package JavaPrograms;

import java.util.Arrays;

public class ZerosLeftAndRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,0,2,0,3,0,4};
		int[] result = new int[a.length];
		int index = 	a.length-1;
		
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]!=0) {
				result[index] = a[i];
				index --;
			}
		}
		
		System.out.println(Arrays.toString(result));
	}
	
//	public static void main(String[] args) {
//		
//		int[] a = {2,0,4,0,6,0,7};
//		int[] result = new int[a.length];
//		int index = 0;
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]!=0) {
//				result[index]= a[i];
//				index++;
//			}
//		}
//		
//		
//		
//		System.out.println(Arrays.toString(result));
//		
//	}

}
