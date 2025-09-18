package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddEditRemoveInArryList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		
		System.out.println(arr); // [10, 20, 30, 40, 50]
		
		arr.add(70);
		
		System.out.println(arr);  // [10, 20, 30, 40, 50, 70]
		
		arr.add(1,25);
		
		System.out.println(arr);  // [10, 25, 20, 30, 40, 50, 70]
		
		arr.set(0, 15);
		
		System.out.println(arr);  // [15, 25, 20, 30, 40, 50, 70]
		
		arr.remove(5);
		
		System.out.println(arr);  // [15, 25, 20, 30, 40, 70]
	}


}
